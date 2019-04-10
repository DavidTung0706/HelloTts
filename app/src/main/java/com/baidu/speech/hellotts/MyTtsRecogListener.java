package com.baidu.speech.hellotts;

import android.os.Handler;

import com.baidu.aip.asrwakeup3.core.recog.RecogResult;
import com.baidu.aip.asrwakeup3.core.recog.listener.MessageStatusRecogListener;
import com.baidu.speech.hellotts.control.MySyntherizer;

public class MyTtsRecogListener extends MessageStatusRecogListener {
    private MySyntherizer mySyntherizer;

    public MyTtsRecogListener(Handler handler,MySyntherizer mySyntherizer) {
        super(handler);
        this.mySyntherizer = mySyntherizer;
    }
    //識別成功

    @Override
    public void onAsrFinalResult(String[] results, RecogResult recogResult) {
        super.onAsrFinalResult(results, recogResult);
        mySyntherizer.speak(results[0]);
    }
}
