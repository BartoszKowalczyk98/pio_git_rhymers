package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.ArrayRhymersFactory;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.ListRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

	public static void main(String[] args) {
		System.out.println("default");
		Rhymersfactory factory = new DefaultRhymersFactory();
		testRhymers(factory);
		System.out.println("\narray");
		Rhymersfactory arrayFactory = new ArrayRhymersFactory();
		testRhymers(arrayFactory);
		System.out.println("\nList");
		Rhymersfactory listFactory = new ListRhymersFactory();
		testRhymers(listFactory);

	}

	private static void testRhymers(Rhymersfactory factory) {
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				rhymers[j].countIn(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			rhymers[3].countIn(rn.nextInt(20));

		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[3]).reportRejected());
	}

}