class SecrectCombination extends Combination {

	protected SecrectCombination() {
		super();
	}
	
	protected SecrectCombination(Color[] colors, int length) {
		super(colors, length);
	}

	public void appears() {
				
	}

	public boolean thereIsVictory(ProposedCombination proposedCombination) {
		
		return false;
	}

	@Override
	protected Combination generate() {
		return null;
	}
	
	public static void main(String[] args) {
		Console console = new Console();
		console.out(Color.values().length);
	}

}
