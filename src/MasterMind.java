class MasterMind {
	
	private Game game;

	MasterMind(){
		this.game = new Game();
	}
	public static void main(String[] args) {
		new MasterMind().play();
	}

	private void play() {
		 do {
			 this.game.play();
		 }while(toBeContinued());
	}
	
	private boolean toBeContinued() {
		String answer; 
	    Console console = new Console(); 
	    do { 
	      console.out("¿Quieres continuar? (s/n): ");
	      answer = console.inString();
	      
	    } while (!answer.equals("s") && !answer.equals("n")); 
	    return answer.equals("s"); 
	}
}
