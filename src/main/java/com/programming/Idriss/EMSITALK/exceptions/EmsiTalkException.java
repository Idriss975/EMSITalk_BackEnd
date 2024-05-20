package com.programming.Idriss.EMSITALK.exceptions;

public class EmsiTalkException extends RuntimeException {
    public EmsiTalkException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public EmsiTalkException(String exMessage) {
        super(exMessage);
    }
}
