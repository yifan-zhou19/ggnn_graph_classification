package <missing>;

public class GlobalMembers
{
	/*
	 * fanliang.cpp
	 *
	 *  Created on: 2012-10-26
	 *      Author: 7
	 */
	public static int Main()
	{
		int[] a = new int[3];
		int i;
		int j;
		int temp;
		char c;
		char[] b = {'A', 'B', 'C'};
		for (a[0] = 1;a[0] < 4;a[0]++)
		{
			for (a[1] = 1;a[1] < 4;a[1]++)
			{
				for (a[2] = 1;a[2] < 4;a[2]++)
				{
					if ((a[1] > a[0]) + (a[2] == a[0]) == 3 - a[0] && (a[0] > a[1]) + (a[0] > a[2]) == 3 - a[1] && (a[2] > a[1]) + (a[1] > a[0]) == 3 - a[2])
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						 goto loop;
					}
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		loop:
		for (i = 0;i < 2;i++)
		{
			for (j = 0;j < 2 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					c = b[j];
					b[j] = b[j + 1];
					b[j + 1] = c;
				}
			}
		}
		System.out.print(b[0]);
		System.out.print(b[1]);
		System.out.print(b[2]);
	}

}
