package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2010-12-24
	 *      Author: 10265
	 */
	public static int Main()
	{
		int n;
		int[] xulie = new int[501];
		int[] jishu = new int[501];
		int i;
		int j;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < n;i++)
	   {
		xulie[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (xulie[i] % 2 == 1)
		{
		jishu[k] = xulie[i];
		k++;
		}
	   }
		for (i = 0;i < k - 1;i++)
		{
			for (j = 0;j < k - 1 - i;j++)
			{
				if (jishu[j] > jishu[j + 1])
				{
					int temp = jishu[j];
					jishu[j] = jishu[j + 1];
					jishu[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.print(jishu[i]);
			System.out.print(",");
		}
		System.out.print(jishu[k - 1]);
		System.out.print("\n");
		return 0;
	}

}

