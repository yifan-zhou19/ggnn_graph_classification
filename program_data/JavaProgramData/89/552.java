package <missing>;

public class GlobalMembers
{
	/*
	 * xiaoceyan54.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: dyj
	 *      ?????????n?????n????
	 *      ????????i?j???i??j???0?i,j<n?
	 *      ???????0 0????????
	 *
	 *      ????????????????????????�NOT FOUND�?
	 */


	public static int Main()
	{
		int n;
		int i;
		int j;
		int max = 0;
		int famous;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] fame = new int[n];
		for (i = 0;i < n;i++)
		{
				fame[i] = 0;
		}
		while ((i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (i == 0 && j == 0)
			{
				break;
			}
			fame[j] = fame[j] + 1;
		}
		for (j = 0;j < n;j++)
		{
			if (fame[j] >= max)
			{
				max = fame[j];
				famous = j;
			}
		}
		if (max >= n - 1)
		{
			System.out.print(famous);
			System.out.print("\n");
		}
		else
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}

}

