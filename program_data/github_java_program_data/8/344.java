package com.yongk.algospot.QUADTREE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QUADTREE {
	static Queue<Character> q;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		q = new LinkedList<Character>();
		int N = Integer.parseInt(sc.nextLine());
		while(N-- > 0) {
			System.out.println(solve(sc.nextLine()));
		}
	}
	private static String solve(String input) {
		if(!q.isEmpty())
			q.clear();
		char[] c = input.toCharArray();
		for (int i = 0; i < c.length; i++) {
			q.add(c[i]);
		}
		return quadTree();
	}
	private static String quadTree() {
		
		char c = q.poll();
		if (c == 'x') {
			StringBuffer sb = new StringBuffer();
			String[] s = new String[4];
			sb.append('x');
			for (int i = 0; i < 4; i++) {
				s[i] = quadTree();
			}
			for (int i = 0; i < 4; i++) {
				sb.append(s[(i + 2) % 4]);
			}
			return sb.toString();
		} else {
			return String.valueOf(c);
		}
	}
}
