package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n = 1;
		int i;
		int m = 0;
		int ci = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (System.in.read() == ',')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[n++] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (m < a[i])
			{
				m = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != m)
			{
				if (a[i] > ci)
				{
					ci = a[i];
				}
			}
		}
		if (ci == -1)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",ci);
		}
	}
}

