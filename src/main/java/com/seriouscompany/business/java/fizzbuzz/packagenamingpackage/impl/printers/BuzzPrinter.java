package com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.factories.SystemOutFizzBuzzOutputStrategyFactory;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.stringreturners.BuzzStringReturner;
import com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.strategies.adapters.FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter;

import javax.annotation.Nonnull;

@Service
public class BuzzPrinter {

	@Nonnull
	private final SystemOutFizzBuzzOutputStrategyFactory _systemOutFizzBuzzOutputStrategyFactory;

	@Autowired
	public BuzzPrinter(@Nonnull final SystemOutFizzBuzzOutputStrategyFactory _systemOutFizzBuzzOutputStrategyFactory) {
		this._systemOutFizzBuzzOutputStrategyFactory = _systemOutFizzBuzzOutputStrategyFactory;
	}

	public void printBuzz() {
		final BuzzStringReturner myBuzzStringReturner = new BuzzStringReturner();
		final FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter myOutputAdapter =
				new FizzBuzzOutputStrategyToFizzBuzzExceptionSafeOutputStrategyAdapter(
						this._systemOutFizzBuzzOutputStrategyFactory.createOutputStrategy());

		myOutputAdapter.output(myBuzzStringReturner.getReturnString());
	}
}
