package <missing>;

public class GlobalMembers
{
	/*
	 *????1000010416_25.cpp
	 *???????????
	 *Created on: 2010-11-5
	 *Author: ???
	 */

	public static int Main()
	{ //???
		int n; //????
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[200000]; //????
		for (int i = 0;i <= n - 1;i++)
		{ //??
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 0;i <= n - 1;i++)
		{ //?????
				if (a[i] != m)
				{
					System.out.print(a[i]);
					break;
				}
		}
		for (i++;i <= n - 1;i++)
		{ //??  ??
			if (a[i] != m)
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
		}
	   return 0;
	}
}

