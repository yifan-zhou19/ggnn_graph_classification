package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int sushu(int x)
	{
		for (i = 2;i < x / 2;i++)
		{
			if (x % i == 0)
			{
				break;
			}
		}
		if (i >= x / 2)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int huiwen(int p)
	{
		int[] s = new int[10];
		int k;
		int d;
		int t = 0;
		d = p;
		for (i = 0;p != 0;i++)
		{
			s[i] = p % 10;
			p /= 10;
		}
		for (k = 0;k < i;k++)
		{
			t = t * 10 + s[k];
		}
		if (d == t)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int Main()
	{
		int n;
		int m;
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
		for (;m <= n;m++)
		{
			if (sushu(m) != 0 && huiwen(m) != 0)
			{
					System.out.printf("%d",m);
					break;
			}
		}
		if (m > n)
		{
			System.out.print("no");
		}
		m++;
		for (;m <= n;m++)
		{
			if (sushu(m) != 0 && huiwen(m) != 0)
			{
				System.out.printf(",%d",m);
			}
		}
	}
}

