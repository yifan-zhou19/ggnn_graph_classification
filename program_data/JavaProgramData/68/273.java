package <missing>;

public class GlobalMembers
{
	public static int a(float b)
	{
		int i;
		int c = 1;
		int d;
		d = Math.sqrt(b);
		if (b == 3.0F || b == 5.0F || b == 7.0F)
		{
			return 1;
		}
		else
		{
			for (i = 3;i <= d;i += 2)
			{
				if ((int)(b) % i == 0)
				{
					c = 0;
					return 0;
					break;
				}
			}
		}
		return c;
	}
	public static int Main()
	{
		int n;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (l = 6;l <= n;l += 2)
		{
			for (k = 3;k <= (n / 2);k += 2)
			{
				if (a(k) + a(l - k) == 2)
				{
					System.out.printf("%d=%d+%d\n",l,k,l - k);
					break;
				}
			}
		}
		return 0;
	}


}

