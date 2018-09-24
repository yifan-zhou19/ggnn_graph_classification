package <missing>;

public class GlobalMembers
{
	public static int f(int s)
	{
		int t;
		for (t = 3;t <= (int)Math.sqrt(s);t = t + 2)
		{
			if (s % t == 0)
			{
				break;
			}
		}
		if (t > (int)Math.sqrt(s))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void Main()
	{
		int m;
		int k;
		int h;
		int i;
		int d;
		int r = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			d = Integer.parseInt(tempVar);
		}
		for (m = 6;m <= d;m = m + 2)
		{
		   for (i = 3;i < (m / 2 + 1);i = i + 2)
		   {
				k = i;
				h = m - i;
				r = 0;
				if (f(k) != 0 && f(h) != 0)
				{
				   System.out.printf("%d=%d+%d\n",m,k,h);
				   break;
				}
		   }
		}
	}

}

