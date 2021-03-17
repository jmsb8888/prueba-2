package banner;

public class Number2 extends MyCharacter{

	public Number2(char value, Size size,char symbol) {
		super(value, size,symbol);
	}
	
	public char [][] generate() {
		new HorizontalStroke(area, symbol).generate(0).generate(area.length/2).generate(area.length-1);
		new VerticalStroke(area, symbol).generate(0).generate(area.length-1);
		new EmptyPoints(area, ' ').generateVertical(1, 0,(area.length/2)-1).generateVertical((area.length/2)+1, area[0].length-1, area.length-2);
		return area;
	}
}
