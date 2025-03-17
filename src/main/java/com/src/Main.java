package com.src;

import org.lwjgl.Version;
import com.frontend.Window;

public class Main {
    public static void main(String[] args){
        System.out.println(Version.getVersion());
        Window win = new Window();
        win.init();
        win.update();
        win.cleanup();
    }
}
