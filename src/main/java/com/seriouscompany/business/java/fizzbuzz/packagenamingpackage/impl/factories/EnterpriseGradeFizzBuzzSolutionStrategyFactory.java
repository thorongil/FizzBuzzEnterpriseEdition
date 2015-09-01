package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories.FizzBuzzSolutionStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.strategies.FizzBuzzSolutionStrategy;

import javax.annotation.Nonnull;

@Service
public class EnterpriseGradeFizzBuzzSolutionStrategyFactory implements FizzBuzzSolutionStrategyFactory {
	@Nonnull
	private final FizzBuzzSolutionStrategy _fizzBuzzSolutionStrategy;

	@Autowired
	public EnterpriseGradeFizzBuzzSolutionStrategyFactory(final FizzBuzzSolutionStrategy _fizzBuzzSolutionStrategy) {
		this._fizzBuzzSolutionStrategy = _fizzBuzzSolutionStrategy;
	}

	@Nonnull
	@Override
	public FizzBuzzSolutionStrategy createFizzBuzzSolutionStrategy() {
		return this._fizzBuzzSolutionStrategy;
	}

}
