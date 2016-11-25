package com.java.controlflow;

public class Java_Branching {

	public static void main(String[] args) {
		
		String [][] pieces = {
			{"Black Castle", "Black Knight", "Black Bishop", "Black Queen", "Black King", "", "", ""},
			{"Black Pawn", "Black Pawn", "Black Pawn", "", "", "","", ""},
			{"", "", "", "", "", "", "", ""},
			{"", "", "", "", "", "", "", ""},
			{"", "", "", "", "", "", "", ""},
			{"", "", "", "", "", "", "", ""},
			{"White Pawn", "White Pawn", "White Pawn", "", "", "", "", ""},
			{"White Castle", "White Knight", "White Bishop", "White Queen", "White King", "", "", ""},
		};
		
		int x=0, y=0;
		king:
			for(int i=0; i<8; i++){
				for(int j=0; j<8; j++){
					if(pieces[i][j].equals("White Bishop")){
						x=i;
						y=j;
						break king;
					}
				}
			}
		System.out.println("x: " + x + ", y: " + y);

		int pawns = 0;
		for(int i=0; i<8; i++){
			for(int j=0; j<8; j++){
				if(!pieces[i][j].contains("Pawn")){
					continue;
				}
				pawns++;
			}
		}
		System.out.println("Surviving pawns: " + pawns);
	}

}
