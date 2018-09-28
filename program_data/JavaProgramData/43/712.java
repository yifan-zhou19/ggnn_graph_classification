package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2012-10-8
	 *      Author: Lixurong
	 */


//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int runnian(int a);

	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[5000];
		a[1] = 2;
		int s = 2;
		for (int i = 3; i < 10000; i++)
		{
			int k = 1;
			for (int j = 1; a[j] * a[j] <= i; j++)
			{
				 if (i % a[j] == 0)
				 {
					 k = 0;
					 break;
				 }
			}
			if (k == 1)
			{
				a[s] = i;
				s++;
			}
		}
		for (int i = 1; a[i] < m; i++)
		{
			for (int j = i; a[j] < m; j++)
			{
				if (a[i] + a[j] == m)
				{
					System.out.print(a[i]);
					System.out.print(" ");
					System.out.print(a[j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

