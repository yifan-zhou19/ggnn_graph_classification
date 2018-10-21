package <missing>;

public class GlobalMembers
{
	/*
	 * ????22.cpp
	 * ??????
	 * ????: 2012-9-30
	 * ??:??????????
	 */


	public static int Main()
	{
		int n = 0; //i,j?????
		int i = 0;
		int j = 0;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{ //???????
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[] a = new int[m];
			a[0] = 1;
			a[1] = 1;
			for (j = 2;j <= m;j++)
			{
				a[j] = a[j - 1] + a[j - 2]; //????????m?
			}
			System.out.print(a[m - 1]);
			System.out.print("\n");
		}
		return 0;
	}
}

