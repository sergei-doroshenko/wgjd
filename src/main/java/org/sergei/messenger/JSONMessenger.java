package org.sergei.messenger;

/**
 * Created by sergei on 12/3/15.
 */
public class JSONMessenger implements Messenger {
    public String getMessage() {
        return "{message: 'hello'}";
    }
}
