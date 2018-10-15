/*
 * Copyright (c) 2016, Ivan Sokolov. All rights reserved.
 * This code is licensed under FreeBSD license (see LICENSE for details)
 */

package com.github.sirikid.cf.impl;

public final class HashTableConstants {
	private HashTableConstants() {}

	public static final int MIN_HASH_TABLE_SIZE = 1 << 4;
	public static final int MAX_HASH_TABLE_SIZE = Integer.MAX_VALUE;
	public static final int MAX_ELEMENTS_COUNT = MAX_HASH_TABLE_SIZE - 1;

	public static final float DEFAULT_LOAD_FACTOR = 0.75f;
	public static final float MIN_LOAD_FACTOR = 0.1f;
	public static final float MAX_LOAD_FACTOR = 0.95f;
}