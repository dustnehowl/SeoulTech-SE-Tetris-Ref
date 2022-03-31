package seoultech.se.tetris.blocks;

import java.awt.Color;

public class JBlock extends Block {
	
	public JBlock() {
		shape = new int[][] { 
				{1, 2, 1},
				{0, 0, 1}
		};
		if(color_weak)
			color= new Color(0x0072b1);
		else
			color = Color.BLUE;
	}
}