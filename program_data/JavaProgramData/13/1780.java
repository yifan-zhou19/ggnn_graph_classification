package <missing>;

public class GlobalMembers
{
	/*
	 * shuzibuchong.cpp
	 *
	 *  Created on: 2013-10-30
	 *      Author: ???1300012996
	 */
	public static int Main()
	{
		int n;
		int i;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = m;
		}
		for (int ii = 0;ii < n;ii++)
		{
			for (int j = ii + 1;j < n;j++)
			{
				if (a[j] == a[ii])
				{
					a[j] = 101;
				} //???????????????????
			}
		}
		int b = 1; //?????
		for (int l = 0;l < n;l++)
		{

			if (a[l] < 100 && b == 1)
			{
				System.out.print(a[l]);
				b += 1;
			}
			else if (a[l] < 100 && b != 1)
			{
				System.out.print(' ');
				System.out.print(a[l]);
			}
		}
		return 0;
	}

}

