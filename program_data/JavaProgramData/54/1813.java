package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int t;
	public static int f;

	public static void divide(int m)
	{
		if ((m - k) % n != 0)
		{
			f = 0;
			return;
		}
		m = (m - k) * (n - 1) / n;
		t++;
		if (t == n)
		{
			f = m > 0?1:0;
		}
		else
		{
			divide(m);
		}
	}
	public static void Main()
	{
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		m = n;
		while (true)
		{
			t = 0,f = 0;
			divide(m);
			if (f == 1)
			{
				System.out.printf("%d",m);
				break;
			}
			else
			{
				m++;
			}
		}

	}
}

