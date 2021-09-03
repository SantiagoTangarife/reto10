/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesReto10;

/**
 *
 * @author saxss
 */
public interface IEsfera {
    //Usar fórmula:
//http://es.onlinemschool.com/math/assistance/figures_volume/sphere/
 public Double volumen(Double r);
 //Usar fórmula:
//http://es.onlinemschool.com/math/assistance/figures_area_1/sphere/
 public Double superficie(Double r);
 //Usar fórmula: http://mimosa.pntic.mec.es/clobo/geoweb/area7.htm
//(ÁREA DEL CÍRCULO)
 public Double areaCirculo(Double r);
 //Usar fórmula: http://mimosa.pntic.mec.es/clobo/geoweb/area7.htm
//(LONGITUD DE LA CIRCUNFERENCIA)
 public Double perimetroCirculo(Double r);

 //Radio
 public void setR(Double r);
 public Double getR();

    
    
    
}
