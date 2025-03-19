package com.backend;

import org.lwjgl.glfw.GLFW;
import static org.lwjgl.opengl.GL20.*;

public class ShaderConfig {
    private final int programID;
    private int vertexShaderID;
    private int fragmentShaderID;

    public ShaderConfig() throws Exception{
        programID = glCreateProgram();
        if(programID == 0){
            throw new Exception("Could not create shader");
        }

    }



    public void shaderSource(){

    }
    public void shaderCompile(){

    }
    public void shaderCreation(){

    }


}
