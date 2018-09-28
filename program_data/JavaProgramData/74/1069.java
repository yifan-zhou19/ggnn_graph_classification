package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int k;
		int min;
		int max;
		int t = 0;
		int x = 0;
		int y;
		int z = 0;
		int sum = 0;
		int[] a = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			min = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			max = Integer.parseInt(tempVar2);
		}
		for (n = min;n <= max;n++)
		{
			for (i = 2;i < n;i++)
			{
				if (n % i == 0)
				{
					t++;
				}
				else
				{
					continue;
				}
			}
			if (t == 0)
			{
				y = n;
				for (i = 0;i <= 9;i++)
				{
					a[i] = y % 10;
					y = y / 10;
				}
				for (i = 9;i >= 0;i--)
				{
					if (a[i] != 0)
					{
						k = i;
						break;
					}
				}
				for (i = 0;i <= k;i++)
				{
					if (a[i] != a[k - i])
					{
						x++;
					}
				}
				if (x == 0)
				{
					if (z == 0)
					{
						System.out.printf("%d",n);
						z++;
					}
					else
					{
						System.out.printf(",%d",n);
					}
					sum++;
				}
			}
			x = 0;
			t = 0;
			k = 0;
			for (i = 0;i <= 9;i++)
			{
				a[i] = 0;
			}
		}
		if (sum == 0)
		{
			System.out.print("no");
		}
	}
}

