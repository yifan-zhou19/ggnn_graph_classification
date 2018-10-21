package <missing>;

public class GlobalMembers
{
	public static int is_huiwen(int x)
	{
		int r = 0;
		int xx;
		xx = x;
		while (xx != 0)
		{
			r = r * 10 + xx % 10;
			xx = xx / 10;
		}
		if (r == x)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int is_sushu(int x)
	{
		int y;
		int f = 1;
		if (x == 2)
		{
			return 1;
		}
		else if (x % 2 == 0)
		{
			return 0;
		}
		else
		{
			for (y = 3;y <= (int)Math.sqrt(x);y += 2)
			{
				if (x % y == 0)
				{
					f *= 0;
				}
			}
			return f;
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int a;
		int[] num = new int[50];
		int i;
		int f = -1;
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
		for (a = m;a <= n;a++)
		{
			if (is_sushu(a) != 0 && is_huiwen(a) != 0)
			{
				f++;
				num[f] = a;
			}
		}
		if (f == 0)
		{
			System.out.printf("%d",num[0]);
		}
		else if (f > 0)
		{
			System.out.printf("%d",num[0]);
			for (i = 1;i <= f;i++)
			{
				System.out.printf(",%d",num[i]);
			}
		}
		else
		{
			System.out.print("no");
		}
	}

}

