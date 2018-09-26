package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int huiwen = int x;
		int sushu = int x;
		int m;
		int n;
		int i;
		int t = 0;
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
			if ((huiwen(i)) != 0 && (sushu(i)) != 0)
			{
				t++;
				if (t != 1)
				{
					System.out.print(",");
				}
				System.out.printf("%d",i);
			}
		}
		if (t == 0)
		{
			System.out.print("no\n");
		}
	}
	public static int huiwen(int x)
	{
		int y = 0;
		int t;
		t = x;
		while (x != 0)
		{
			y = y * 10 + x % 10;
			x = x / 10;
		}
		if (y == t)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int sushu(int x)
	{
		int i;
		int t;
		int r = 0;
		t = Math.sqrt(x);
		for (i = 2;i <= t;i++)
		{
			if (x % i == 0)
			{
				r = 1;
				break;
			}
		}
		if (r == 0)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}


}

