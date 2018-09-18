package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		int[] a = new int[16];
		int sum = 0;
		int k = 0;
		while (scanf("%d", a[0]) && a[0] != -1)
		{
		for (i = 1;i <= 16;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (a[i] != 0)
			{
				sum++;
			}
			else
			{
				break;
			}
		}
		for (i = 0;i <= sum;i++)
		{
			for (j = i + 1;j <= sum;j++)
			{
				if (a[i] == 2 * a[j] || a[j] == a[i] * 2)
				{
					k++;
				}
			}
		}
		System.out.printf("%d\n",k);
		sum = 0;
		k = 0;
		}
		return 0;
	}
}

