package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[300];
		int u = 0;
		int k = 0;
		int[] b = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a + i = tempVar2;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				if (a[i] == b[j])
				{
					break;
				}
			}
			if (j == n)
			{
				b[k] = a[i];
				k++;
			}
		}
		for (i = 0;i <= k - 2;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d\n",b[k - 1]);
	}
}

