package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int d = 1;
		int i;
		if (n == 1)
		{
			d = 0;
		}
		else if (n == 2)
		{
			d = 1;
		}
		else
		{
			for (i = 2;i <= n - 1;i++)
			{
				if (n % i == 0)
				{
					d = 0;
					break;
				}
			}
		}
		return (d);
	}
	public static int huiwen(int n)
	{
		int m;
		int s = 0;
		int d = 0;
		int t;
		t = n;
		while (n != 0)
		{
		m = n % 10;
		n = n / 10;
		s = s * 10 + m;
		}
		if (s == t)
		{
			d = 1;
		}
		return d;
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int k;
		int s = 0;
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
			int x = sushu(i);
			int y = huiwen(i);
			if (x == 1 && y == 1)
			{
				System.out.printf("%d",i);
				s++;
				break;
			}
		}
		for (k = i + 1;k <= n;k++)
		{
			int x = sushu(k);
			int y = huiwen(k);
			if (x == 1 && y == 1)
			{
				System.out.printf(",%d",k);
			}
		}
		if (s == 0)
		{
			System.out.print("no");
		}
	return 0;
	}

}

