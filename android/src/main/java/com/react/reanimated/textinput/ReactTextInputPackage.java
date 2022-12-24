
package com.react.reanimated.textinput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.JavaScriptModule;

public class ReactTextInputPackage implements ReactPackage {
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> nativeModules = new ArrayList<>();
        return nativeModules;
    }

    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return null;
    }

    @Override
    public List<ViewManager> createViewManagers(
            ReactApplicationContext reactContext) {
        return Arrays.<ViewManager>asList(
                new ReactTextInputManager()
        );
    }
}