package <missing>;

public class GlobalMembers
{
	/******************************
	 *No.1                        *
	 *Title:Celebrity             *
	 *Author:??                 *
	 *Created on:2011.12.7        *
	 ******************************/
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag = 1;
		int[] a = new int[100000];
		int[] p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i != 0 || j != 0)
		{
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[j]++;
		}
		for (j = 0 ; j < n ; j++)
		{
			if (p[j] == n - 1 || p[j] == n)
			{
				System.out.print(j);
				System.out.print("\n");
				flag = 0;
			}
		}
		if (flag != 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}

}

