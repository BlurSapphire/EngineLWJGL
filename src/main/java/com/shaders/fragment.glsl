#version 330 core

in vec3 vertexColor;  // Получаем цвет из вершинного шейдера
out vec4 FragColor;  // Выходной цвет фрагмента

void main() {
    FragColor = vec4(vertexColor, 1.0); // Окрашиваем фрагмент в цвет вершины
}
