package <missing>;

public class GlobalMembers
{
	public static int p = 0;
	public static int huiwen(int x)
	{
		int m;
		int n;
		if (x == 0)
		{
			return (0);
		}
		else
		{
			m = x % 10;
			n = x / 10;
			p = (p + m) * 10;
			huiwen(n);
		}
		return (0);
	}
	public static int sushu(int x)
	{
		int m;
		int i;
		int t = 1;
		m = Math.sqrt(x);
		for (i = 2;i <= m;i++)
		{
			if ((x % i) == 0)
			{
				t = 0;
				break;
			}
		}
		return (t);
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j = 0;
		int[] a = new int[100];
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
			p = 0;
			huiwen(i);
			if ((p / 10) == i)
			{
				if (sushu(i) == 1)
				{
					j = j + 1;
					a[j] = i;
				}
			}
		}
		if (a[1] != 0)
		{
			for (i = 1;i < j;i++)
			{
				System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d",a[j]);
		}
		else
		{
			System.out.print("no");
		}
	}
}

