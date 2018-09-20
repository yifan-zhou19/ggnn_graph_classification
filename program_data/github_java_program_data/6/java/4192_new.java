package com.github.Icyene.jHAL.Engine;

import java.util.LinkedList;

import com.github.Icyene.jHAL.Engine.Data_Types.Pair;

public class MemoryModel {

	protected static LinkedList<Pair<String, LinkedList<String>>> wildcardModel = new LinkedList<Pair<String, LinkedList<String>>>();
	protected LinkedList<Pair<String, LinkedList<String>>> trimmedModel = new LinkedList<Pair<String, LinkedList<String>>>();

	public void storeInModel(String key, LinkedList<String> answers,
			LinkedList<Pair<String, LinkedList<String>>> model) {
		model.add(new Pair<String, LinkedList<String>>(key, answers));
	}

	public void removeFromModel(String key, LinkedList<String> answers,
			LinkedList<Pair<String, LinkedList<String>>> model) {
		model.remove(new Pair<String, LinkedList<String>>(key, answers));
	}

	public LinkedList<Pair<String, LinkedList<String>>> getWildcardless(
			LinkedList<Pair<String, LinkedList<String>>> in) {

		LinkedList<Pair<String, LinkedList<String>>> res = new LinkedList<Pair<String, LinkedList<String>>>();

		for (Pair<String, LinkedList<String>> pair : trimmedModel) {
			if (!pair.LEFT.contains("*")) {
				res.add(pair);
			}
		}

		return res;

	}

	public void redirect(String key) {

	}

	public LinkedList<String> solidSearch(String key,
			LinkedList<Pair<String, LinkedList<String>>> model) {

		for (Pair<String, LinkedList<String>> pair : model) {
			if (key.equals(pair.LEFT)) {
				return pair.RIGHT;
			}
		}

		return new LinkedList<String>(); // Empty list indicates failure
	}

	public static LinkedList<Pair<String, LinkedList<String>>> getWildcardModel() {
		return wildcardModel;
	}

	public void setWildcardModel(
			LinkedList<Pair<String, LinkedList<String>>> wM) {
		wildcardModel = wM;
	}

}