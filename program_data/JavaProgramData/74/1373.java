package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p1 = int x;
		int p2 = int y;
		int m;
		int n;
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (p1(i) == 1 && p2(i) == 0)
			{
				System.out.printf("%d",i);
				k = 1;
				break;
			}
		}
			if (k == 0)
			{
				System.out.print("no");
			}
		for (j = i + 1;j <= n;j++)
		{
			if (p1(j) == 1 && p2(j) == 0)
			{
					System.out.printf(",%d",j);
			}
		}
		System.out.print("\n");
		return 0;
	}
	public static int p1(int x)
	{
		int i;
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
			return 0;
			}
		}
		return 1;
	}
	public static int p2(int y)
	{
		int[] a = new int[100];
		int i;
		int j;
		for (i = 0;;i++)
		{
			a[i] = y % 10;
			y = y / 10;
			if (y == 0)
			{
				break;
			}
		}
		for (j = 0;j <= i / 2;j++)
		{
			if (a[j] != a[i - j])
			{
				return 1;
			}
		}
		return 0;
	}

}

