package com.mafick.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// TODO: not finished

public class Clonable {

	private List<Wert<?>> werte = new ArrayList<>();

	public void test() {

		// copy memory reference
		List<Wert<?>> werte2 = werte;

		// flat copy of object
		List<Wert<?>> copiedList = new ArrayList<>();
		Collections.copy(werte, copiedList);


	}


	private abstract class Wert<T> {

		private T t;

		public void set(T t) {
			this.t = t;
		}

		public T get() {
			return t;
		}

	}

	private class TextWert extends Wert<String> implements Cloneable {

		@Override
		public Wert<String> clone() {
			try {
				return (Wert<String>) super.clone();
			} catch (CloneNotSupportedException e) {
				System.out.println("CloneNotSupportedException comes out : " + e.getMessage());
				return this;
			}
		}
	}

	private class ShortWert extends Wert<Short> {

	}

	abstract class AbstractClass implements Cloneable {
		// stuff
	}

	class Version extends AbstractClass {
		private String stuff;

		public Version(String stuff) {
			this.stuff = stuff;
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			return new Version(stuff);
		}
	}

}
