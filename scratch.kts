import java.util.Arrays
import javax.swing.JOptionPane

//This how a matrix works
/*
var matriz = arrayOf(
        intArrayOf(5,6,7),
        intArrayOf(1,2,3),
        intArrayOf(4,5,6)
)

for(i in (0 until 3)){
    for(j in (0 until 3)){
        print("${matriz[i][j]},")
    }
    println()
}

*/

var fila = JOptionPane.showInputDialog("Ingresa la cantidad de filas").toInt()
var columna = JOptionPane.showInputDialog("Ingresa la cantidad de columnas").toInt()

var matriz = Array(fila){IntArray(columna)}

for(i in (0 until fila)){
    for (j in(0 until columna)){
        matriz[i][j] = JOptionPane.showInputDialog("Ingresa el valor de [${i+1}][${j+1}]").toInt()
    }
}
println("La matriz es la siguiente:")
    for (i in(0 until fila)){
        for (j in(0 until columna)){
            print("${matriz[i][j]},")
        }
        println()
    }