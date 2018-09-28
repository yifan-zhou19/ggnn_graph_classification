package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sushu = int;
		int huiwen = int;
		int n;
		int m;
		int x;
		int count = 0;
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
		for (x = m;x <= n;x++)
		{
			if (sushu(x) == 1 && huiwen(x) == 1)
			{
				if (count == 0)
				{
					System.out.printf("%d",x);
				}
				else
				{
					System.out.printf(",%d",x);
				}
				count++;
			}
		}
		if (count == 0)
		{
			System.out.print("no\n");
		}
	}
	public static int sushu(int x)
	{
		int i;
		int k = 0;
		int j;
		j = (int)(Math.sqrt(x)) + 1;
		for (i = 2;i <= j;i++)
		{
			if (x % i == 0 && x != i)
			{
				break;
			}
		}
		if (i == j + 1)
		{
			k = 1;
		}
		return (k);
	}
	public static int huiwen(int x)
	{
		int z = 0;
		int y = 0;
		int i;
		int k;
		k = x;
		while (x != 0)
		{
		i = x - (int)(x / 10) * 10;
		y = y * 10 + i;
		x = (int)(x / 10);
		}
		if (y == k)
		{
			z = 1;
		}
		return (z);
	}

}

