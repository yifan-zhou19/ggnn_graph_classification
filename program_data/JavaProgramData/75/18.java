package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n = 1;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		int t1;
		int t2;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (scanf(",%d", a[n]))
		{
			n++;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead(",");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}

		t1 = a[0];
		t2 = b[0];
		for (i = 0;i < n;i++)
		{
			if (t1 > a[i])
			{
				t1 = a[i];
			}
			if (t2 < b[i])
			{
				t2 = b[i];
			}
		}

		for (i = t1;i <= t2;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i >= a[j] != 0 && i < b[j])
				{
					c[i - t1]++;
				}
			}
		}

		j = c[0];
		for (i = 1;i <= t2 - t1;i++)
		{
			if (j < c[i])
			{
				j = c[i];
			}
		}

		System.out.printf("%d %d\n",n,j);
	}


}

