package com.datdo.mobilib.test.carrier;

import java.util.Map;

import android.content.Context;
import android.view.View;

import com.datdo.mobilib.carrier.MblInterceptor;
import com.datdo.mobilib.test.R;

public class Interceptor1 extends MblInterceptor {

    public Interceptor1(Context context, Map<String, Object> extras) {
        super(context, extras);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setContentView(R.layout.interceptor_1);

        findViewById(R.id.button).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                startInterceptor(Interceptor2.class, "text", "From Interceptor 1");
            }
        });
    }
}
