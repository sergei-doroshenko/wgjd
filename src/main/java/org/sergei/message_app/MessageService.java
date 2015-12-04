package org.sergei.message_app;

import com.google.inject.Inject;
import org.sergei.message_app.messenger.Messenger;

import javax.inject.Named;

/**
 * Created by sergei on 12/3/15.
 */
public class MessageService {
    private Messenger messenger;

    @Inject
    public MessageService(@Named("xml") Messenger messanger) {
        this.messenger = messanger;
    }

    public String getMessage() {
        return messenger.getMessage();
    }
}
