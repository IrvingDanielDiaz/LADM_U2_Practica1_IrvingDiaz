package mx.edu.ittepic.ladm_u2_practica1_irvingdiaz

import android.app.AlertDialog
import android.graphics.Canvas
import android.graphics.Paint

class HiloControl(p:MainActivity):Thread(){
    var puntero = p

    override fun run() {
        super.run()
        sleep(3000)
        while(true){
            sleep(10)
            puntero.runOnUiThread {
                puntero.lienzo!!.animarCirculo()
            }
        }
    }
}