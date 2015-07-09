package com.example.pitest;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

public class MainActivity extends Activity {
	private GestureDetector mDoubleTapGesture;
	int x;
	int y;
	int mouse_value;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(new TouchEventView(this));
		setContentView(R.layout.activity_main);

		Context context = this.getApplicationContext();
		mDoubleTapGesture = new GestureDetector(context, mNullListener); // ������ ������ ����
		mDoubleTapGesture.setOnDoubleTapListener(mDoubleTapListener); // ���� �� ������ ���
	}

	// �ƹ��͵� ���ϴ� ������ ������
	private OnGestureListener mNullListener = new OnGestureListener() {
		@Override
		public boolean onSingleTapUp(MotionEvent e) {
//			Log.i("OnGestureListener", "onSingleTapUp  11");
			return false;
		}

		@Override
		public void onShowPress(MotionEvent e) {
//			Log.i("OnGestureListener", "onShowPress  22 ");
		}

		@Override
		public boolean onScroll(MotionEvent e1, MotionEvent e2,
				float distanceX, float distanceY) {
//			Log.i("OnGestureListener", "onScroll  33");
			return false;
		}

		@Override
		public void onLongPress(MotionEvent e) {
//			Log.i("OnGestureListener", "onLongPress  44");
		}

		@Override
		public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
				float velocityY) {
//			Log.i("OnGestureListener", "onFling  55");
			return false;
		}

		@Override
		public boolean onDown(MotionEvent e) {
//			Log.i("OnGestureListener", "onDown   66");
			return false;
		}
	};

	// ������ ������
	private OnDoubleTapListener mDoubleTapListener = new OnDoubleTapListener() {
		@Override
		public boolean onSingleTapConfirmed(MotionEvent e) {
			Log.i("One Click Event", "onSingleTapConfirmed");
			x = (int) e.getY();
			y = (int) e.getY();
			mouse_value = 1;	// one click value
			
			//Send to Raspberry (x, y, value)
			
			return false;
		}

		@Override
		public boolean onDoubleTapEvent(MotionEvent e) {
//			Log.i("OnDoubleTapListener", "onDoubleTapEvent    2");
			return false;
		}

		@Override
		public boolean onDoubleTap(MotionEvent e) {
			Log.i("Double Click Event", "onDoubleTap");
			x = (int) e.getY();
			y = (int) e.getY();
			mouse_value = 2;	// double click value
			
			// Send to Raspberry (x, y, value)
			
			return true;
		}
	};

	@Override
	public boolean onTouchEvent(MotionEvent e) {
		if (mDoubleTapGesture != null) {
			mDoubleTapGesture.onTouchEvent(e); // ����ó�� �����Ǹ� �ν�, ���.
//			Log.i("onTouchEvent", "mDoubleTapGesture");

		}
		/*
		 * ��ġ �̺�Ʈ ���� ����
		 */
		return super.onTouchEvent(e);
	}
}
