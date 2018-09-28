package <missing>;

public class GlobalMembers
{
	/*
	 * ???008.cpp
	 * Created on: 2012-10-14
	 * Author: ???
	 * ?????????
	 */
	public static int Main()
	{
		int n; //??n i j???
		int i = 1;
		int j = 3;
		int[] b = new int[20]; //????
		b[1] = 1,b[2] = 1; //??????1
		while (j <= 20)
		{ //????
		b[j] = b[j - 1] + b[j - 2]; //???????
		j = j + 1; //?j?1
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n]; //??????
		while (i <= n)
		{ //????
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(b[a[i]]);
		System.out.print("\n");
		i = i + 1; //?i?1
		}
		return 0; //????
	}
}

