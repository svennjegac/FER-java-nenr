package hr.fer.zemris.nenr.dz7.genetic;

public interface IProblem<T> {

	public double getFitness(ISolution<T> solution);
	public double getValue(ISolution<T> solution);
	
	public ISolution<T> generateRandomSolution();
}
