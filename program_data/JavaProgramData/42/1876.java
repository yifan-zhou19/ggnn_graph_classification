package <missing>;

public class GlobalMembers
{
	/**
	*@file 2.cpp
	*@author ???
	*@date 2013-10-30
	*@description ????????
	*/


	public static int[] a = new int[100001];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int count;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		count = 0;
		for (i = 0; i <= n - count - 1; i++)
		{
			if (a[i] == k)
			{
				for (j = i; j < n - count - 1; j++)
				{
				a[j] = a[j + 1];
				}
				count++;
				i--;
			}

		}
		for (i = 0; i < n - count - 1; i++)
		{
		System.out.printf("%d ",a[i]);
		}
	   System.out.printf("%d\n",a[n - count - 1]);
		return 0;
	}
}

