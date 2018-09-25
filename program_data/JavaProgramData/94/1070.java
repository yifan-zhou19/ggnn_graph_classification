package <missing>;

public class GlobalMembers
{
	/*
	 *  Name:JudgeCars.cpp
	 *
	 *  Created on: 2012-11-05
	 *  Author: ??
	 *  Function?????????
	 */


	public static int Main()
	{
		int N;
		int count = 0;
		int i;
		int j;
		int temp;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] shuru = new int[N];
		int[] shuchu = new int[N];
		for (i = 0;i < N;i++)
		{
			shuru[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (shuru[i] % 2 == 1)
			{
				shuchu[count] = shuru[i];
				count++;
			}
		}
		for (i = 0;i < count - 1;i++)
		{
			for (j = 0;j < count - 1 - i;j++)
			{
				if (shuchu[j] > shuchu[j + 1])
				{
					temp = shuchu[j];
					shuchu[j] = shuchu[j + 1];
					shuchu[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < count;i++)
		{
			if (i != 0)
			{
				System.out.print(',');
			}
			System.out.print(shuchu[i]);
		}
	}

}

