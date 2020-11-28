package com.example.backgroundfab;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class FloatingService extends Service {

    FloatingViewManager floatingViewManager;

    IBinder mBinder = new FloatingBinder();

    public class FloatingBinder extends Binder {     // Binder 상속(Binder 는 IBinder interface 를 구현)
        FloatingService getService(){
            return FloatingService.this;      // 현재 Service 객체를 리턴
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        // Service 객체와 (화면단 Activity 사이에서) 데이터를 주고받을 때 사용하는 메소드
        // Activity 에서 bindService()를 실행하면 호출됨.
        // data 를 전달할 필요 없으면 null 값 리턴.
        Log.d("myLog", "Service: onBind()");
        return mBinder;     // 리턴할 mBinder 객체는 서비스와 클라이언트 사이의 인터페이스 정의
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("myLog", "Service: onCreate()");
        init();
    }

    void init(){
        floatingViewManager = new FloatingViewManager(this);
        floatingViewManager.create();
        floatingViewManager.initLayoutParams();
    }

    void showView(){
        floatingViewManager.addView();
    }

    void hideView(){
        floatingViewManager.removeView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        if(floatingViewManager != null) {
            floatingViewManager.removeView();
            floatingViewManager = null;
            Log.d("myLog", "myService onDestroy()");
        }
    }
}
