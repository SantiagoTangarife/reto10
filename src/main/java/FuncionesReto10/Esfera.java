/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesReto10;
//import com.mycompany.reto10.IEsfera;



/**
 *
 * @author saxss
 */
public class Esfera implements IEsfera{
    
    public Esfera(){}
    
    private Double re;
    

    @Override
    public Double volumen(Double r) {
        double v = (float)4/3; //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println(v*(Math.PI)*r*r*r);
        return v*(Math.PI)*r*r*r;
    }
    
    

    @Override
    public Double superficie(Double r) {
        return 4*(Math.PI)*r*r;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double areaCirculo(Double r) {
        return 2*(Math.PI)*r*r;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double perimetroCirculo(Double r) {
        return 2*(Math.PI)*r;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setR(Double r) {
        re=r;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double getR() {
        return re;
    }
    
}
