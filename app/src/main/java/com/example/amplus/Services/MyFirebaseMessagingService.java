package com.example.amplus.Services;

import androidx.annotation.NonNull;

import com.example.amplus.Common;
import com.example.amplus.Utils.UserUtils;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;
import java.util.Random;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        if (FirebaseAuth.getInstance().getCurrentUser() != null)
        {
            UserUtils.updateToken(this, token);

        }
    }

    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Map<String,String> dataRecv = remoteMessage.getData();
        if (dataRecv != null){
            Common.showNotificarion(this, new Random().nextInt(),
            dataRecv.get(Common.NOTI_TITLE),
                    dataRecv.get(Common.NOTICONTENT),
                    null
            );
        }
    }
}
