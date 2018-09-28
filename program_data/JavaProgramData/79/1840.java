package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
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
			if (n == 0 && m == 0)
			{
				break;
			}
			int i;
			int j;
			int h = n;
			int[] a = new int[301];
			for (j = 1;j <= n;j++)
			{
				a[j] = j;
			}
			for (j = 1;n >= 2;n--)
			{
				if ((j + m - 1) % n != 0)
				{
					j = (j + m - 1) % n;
				}
				else
				{
					j = n;
				}
				for (i = 1;i <= h;i++)
				{
					if (a[i] == j)
					{
						a[i] = 0;
						break;
					}
				}
				for (;i + 1 <= h;i++)
				{
					if (a[i + 1] != 0)
					{
						a[i + 1]--;
					}
				}
			}
			for (i = 1;i <= h;i++)
			{
				if (a[i] != 0)
				{
					System.out.printf("%d\n",i);
				}
			}
		}
		return 0;
	}

}

