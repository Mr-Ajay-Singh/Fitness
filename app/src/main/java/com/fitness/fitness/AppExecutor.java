package com.fitness.fitness;

import android.os.Looper;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Handler;

public class AppExecutor {
    private static AppExecutor sInstance;

    private Executor mDiskIO,mNetworkIO,mMainThreadIO;
    private AppExecutor(Executor executor1,Executor executor2){
        this.mDiskIO = executor1;
        this.mNetworkIO = executor2;
    }

    public static AppExecutor getsInstance()
    {
        if(sInstance == null)
        {
                sInstance = new AppExecutor(Executors.newSingleThreadExecutor(), Executors.newFixedThreadPool(3));
        }

        return sInstance;

    }
    public Executor getmDiskIO() {
        return mDiskIO;
    }

    public Executor getmNetworkIO() {
        return mNetworkIO;
    }
    /*private static class MainThreadExecutor implements Executor{

        private Handler handler = new Handler(Looper.getMainLooper());
        @Override
        public void execute(Runnable runnable) {
                handler.post(runnable);
        }
    } */
}
