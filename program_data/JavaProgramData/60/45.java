package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k = 0;
		int[] a = new int[100000];
		int s = 0;
		for (i = 3;i <= n;i++)
		{
			for (j = 2;j <= (int)Math.sqrt(i);j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j >= (int)Math.sqrt(i) + 1)
			{
				a[k] = i;
				k = k + 1;
			}
		}
		if (k == 1)
		{
			System.out.print("empty");
		}
		else
		{
			for (i = 0;i < k - 1;i++)
			{
				for (j = i + 1;j < k;j++)
				{
					if (a[j] - a[i] == 2)
					{
						System.out.printf("%d %d\n",a[i],a[j]);
						break;
					}
				}
			}
		}
	return 0;
	}
}

