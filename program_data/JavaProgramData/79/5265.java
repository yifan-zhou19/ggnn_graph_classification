package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int l;
		int[] a = new int[400];
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

		while (n > 0)
		{
			i = 1;
			j = 0;
			k = 0;
				for (l = 1;l <= n;l++)
				{
				a[l] = 0;
				}
			while (k < (n - 1))
			{
			j = 0;
			while (j < m)
			{
				if (a[i] == 0)
				{
	j++;
				}

				i++;

				if (i > n)
				{
					i = 1;
				}
			}
			if (i == 1)
			{
				a[n] = 1;
			}
			else
			{
				a[i - 1] = 1;
			}
			k++;
			}
			for (l = 1;l <= n;l++)
			{
				if (a[l] == 0)
				{
					System.out.printf("%d\n",l);
				}
			}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
		}
	}
}

