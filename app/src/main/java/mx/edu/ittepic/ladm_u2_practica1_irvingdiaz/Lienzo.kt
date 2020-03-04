package mx.edu.ittepic.ladm_u2_practica1_irvingdiaz

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.view.MotionEvent
import android.view.View

class Lienzo(p:MainActivity) : View(p) {
    var puntero = p
    val path = Path()
    var pasto = FiguraGeometrica(0,1400,1080,800)
    var tronco = FiguraGeometrica (80,1200,100,300)
    var arbol1 = FiguraGeometrica(130,1250,100)
    var arbol2 = FiguraGeometrica(130,1150,100)
    var casaRectagulo = FiguraGeometrica(350,1100,550,450)
    var puerta = FiguraGeometrica(550,1350,110,200)
    var ventana = FiguraGeometrica(470,1250,80)
    var sol = FiguraGeometrica(1080,0,200)

    //------------------------ bolas de nieve
    var circulo = FiguraGeometrica(30, -415, 48)
    var circulo2 = FiguraGeometrica(365, -315, 26)
    var circulo3 = FiguraGeometrica(248, -795, 39)
    var circulo4 = FiguraGeometrica(890, -95, 50)
    var circulo5 = FiguraGeometrica(1000, -1195, 45)
    var circulo6 = FiguraGeometrica(600, -835, 30)
    var circulo7 = FiguraGeometrica(720, -1015, 40)
    var circulo8 = FiguraGeometrica(109, -1655, 50)
    var circulo9 = FiguraGeometrica(450, -992, 18)
    var circulo10 = FiguraGeometrica(86, -2011, 70)
    var circulo11 = FiguraGeometrica(-160, -1811, 60)
    var circulo12 = FiguraGeometrica(-120, -211, 40)
    var circulo13 = FiguraGeometrica(-60, -911, 50)
    var circulo14 = FiguraGeometrica(-20, -811, 60)
    var circulo15 = FiguraGeometrica(-100, -511, 50)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()
        var paintTriangulo = Paint()
        canvas.drawColor(Color.rgb(212,220,255))

        paint.color = Color.rgb(185,204,98)
        pasto.pintar(canvas,paint)

        paint.color = Color.rgb(128,104,41)
        tronco.pintar(canvas,paint)

        paint.color = Color.rgb(117,179,49)
        arbol1.pintar(canvas,paint)
        arbol2.pintar(canvas,paint)

        paint.color = Color.rgb(255,204,82)
        casaRectagulo.pintar(canvas,paint)

        paint.color = Color.rgb(153,149,110)
        puerta.pintar(canvas,paint)
        paint.color = Color.rgb(45,174,204)
        ventana.pintar(canvas,paint)

        path.moveTo(300f, 1100f)
        path.lineTo(950f, 1100f)
        path.lineTo(600f, 700f)
        paintTriangulo.color = Color.rgb(134,81,25)
        canvas.drawPath(path, paintTriangulo)

        paint.color = Color.YELLOW
        sol.pintar(canvas,paint)

        paint.color = Color.argb(200,255,255,255)
        circulo.pintar(canvas, paint)
        circulo2.pintar(canvas, paint)
        circulo3.pintar(canvas, paint)
        circulo4.pintar(canvas, paint)
        circulo5.pintar(canvas, paint)
        circulo6.pintar(canvas, paint)
        circulo7.pintar(canvas, paint)
        circulo8.pintar(canvas, paint)
        circulo9.pintar(canvas, paint)
        circulo10.pintar(canvas, paint)
        circulo11.pintar(canvas, paint)
        circulo12.pintar(canvas, paint)
        circulo13.pintar(canvas, paint)
        circulo14.pintar(canvas, paint)
        circulo15.pintar(canvas, paint)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
            }
            MotionEvent.ACTION_MOVE -> {
            }
            MotionEvent.ACTION_UP -> {
            }
        }
        invalidate()
        return true
    }

    fun animarCirculo() {
        circulo.caida(width, height)
        circulo2.caida(width, height)
        circulo3.caida(width, height)
        circulo4.caida(width, height)
        circulo5.caida(width, height)
        circulo6.caida(width, height)
        circulo7.caida(width, height)
        circulo8.caida(width, height)
        circulo9.caida(width, height)
        circulo10.caida(width, height)
        circulo11.caida(width, height)
        circulo12.caida(width, height)
        circulo13.caida(width, height)
        circulo14.caida(width, height)
        circulo15.caida(width, height)
        invalidate()
    }

}