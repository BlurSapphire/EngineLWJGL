#version 330 core

layout(location = 0) in vec3 aPos;  // Входная позиция вершины
layout(location = 1) in vec3 aColor; // Входной цвет вершины

out vec3 vertexColor; // Передаем цвет во фрагментный шейдер

uniform mat4 model;
uniform mat4 view;
uniform mat4 projection;

void main() {
    gl_Position = projection * view * model * vec4(aPos, 1.0);
    vertexColor = aColor;
}
