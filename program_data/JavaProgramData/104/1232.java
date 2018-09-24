package <missing>;

public class GlobalMembers
{
	//???
	public static int Main()
	{
		int fa = new int(int x,int y);
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(fa(x, y));
		return 0;
	}
	public static int fa(int x,int y)
	{
		int[] a = new int[10];
		int[] b = new int[10];
		int i;
		int m;
		int n;
		int p;
		a[0] = x;
		b[0] = y;
		if (x == 1 || y == 1)
		{
			return 1;
		}
		for (i = 1;i <= 10;i++)
		{
			a[i] = a[i - 1] / 2;
			m = i;
			if (a[i] == 1)
			{
				break;
			}
		}
		for (i = 1;i <= 10;i++)
		{
			b[i] = b[i - 1] / 2;
			n = i;
			if (b[i] == 1)
			{
				break;
			}
		}
		if (m > n)
		{
			p = n;
		}
		else
		{
			p = m;
		}
		for (i = 0;i <= p;i++)
		{
			if (a[m - i] != b[n - i])
			{
				break;
			}
		}
		return a[m - i + 1];
	}


}

