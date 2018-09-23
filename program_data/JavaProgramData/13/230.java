package <missing>;

public class GlobalMembers
{
	/*
	* kaiguandiandeng.cpp
	*
	*  Created on: 2010-10-28
	*      Author: ??
	*      ???????????
	*/
	public static int Main()
	{
		int N;
		int n;
		int i = 0;
		int j = 0;
		int[] a = new int[20000];
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i <= N - 1)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = n;
			i++;
		} //?????
		System.out.print(a[0]);
		for (i = 1; i <= N - 1; i++)
		{
			for (j = 0; j < i; j++)
			{
				if (a[j] == a[i])
				{
					break; //??????????????
				}
			}
			if (j == i)
			{
				System.out.print(' ');
				System.out.print(a[i]);
			}
		}
		return 0;
	}

}

