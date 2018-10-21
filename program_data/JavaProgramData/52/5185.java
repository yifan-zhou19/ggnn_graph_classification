package <missing>;

public class GlobalMembers
{
	/*
	 * xunhuanyidong.cpp
	 *  ????
	 *  Created on: 2012-12-10
	 *      Author: ???   1200012899
	 */
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
				a[i] = ConsoleInput.readToWhiteSpace(true);
			b[i] = a[i];
		}
		for (int j = 0;j < n;j++)
		{
			a[(j + m) % n] = b[j];
		}
		for (int i = 0;i < n;i++)
		{
			if (i == 0)
			{
			System.out.print((a + i));
			}
			else
			{
				System.out.print(" ");
				System.out.print((a + i));
			}
		}
		return 0;
	}

}

