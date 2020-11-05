abstract class Combination {
	Color colors[];
	int length;
	
	protected Combination() {
		this.colors = null;
		this.length = 0;
	}
	protected Combination(Color colors[], int length) {
		this.colors = colors;
		this.length = length;
	}
	
	protected abstract Combination generate();
}
