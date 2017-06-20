package com.thinkjava.demo;

public class Chess extends BoardGame{

	public Chess(int i) {
		super(i);
	}
    public static void main(String[] args) {
		Chess chess = new Chess(12);
	}
}
class Game{
	public Game(int i) {
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game{

	public BoardGame(int i) {
		super(i);
	}
	
}
