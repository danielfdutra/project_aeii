
package com.toyknight.aeii.net;

import java.io.Serializable;

/**
 * @author toyknight
 */
public class Request implements Serializable {

    private static final long serialVersionUID = 10272015L;

    public static final int AUTHENTICATION = 0x0;

    public static final int LIST_ROOMS = 0x1;

    public static final int JOIN_ROOM = 0x2;

    public static final int START_GAME = 0x3;

    public static final int CREATE_ROOM = 0x4;

    public static final int RESUME_GAME = 0x5;

    private final int type;

    private final long id;

    private Object[] params;

    public Request() {
        this(-1, -1);
    }

    public Request(int type, long id) {
        this.type = type;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public long getID() {
        return id;
    }

    public void setParameters(Object... params) {
        this.params = params;
    }

    public Object getParameter(int index) {
        return params[index];
    }

    public static Request getInstance(int type) {
        return new Request(type, System.currentTimeMillis());
    }

}
