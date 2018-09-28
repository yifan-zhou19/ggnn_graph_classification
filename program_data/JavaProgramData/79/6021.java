package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] a = new int[300];
		int i;
		int j;
		int k;
		int p;
		for (;;)
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
			if (m == 0 && n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				a[i] = i + 1;
			}
			p = 0;
			for (k = 1;k < n;k++)
			{
				for (i = 0;i < m;)
				{
					p = p % n;
					if (a[p] != 0)
					{
						i++;
					}
					if (i == m)
					{
						a[p] = 0;
					}
					p++;
				}
			}
			for (j = 0;j < n;j++)
			{
				if (a[j] != 0)
				{
		System.out.printf("%d\n",a[j]);
				}
			}

		}
	return 0;
	}

}

