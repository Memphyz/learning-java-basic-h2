package com.lucasribeiro.learning.utils;

import java.util.ArrayList;
import java.util.List;
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
		} while (els < quantity);
	}
	
	public static List<Integer> elements(int quantity) {
		Objects.requireNonNull(quantity, "A quantidade não pode ser nula!");
		List<Integer> ints = new ArrayList<Integer>();
		int els = 0;
		do {
			ints.add(els);
			++els;
		} while (els < quantity);
		return ints;
	}
}
