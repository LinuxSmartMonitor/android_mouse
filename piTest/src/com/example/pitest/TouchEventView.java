//package com.example.pitest;
//
//import android.content.Context;
//import android.graphics.BitmapFactory;
//import android.graphics.Canvas;
//import android.graphics.Color;
//import android.graphics.Paint;
//import android.util.Log;
//import android.view.GestureDetector.OnDoubleTapListener;
//import android.view.MotionEvent;
//import android.view.View;
//
//public class TouchEventView extends View {
//	int x;
//	int y;
//	String str = "Empty";
//
//	public TouchEventView(Context context) {
//		super(context);
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	protected void onDraw(Canvas canvas) {
//		// TODO Auto-generated method stub
//		canvas.drawBitmap(BitmapFactory.decodeResource(getResources(),
//				R.drawable.pimonitor), x, y, null);
//		Paint p = new Paint();
//		p.setTextSize(25);
//		p.setColor(Color.BLACK);
//		canvas.drawText("이벤트 좌표 X : " + x + " , Y : " + y + "\n\n", 0, 20, p);
//		canvas.drawText("이벤트액션 : " + str, 0, 40, p);
//	}
//
//	@Override
//	public boolean onTouchEvent(MotionEvent event) {
//		// TODO Auto-generated method stub
//		x = (int) event.getX();
//		y = (int) event.getY();
//
//		if (event.getAction() == MotionEvent.ACTION_DOWN) {
//			str = "ACTION_DOWN";
//		}
//		if (event.getAction() == MotionEvent.ACTION_MOVE) {
//			str = "ACTION_MOVE";
//		}
//		if (event.getAction() == MotionEvent.ACTION_UP) {
//			str = "ACTION_UP";
//		}
//
//		invalidate();
//		return true;
//
//	}
//
//}
