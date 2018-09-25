package <missing>;

public class GlobalMembers
{
	//
	//	file	1000012765_2.cpp
	//	author	???
	//	date	2010.10.29
	//	desc
	//		????????
	//
	public static int Main()
	{
		int n; //    ????????? ????????
		int[] a = new int[20001];
		int i;
		int j;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = n - 1; j > i; j--)
			{
				if (a[i] == a[j])
				{
					a[j] = a[20000]; //    ???????????????0
				}
			}
		}
			for (i = 0; i < n; i++)
			{
				if (a[i] != 0 && count == 0)
				{
					System.out.print(a[i]);
					count++;
				}
				else if (a[i] != 0)
				{
					System.out.print(" ");
					System.out.print(a[i]);
				}
			}
			return 0;
	}
}

