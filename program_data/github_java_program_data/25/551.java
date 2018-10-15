package algorithm;
import java.util.*;
public class Permutation {
	public static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public static void Util(List<List<Integer>> ll, int start, int end, int[] a) {
		if (start == end) {
			List<Integer> l = new ArrayList<Integer>();
			for(int j = 0; j < a.length; ++j) {
				l.add(a[j]);
				System.out.print(a[j]);
			}
			System.out.print("\n");
			ll.add(l);
			return;
		}
		for (int i = start; i < end; ++i) {
			swap(a, i, start);
			Util(ll, start+1, end, a);
			swap(a, i, start);
		}
		return;
	}
	public static boolean NextPermute(int[] a) {
		int i = 0;
		boolean possible = false;
		for (i = a.length-1; i > 0; --i) {
			if (a[i-1] < a[i]) {
				possible = true;
				break;
			}
		}
		if (possible == true) {
			int j = i;
			int k = a.length-1;
			while (j < k) {
				int tt = a[j];
				a[j] = a[k];
				a[k] = tt;
				j++;
				k--;
			}
			k = i;
			j = i-1;
			while (a[k] < a[j]) {
				k++;
			}
			i = a[k];
			a[k] = a[j];
			a[j] = i;
		}
		return possible;
	}
	public static List<List<Integer>> permutate(int[] arr) {
		List<List<Integer>> ll = new ArrayList<List<Integer>>();
		Util(ll, 0, arr.length, arr);
		System.out.print("Next implementation\n");
		boolean possible = false;
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i]);
		}
		System.out.print("\n");
		do {
			possible = NextPermute(arr);
			if (possible) {
				for(int j = 0; j < arr.length; ++j) {
					System.out.print(arr[j]);
				}
				System.out.print("\n");
			}
		} while (possible);
		return ll;
	}
	public static void main(String[] args) {
		int[] a = {1,3,2};
		List<List<Integer>> ll = new ArrayList<List<Integer>>();
		ll = permutate(a);
	}

}
