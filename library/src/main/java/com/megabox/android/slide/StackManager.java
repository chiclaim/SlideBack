package com.megabox.android.slide;

import android.app.Activity;

import java.util.Stack;

public class StackManager {

    private final Stack<Activity> activityStack = new Stack<>();

    private StackManager() {
    }


    public static StackManager getInstance() {
        return StackManagerHolder.INSTANCE;
    }

    private static class StackManagerHolder {
        private static final StackManager INSTANCE = new StackManager();
    }

    public void push(Activity activity) {
        activityStack.push(activity);
    }

    public void remove(Activity activity) {
        activityStack.remove(activity);
    }

    public Activity peek() {
        if (!activityStack.isEmpty())
            return activityStack.peek();
        return null;
    }

    /**
     * 获取前一个Activity
     *
     * @param curActivity 当前 Activity
     * @return previousActivity
     */
    public Activity getPreviousActivity(Activity curActivity) {
        if (activityStack.size() > 1) {
            final int currentIndex = activityStack.indexOf(curActivity);
            if (currentIndex == -1) return null;
            final int previousIndex = currentIndex - 1;
            if (previousIndex < 0) return null;
            return activityStack.get(previousIndex);
        }
        return null;
    }


}
