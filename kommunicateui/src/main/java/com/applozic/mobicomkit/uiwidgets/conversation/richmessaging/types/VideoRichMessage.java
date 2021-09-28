package com.applozic.mobicomkit.uiwidgets.conversation.richmessaging.types;

import android.content.Context;
import android.util.Log;
import android.widget.LinearLayout;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.applozic.mobicomkit.api.conversation.Message;
import com.applozic.mobicomkit.uiwidgets.AlCustomizationSettings;
import com.applozic.mobicomkit.uiwidgets.conversation.richmessaging.KmRichMessage;
import com.applozic.mobicomkit.uiwidgets.conversation.richmessaging.adapters.KmImageRMAdapter;
import com.applozic.mobicomkit.uiwidgets.conversation.richmessaging.adapters.KmRichMessageAdapterFactory;
import com.applozic.mobicomkit.uiwidgets.conversation.richmessaging.adapters.KmVideoRMAdapter;
import com.applozic.mobicomkit.uiwidgets.conversation.richmessaging.callbacks.KmRichMessageListener;
import com.applozic.mobicomkit.uiwidgets.kommunicate.utils.KmThemeHelper;

public class VideoRichMessage extends KmRichMessage {
    public VideoRichMessage(Context context, LinearLayout containerView, Message message, KmRichMessageListener listener, AlCustomizationSettings alCustomizationSettings) {
        super(context, containerView, message, listener, alCustomizationSettings);
    }

    @Override
    public void createRichMessage(boolean isMessageProcessed) {
        super.createRichMessage(isMessageProcessed);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        videoTemplateRecycler.setLayoutManager(layoutManager);
        KmVideoRMAdapter imageAdapter = (KmVideoRMAdapter) KmRichMessageAdapterFactory.getInstance().getRMAdapter(context, model, listener, message, KmThemeHelper.getInstance(context, alCustomizationSettings), isMessageProcessed);
        videoTemplateRecycler.setAdapter(imageAdapter);
        Log.i("Video","reached RMVmT");
    }
}