package hr.fer.zemris.nenr.dz7.genetic;

import java.util.List;

public interface ISelectionOperator<T> {

	public ISolution<T> select(IPopulation<T> population);
	public ISolution<T> select(IPopulation<T> population, List<ISolution<T>> forbiddenSolutions);
}
