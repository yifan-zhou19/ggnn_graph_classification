package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int ss = int x;
		int hws = int y;
		int[] a = new int[1000];
		int m;
		int n;
		int i;
		int j = 0;
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
			if (ss(i) == 1 && (i == hws(i)))
			{
				a[j] = i;
				j++;
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d",a[i]);
			if (i < j - 1)
			{
				System.out.print(",");
			}
		}
		if (j == 0)
		{
			System.out.print("no");
		}
	}

	public static int ss(int x)
	{
		int b;
		for (b = 2;b <= (x - 1) / 2;b++)
		{
			if (x % b == 0)
			{
				return (0);
				break;
			}
		}
		if (b > (x - 1) / 2)
		{
			return (1);
		}
	}

	public static int hws(int y)
	{
		int z = 0;
		while (y > 0)
		{
			z = z * 10 + (y - (y / 10) * 10);
			y = y / 10;
		}
		return (z);
	}
}

