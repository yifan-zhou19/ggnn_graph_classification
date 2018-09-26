package <missing>;

public class GlobalMembers
{
	/*
	 *@file 5.cpp
	 *@author ??? 
	 *@date 11.15
	 *@description ??2?n??
	 */

	public static int Main()
	{
		int[] a = new int[1000]; //????????????????????
		int i;
		int n;
		int temp = 0;
		int N;

		a[0] = 1; //???????1
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (n = 1; n <= N; n++)
		{
			for (i = 0; i < 1000; i++)
			{
				a[i] *= 2; //??????????2
			}
			for (i = 0; i < 1000; i++)
			{
				if (a[i] > 9)
				{
					a[i] = a[i] % 10; //?????2???9????
					a[i + 1] += 1;
				}
			}
		}

		for (i = 999; i >= 0; i--)
		{
			if (a[i] != 0)
			{
				temp = i; //????????????0???
				break;
			}
		}

		for (i = temp; i >= 0; i--)
		{
			System.out.print(a[i]);
		}

	 return 0;
	}
}

