package com.frontend;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryUtil;

public class Window {
    private long window;
    private int width, height;


    public Window(){
        width = 800;
        height = 800;
    }

    public void init(){
        GLFW.glfwInit();
        GLFW.glfwDefaultWindowHints();

        window = GLFW.glfwCreateWindow(width, height, "Engine", MemoryUtil.NULL, MemoryUtil.NULL);
        GLFW.glfwMakeContextCurrent(window);
        GLFW.glfwSwapBuffers(1);
        GLFW.glfwShowWindow(window);
        GL.createCapabilities();
    }

    public void update(){
        while(!GLFW.glfwWindowShouldClose(window)){
            GL11.glClearColor(1.0f, 1.0f,1.0f,1.0f);
            GL11.glClear(GL11.GL_CURRENT_BIT);

            GLFW.glfwSwapBuffers(window);
            GLFW.glfwPollEvents();
        }
    }

    public void cleanup(){
        GLFW.glfwTerminate();
        GLFW.glfwDestroyWindow(window);
    }
}
