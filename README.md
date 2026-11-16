
# Metodos_Numericos

## 📚 Asignatura
SCC-1017 — Métodos Numéricos
*Docente:* Víctor Hugo Vázquez Herrera
*Instituto Tecnológico Superior de Xalapa* — Ingeniería en Sistemas Computacionales

---

## 📋 Descripción del Proyecto
Este proyecto implementa dos métodos numéricos para resolver problemas de valor inicial de Ecuaciones Diferenciales Ordinarias (EDOs):

1. *Método de Euler* — Resuelve: \( y' = x - y \), con \( y(0) = 1 \), \( x \in [0, 0.3] \)
   - Solución exacta: \( y(x) = -x - 1 + 2e^{-x} \)

2. *Método de Runge-Kutta de 4º Orden (RK4)* — Resuelve: \( y' = x + y \), con \( y(0) = 1 \), \( x \in [0, 0.3] \)
   - Solución exacta: \( y(x) = -x - 1 + 2e^{x} \)

Ambos métodos incluyen cálculo del *error absoluto* comparando con la solución analítica exacta.
