/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestBanner;

import banner.*;

/**muestra el baner 
 *
 * @author grupo 3 
 */
public class TestBanner {
    public void showMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        TestBanner tb = new TestBanner();
        tb.showMatriz(new LetterA('A', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterB('B', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterC('C', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterD('D', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterE('E', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterF('F', new Size(9, 9),'*').generate());
        System.out.println("");
        tb.showMatriz(new LetterG('G', new Size(9, 9),'*').generate());
        System.out.println("");
        tb.showMatriz(new LetterH('H', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterI('I', new Size(9, 9),'*').generate());
        System.out.println("");
        tb.showMatriz(new LetterJ('J', new Size(9, 9),'*').generate());
        System.out.println("");
        tb.showMatriz(new LetterT('T', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterL('L', new Size(9, 9),'*').generate());
        System.out.println("");
        tb.showMatriz(new LetterO('O', new Size(9, 9),'*').generate());
        System.out.println("");
        tb.showMatriz(new LetterU('U', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterQ('Q', new Size(9, 9),'*').generate());
        System.out.println("");
        //tb.showMatriz(new Banner("Hola Mundo").generate(new Size(8,8), '*'));
        
    }
}