package <missing>;

public class GlobalMembers
{
	/**
	*@file 1.cpp
	*@author ???
	*@date 2013-10-30
	*@description ??
	*/


	public static int Main()
	{
		int[] a = new int[30];
		int i;
		int j;
		int count1;
		int count2;
		while (scanf("%d", a[0]), a[0] != -1)
		{
		count2 = 0;
		i = 0;
		while (a[i] != 0)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[++i] = Integer.parseInt(tempVar);
			}
		}
		count1 = i - 1;
		for (i = 0; i <= count1; i++)
		{
			for (j = i + 1; j <= count1; j++)
			{
				if (a[i] == 2 * a[j] || a[j] == 2 * a[i])
				{
				count2++;
				}
			}
		}
		System.out.print(count2);
		System.out.print("\n");
		}
		return 0;
	}

}

