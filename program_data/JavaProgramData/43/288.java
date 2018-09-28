package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] a = new int[10000];
		int i;
		int j;
		int k;
		for (i = 2,k = 0;i < 10000;i++)
		{
			for (j = 2;j <= i;)
			{
				if (i % j == 0)
				{
					break;
				}
				j++;
			}
			if (j == i)
			{
				a[k] = i;
				k++;
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;a[i] <= m;i++)
		{
			for (j = i;a[j] <= m - a[i];j++)
			{
				if (a[i] + a[j] == m)
				{
					System.out.printf("%d %d\n",a[i],a[j]);
				}
			}
		}
		return 0;
	}
}

