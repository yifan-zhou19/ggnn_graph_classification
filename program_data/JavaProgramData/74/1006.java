package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = int i;
		int g = int i;
		int i;
		int m;
		int n;
		int k = 0;
		int j;
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
			if (f(i) == 0 && g(i) == 0)
			{
				System.out.printf("%d",i);
				k++;
			break;
			}
		}
		for (j = i + 1;j <= n;j++)
		{
			if (f(j) == 0 && g(j) == 0)
			{
				System.out.printf(",%d",j);
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("no");
		}
	}
	public static int f(int i)
	{
		int r;
		for (r = 2;r <= Math.sqrt(i);r++)
		{
			if (i % r == 0)
			{
				return 1;
				break;
			}
		}
		return 0;
	}
	public static int g(int i)
	{
		int h = int x;
		int k;
		int j = 0;
		int s;
		k = i;
		while (k >= 10)
		{
			k = k / 10;
		j++;
		}
		for (s = 0;s < j;s++)
		{
			if ((i % h(s + 1) - i % h(s)) / h(s) != (i / h(j - s)) % 10)
			{
				return 1;
			}
		}
		return 0;
	}
	public static int h(int x)
	{
		int s = 1;
		int i;
		for (i = 0;i < x;i++)
		{
			s = s * 10;
		}
		return s;
	}
}

