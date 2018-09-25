package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int k;
		int t;
		int sum;
		int[] a = new int[60];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= n;k++)
		{
			t = 0;
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				sum = 60;
			}
			else
			{
				for (i = 0;i < m;i++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[i] = Integer.parseInt(tempVar3);
					}
				}
				for (i = 1;i <= m;i++)
				{
					if (a[i - 1] + 3 * i <= 60)
					{
						continue;
					}
					if (a[i - 1] + 3 * (i - 1) < 60 && a[i - 1] + 3 * i>60)
					{
						sum = a[i - 1];
						break;
					}
					if (a[i - 1] + 3 * (i - 1) >= 60)
					{
						sum = 60 - 3 * (i - 1);
						break;
					}
				}
					if (i > m)
					{
						sum = 60 - 3 * m;
					}
			}
			System.out.printf("%d\n",sum);
		}
	return 0;
	}

}

