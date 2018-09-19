package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int k;
		int j;
		int sum = 0;
		int m;

		for (k = 1; ;k++)
		{
			sum = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[0] = Integer.parseInt(tempVar);
			}
			if (a[0] == -1)
			{
				break;
			}
			if (a[0] != -1)
			{
				for (i = 1; ;i++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i] = Integer.parseInt(tempVar2);
					}
					if (a[i] == 0)
					{
						m = i;
						break;
					}
				}
			}
			for (i = 0;i < m - 1;i++)
			{
				for (j = i + 1;j < m;j++)
				{
					if (a[i] == 2 * a[j] || a[j] == 2 * a[i])
					{
						sum = sum + 1;
					}
				}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

