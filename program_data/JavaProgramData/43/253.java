package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int i;
		int j;
		int k = 1;
		int[] a = new int[100000];
		int b;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= num;i++)
		{
			for (j = 2;j <= i;j++)
			{
				if (i % j == 0)
				{
					if (i == j)
					{
						a[k] = j;
						k++;
					}
				else
				{
				break;
				}
				}
			}
		}

		for (k;k >= 1;k--)
		{
			for (b = 1;b <= k;b++)
			{
				if (a[k] + a[b] == num)
				{
					System.out.printf("%d %d\n",a[b],a[k]);
				}
			}
		}
		return 0;
	}
}

