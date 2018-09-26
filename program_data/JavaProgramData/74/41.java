package <missing>;

public class GlobalMembers
{
	public static int p(int k)
	{
		int i;
		int a;
		int c;
		for (i = 2;i < k;i++)
		{
			a = k % i;
		if (a == 0)
		{
			c = 1;
		break;
		}
		}
		if (c != 1)
		{
			c = 0;
		}
		return (c);
	}
	public static int q(int x)
	{
	 int n = 1;
	 int y = 0;
	 int m;
	 int w;
		m = x;
		while (x != 0)
		{
		x /= 10;
		n *= 10;
		}
		n /= 10;
		x = m;
		while (x != 0)
		{
	  y = y + (x % 10) * n;
			x /= 10;
			n /= 10;
		}
		if (y == m)
		{
			w = 0;
		}
		else
		{
		w = 1;
		}
		return (w);
	}


	public static void Main()
	{
		int m;
		int n;
		int a;
		int b;
		int i;
		int j = 0;
		int c;
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
	for (i = 0;i <= n - m;i++)
	{
		a = p(m + i);
	b = q(m + i);
	if (a == 0 && b == 0)
	{
		System.out.printf("%d",m + i);
	j = j + 1;
	c = i;
	break;
	}
	}
	for (i = c + 1;i <= n - m;i++)
	{
		a = p(m + i);
	b = q(m + i);
	if (a == 0 && b == 0)
	{
		System.out.printf(",%d",m + i);
	j = j + 1;
	}
	}
	if (j == 0)
	{
	System.out.print("no");
	}


	}

}

