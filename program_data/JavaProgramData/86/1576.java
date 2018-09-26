package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int[] a = new int[100];
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				sum = 60;
				System.out.printf("%d\n",sum);
				continue;
			}
			else
			{
				for (j = 0;j < m;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[j] = Integer.parseInt(tempVar3);
					}
				}
				if (a[m - 1] + m * 3 <= 60)
				{
						 sum = a[m - 1] + (60 - a[m - 1] - 3 * m);
				}
				else if (60 - (a[m - 1] + (m - 1) * 3) < 3 && 60 - (a[m - 1] + (m - 1) * 3) >= 0)
				{
					sum = a[m - 1];
				}
				else if (a[m - 2] + (m - 1) * 3 <= 60)
				{
						sum = a[m - 2] + (60 - a[m - 2] - 3 * (m - 1));
				}
				else if (60 - (a[m - 2] + (m - 2) * 3) < 3 && 60 - (a[m - 2] + (m - 2) * 3) >= 0)
				{
						sum = a[m - 2];
				}


			}
			System.out.printf("%d\n",sum);
		}

		return 0;
	}


}

