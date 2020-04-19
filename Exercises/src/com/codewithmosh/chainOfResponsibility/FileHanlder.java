package com.codewithmosh.chainOfResponsibility;

public abstract class FileHanlder implements Handler {
    private Handler next;

    public FileHanlder(Handler next) {
        this.next = next;
    }

    @Override
    public boolean handle(String text) {
        if (text.endsWith(this.getExtension())){
            doHandle(text);
            return true;
        }

        if (next!=null)
            return next.handle(text);

        throw new UnsupportedOperationException("file format not supported");


//        if (!doHandle(text) && next != null){
//            return next.handle(text);
//
//        }
//
//        return false;
    }

    protected abstract void doHandle(String text);
    protected abstract String getExtension();
}
