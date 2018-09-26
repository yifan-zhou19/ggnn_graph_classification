package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[maxnum];
		int n;
		int i;
		int j;
		int k;
		int l;
		a[0] = 3;
		k = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 5;i <= n;i = i + 2)
		{
			l = 0;
			for (j = 0; j <= k - 1; j++)
			{
				if (i % a[j] == 0)
				{
					l = 1;
					break;
				}
			}
			if (l == 0)
			{
				a[k] = i;
				k = k + 1;
			}
		}
		if (n < 5)
		{
			System.out.print("empty\n");
		}
		else
		{
			for (i = 0;i <= k - 2;i++)
			{
				if (a[i] == a[i + 1] - 2)
				{
					System.out.printf("%d %d\n",a[i],a[i + 1]);
				}
			}
		}
		return 0;
	}
}

