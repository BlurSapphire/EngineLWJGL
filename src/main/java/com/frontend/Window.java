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

    public void initParam(){
        GLFW.glfwInit();
        GLFW.glfwDefaultWindowHints();

        window = GLFW.glfwCreateWindow(width, height, "Engine", MemoryUtil.NULL,  MemoryUtil.NULL);
        GLFW.glfwMakeContextCurrent(window);
        GLFW.glfwSwapInterval(1);
        GL.createCapabilities();
    }
    public void loop(){
        while (!GLFW.glfwWindowShouldClose(window)){
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
            GL11.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);



            GLFW.glfwSwapBuffers(window);
            GLFW.glfwPollEvents();
        }
    }

    public void cleanUp(){
        GLFW.glfwDestroyWindow(window);
        GLFW.glfwTerminate();
    }


}