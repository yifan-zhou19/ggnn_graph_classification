package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int j;
		int i;
		int k = 0;
		int h;
		int d;
		int x;
		int y;
		int z;
		int[] a = new int[2000];
		int[] b = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
				if (j == i - 1)
				{
					a[k] = i;
					k++;
				}
			}
		}
		for (i = 0,z = 0;i <= k - 1;i++)
		{
			for (h = 100000,d = 1;d <= 6;d++)
			{
				h = h / 10;
				if (a[i] / h != 0)
				{
					break;
				}
			}
			for (j = 0,x = 1;j <= 5 - d;j++)
			{
				y = x;
				x = x * 10;
				b[5 - d - j] = (a[i] % x) / y;
			}
			for (j = 0;j <= 5 - d;j++)
			{
				if (b[j] != b[5 - d - j])
				{
					break;
				}
				if (j == 5 - d)
				{
					z = z + 1;
				if (z == 1)
				{
					System.out.printf("%d",a[i]);
				}
				if (z > 1)
				{
					System.out.printf(",%d",a[i]);
				}
				}
			}
		}
		if (z == 0)
		{
			System.out.print("no");
		}

		System.out.print("\n");
	}

}

