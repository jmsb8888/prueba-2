/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 *da los parametros que llevara cada caracter a construir
 * @author uptc
 */
public abstract class MyCharacter {
    private char value;
    protected Size size;
    protected char symbol;
    protected char[][] area;

    /**
     * crea un constructor, ademas dentro de el crea una matriz tipo char llena de espacios;
     * @param value letra a crear
     * @param size  tamaño
     * @param symbol letra a llenar
     */
    public MyCharacter(char value, Size size, char symbol) {
        this.value = value;
        this.size = size;
        this.symbol = symbol;
        this.area = new char[size.getWidth()][size.getHeight()];
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[i].length; j++) {
                area[i][j] = ' ';
            }
        } 
    }
   
    public abstract char[][] generate();
}