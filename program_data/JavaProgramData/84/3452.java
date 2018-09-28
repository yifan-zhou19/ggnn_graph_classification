package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int m;
		int n;
		int i;
		int j;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		j = n = a[0];
		for (i = 0;i < 100;i++)
		{
			if (a[i] > n)
			{
				n = a[i];
			}

		}
		for (i = 0;i < 100;i++)
		{
			if (a[i] == n)
			{
				s = i;
			}

		}
		for (i = 0;i < s;i++)
		{
			if (a[i] > j)
			{
				j = a[i];
			}

		}
	for (i = s + 1;i < m;i++)
	{
			if (a[i] > j)
			{
				j = a[i];
			}

	}
	System.out.printf("%d\n%d\n",n,j);
	}

}

