package com.lucasribeiro.learning.utils;

import java.util.Objects;
import java.util.function.Consumer;

public class ArrayUtils {
	
	public static void loop(int quantity, Consumer<?> action) {
		Objects.requireNonNull(action, "A ação não pode ser nula!");
		Objects.requireNonNull(quantity, "A quantidade não pode ser nula!");
		int els = 0;
		do {
			action.accept(null);
			++els;
		} while (els <= quantity);
	}
}
