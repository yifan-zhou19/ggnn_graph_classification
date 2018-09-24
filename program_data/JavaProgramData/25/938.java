package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int n;
		int sum;
		while (scanf("%d", n) != EOF)
		{
			sum = 1;
			int[] a = new int[10000];
			for (i = 1;i < 10000;i++)
			{
				a[i] = 0;
			}
			a[0] = 1;
			for (k = 1;k <= n;k++)
			{
				for (i = 0;i < sum;i++)
				{
					a[i] = a[i] * 2;
				}
				for (i = 0;i < sum;i++)
				{
					if (a[i] >= 10)
					{
						a[i + 1] = a[i + 1] + a[i] / 10;
						if (i + 1 == sum)
						{
							sum++;
						}
						a[i] = a[i] % 10;
					}
				}
			}
			for (i = sum - 1;i >= 0;i--)
			{
				System.out.printf("%d",a[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}
