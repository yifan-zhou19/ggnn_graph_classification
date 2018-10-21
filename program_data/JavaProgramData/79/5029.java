package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[500];
		while (true)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (n == 0 && m == 0)
		{
			break;
		}
		for (i = 0;i < n;i++)
		{
			a[i] = i + 1;
		}
		j = 1;
		while (n != 1)
		{
			j--;
			for (i = 1;i <= m;i++)
			{
				if (j + 1 > n)
				{
					j = 1;
				}
				else
				{
					j++;
				}
			}
			for (i = j;i <= n - 1;i++)
			{
				a[i - 1] = a[i];
			}
			n--;
		}
		System.out.printf("%d\n",a[0]);
		}
	}

}

