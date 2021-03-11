/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 * crea la letra B en una matriz
 * @author uptc
 */
public class LetterB extends MyCharacter {

    public LetterB(char value, Size size, char symbol) {
        super(value, size,symbol);
    }

    /**
     * llama la creacion de trazo horizontal en 3 ocasiones, el vertical en dos y el punto placo en 3 y da las ubicaciones de llenado
     * @returnla matriz con la letra B
     */
    @Override
    public char[][] generate() {
        new HorizontalStroke(area,symbol).generate(0).generate(area.length/2).generate(area.length-1);
        new VerticalStroke(area,symbol).generate(0).generate(area[0].length-1);
        new EmptyPoints(area, ' ').generate(area.length/2).generate(0).generate(area.length-1);
        return area;
    }
    
    
}