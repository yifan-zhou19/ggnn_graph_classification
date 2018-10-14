//use Binary Search method in the array
//output the index of K..

public class Search_BinarySearch {

	public static int [] search (int k, int[] a) {
		int ret = -1;
		int l=0;
		int r=a.length;

		while (l != r){
			int m = (l+r)/2;
			if (a[m]==k){
				ret = m;
				break;
			} else
			if (a[m]>k){
				r = m-1;
			} else {
				l = m+1;
			}
		}

		if (a[l] ==k)
			ret =l;

		return ret;
	}

	public static void main(String [] args){
		int [] a = {1,3,4,5,8,11,12,16,18,21,22,23,28,38,45,46,100};
		System.out.println(search (45,a));
		}
}