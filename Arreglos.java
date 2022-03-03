/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.ArrayList;

/**
 *
 * @author tprog
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] a = {"Eduardo", "Fabiola", "arlette", "jose"};
        System.out.println("longitud = " + a.length);
        System.out.println("alumno 2 = " + a[2]);

        int[] b = new int[5];
        System.out.println("longitud = " + b.length);
        System.out.println("elemento[0] = " + b[0]);
        System.out.println("elemento[3] = " + b[3]);
        b[0] = 5;
        b[1] = 4;
        b[2] = 3;
        b[3] = 2;
        b[4] = 1;
        System.out.println("elemento[3] = " + b[3]);
        float[] c = new float[3];
        System.out.println("longitud = " + c.length);
        System.out.println("elemento[0] = " + c[0]);
        System.out.println("elemento[3] = " + b[2]);
        System.out.println("elemento[3] = " + b[3]);
        c[0] = (float) 10.56;
        c[1] = (float) 11.56;
        c[2] = (float) 12.56;

        float[] c1 = {(float) 10.56, (float) 11.56, (float) 12.56, (float) 13.56};
        System.out.println("longitud = " + c1.length);
        System.out.println("elemento[0] = " + c1[2]);

        ArrayList<carro> p1 = new ArrayList<carro>();
        carro carro1 = new carro(1, "ac");
        p1.add(carro1);
        carro carro2 = new carro(2, "BA");
        p1.add(carro2);
        carro carro3 = new carro(3, "PR");
        p1.add(carro3);
        System.out.println("longitud = " + p1.size());
        System.out.println("datos del objeto 1:" + p1.get(0).getEstatus());
        System.out.println("datos del objeto 1:" + p1.get(0).getId());
    }

}
