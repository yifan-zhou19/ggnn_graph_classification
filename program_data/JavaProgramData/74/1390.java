package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int i;
		if (n % 2 == 0)
		{
			return 0;
		}
		for (i = 3;i <= Math.sqrt(n);i += 2)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static void Main()
	{
		int i;
		int x;
		int y;
		int m;
		int n;
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
			x = i;
			y = 0;
			if (sushu(i) == 0)
			{
				continue;
			}
			while (x > 0)
			{
				y = y * 10 + x % 10;
				x /= 10;
			}
			if (y == i)
			{
				if (k++==0)
				{
					System.out.printf("%d",i);
				}
				else
				{
					System.out.printf(",%d",i);
				}
			}
		}
		if (k == 0)
		{
			System.out.print("no");
		}
	}
}

