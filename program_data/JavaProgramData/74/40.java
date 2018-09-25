package <missing>;

public class GlobalMembers
{
	public static int ws(int x)
	{
		int i = 1;
		int c = 1;
		for (i = 1;;i *= 10)
		{
			c++;
			if ((i <= x) && (i * 10> x))
			{
				break;
			}
		}
		return (c - 1);
	}
	public static int check1(int x)
	{
		int p = 1;
		int i;
		for (i = 2;i < x;i++)
		{
			if (x % i == 0)
			{
				p = 0;
				break;
			}
		}
		return (p);
	}
	public static int reconstruct(int x)
	{
		int i = 1;
		int res = x % 10;
		while (x != 0)
		{
			x = x / 10;
			res = res * 10 + x % 10;
		}
		return (res / 10);
	}
	public static int check2(int x)
	{
		int p = 0;
		if (x == reconstruct(x))
		{
			p = 1;
		}
		return (p);
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int flag = 0;
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
			if (check1(i) == 1 && check2(i) == 1)
			{
				System.out.printf("%d",i);
			flag = 1;
			break;
			}
		}
		for (j = i + 1;j <= n;j++)
		{
			if (check1(j) == 1 && check2(j) == 1)
			{
			System.out.printf(",%d",j);
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
		System.out.print("\n");
	}
}

