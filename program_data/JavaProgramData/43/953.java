package <missing>;

public class GlobalMembers
{
	public static int sushu(int w)
	{
		int c;
		int d;
		d = 1;
		c = 2;
		while (c <= w - 1)
		{
			if (w % c == 0)
			{
				d = 0;
			break;
			}
			c++;
		}
		return d;
	}

		public static int Main()
		{
		int m;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		p = 3;
		while (p <= m / 2)
		{
			if (sushu(p) != 0 && sushu(m - p) != 0)
			{
				System.out.printf("%d %d\n",p,m - p);
			}
			p++;
		}
		return 0;
		}
}

