package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int t;
		int sum;
		int[] num = new int[10000];
		int[] a = new int[10000];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 10000;i++)
		{
			num[i] = 0;
			a[i] = 1;
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				System.out.print("60\n");
			}
			else
			{
				sum = 0;
				for (j = 1;j <= m;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						num[j] = Integer.parseInt(tempVar3);
					}
				}
				for (j = 1;j <= m;j++)
				{
					num[j] += 3 * (j - 1);
					t = num[j];
					a[t + 1] = 0;
					a[t + 2] = 0;
					a[t + 3] = 0;
				}
				for (j = 1;j <= 60;j++)
				{
					sum += a[j];
				}
				System.out.printf("%d\n",sum);
				for (j = 1;j <= 10000;j++)
				{
					num[j] = 0;
					a[j] = 1;
				}
			}
		}
		return 0;
	}
}

