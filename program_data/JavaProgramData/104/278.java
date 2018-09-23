package <missing>;

public class GlobalMembers
{
	/*
	 * 111.cpp
	 *
	 *  Created on: 2010-11-13
	 *      Author: dell
	 *      ??????
	 */


	public static int Main()
	{
		int x;
		int i;
		int[] n = new int[100];
		int[] m = new int[100];
		int j;
		int k;
		n[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (m[1] != n[1])
		{
		for (i = 1;i <= 100;i++)
		{
			if (n[i] % 2 == 0)
			{
				n[i + 1] = n[i] / 2;
			}
			else if (n[i] % 2 != 0 && n[i] != 1)
			{
				n[i + 1] = (n[i] - 1) / 2;
			}
			else if (n[i] % 2 != 0 && n[i] == 1)
			{
				break;
			}
		}
		for (j = 1;j <= 100;j++)
		{
			if (m[j] % 2 == 0)
			{
				m[j + 1] = m[j] / 2;
			}
			else if (m[j] % 2 != 0 && m[j] != 1)
			{
				m[j + 1] = (m[j] - 1) / 2;
			}
			else if (m[j] % 2 != 0 && m[j] == 1)
			{
				k = j;
				break;
			}
		}
		for (i = 1;i <= 100;i++)
		{
			for (j = 1;j <= k;j++)
			{
			if (m[j] == n[i])
			{
				break;
			}
			}
			if (m[j] == n[i])
			{
				break;
			}
		}


		x = m[j];
		System.out.print(x);
		System.out.print("\n");
		}
		else
		{
			System.out.print(m[1]);
			System.out.print("\n");
		}

		return 0; //????
	}
}

