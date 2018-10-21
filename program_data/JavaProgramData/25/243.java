package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int e = 0;
		int[] a = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = 1;
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < 50;j++)
			{
				a[j] *= 2;
			}
				for (k = 0;k < 50;k++)
				{
					if (a[k] > 9)
					{
						a[k] = a[k] % 10;
						a[k + 1] += 1;

					}
				}
		}
		for (i = 49;i >= 0;i--)
		{
			if (e == 1)
			{
				System.out.printf("%d",a[i]);
			}
			if (a[i] != 0)
			{
				if (e == 0)
				{
					System.out.printf("%d",a[i]);
					e = 1;
				}
			}

		}
		return 0;
	}

}

