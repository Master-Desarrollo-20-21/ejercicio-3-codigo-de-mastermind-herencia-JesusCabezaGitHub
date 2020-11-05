class Game {
	private SecrectCombination secretCombination;
	private ProposedCombination proposedCombination;
	private int attempts;
	
	public Game() {
		this.secretCombination = new SecrectCombination();
		this.proposedCombination = new ProposedCombination();
		this.attempts = 0;
	}
	
	public void play() {
		ProposedCombination proposedCombination; 
		do {
			this.secretCombination.appears();
			this.proposedCombination.showHistorial();
			proposedCombination = this.proposedCombination.getProposedCombinationValid();
			this.attempts++;
		}while(!this.secretCombination.thereIsVictory(proposedCombination) || this.attempts < 10);
		this.showResultMessage();
	}

	private void showResultMessage() {
		if(this.attempts == 10) {
			this.showDefeatMessage();
		}else {
			this.showVictoryMessage();
		}
	}

	private void showDefeatMessage() {
		new Console().out("You've lost!!! :-(");
	}

	private void showVictoryMessage() {
		new Console().out("You've won!!! ;-)");
	}

}
