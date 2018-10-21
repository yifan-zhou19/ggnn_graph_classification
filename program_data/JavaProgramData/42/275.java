package <missing>;

public class GlobalMembers
{
	/*
	 * ???? 1000012845_25.cpp
	 * ???????
	 * ????: 2010-10-29
	 * ???????????
	 */

	public static int Main() //???
	{ //?????
		int n; //??n,i,j,k,m???
		int i;
		int j = 0;
		int k;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n]; //????
		for (i = 0;i < n;i++)
		{
		 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{ //????
			if (a[i] == k)
			{
				for (m = i;m < n;m++)
				{
					a[m] = a[m + 1];
				}
				i--;
				j++;
			} //?????
		}
		for (i = 0;i < n - j;i++)
		{
			System.out.print(a[i]);
			if (i != n - j - 1)
			{
				System.out.print(" ");
			}
		}
			System.out.print("\n");
		return 0;
	} //?????
}

