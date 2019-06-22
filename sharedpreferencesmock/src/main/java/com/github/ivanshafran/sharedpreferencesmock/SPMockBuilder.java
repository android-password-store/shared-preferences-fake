package com.github.ivanshafran.sharedpreferencesmock;

import android.content.Context;
import android.content.SharedPreferences;

public final class SPMockBuilder {

    public SPMockBuilder() {

    }

    public SharedPreferences createSharedPreferences() {
        return new SharedPreferencesMock();
    }

    public Context createContext() {
        return new ContextMock();
    }
}
