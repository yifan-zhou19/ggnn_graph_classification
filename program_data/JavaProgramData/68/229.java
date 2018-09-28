package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			int k;
			int p;
			for (k = 3;k <= i / 2;k = k + 2)
			{
				p = i - k;
				int a;
				int b;
				int c;
				int d;
				c = (int)Math.sqrt(k + 1);
				d = (int)Math.sqrt(p + 1);
				for (a = 2;a <= c;a++)
				{
					if (k % a == 0)
					{
						break;
					}
				}
				for (b = 2;b <= d;b++)
				{
					if (p % b == 0)
					{
						break;
					}
				}
				if (a >= c + 1 && b >= d + 1)
				{
					System.out.printf("%d=%d+%d\n",i,k,p);
										 break;
				}
			}
		}
			return 0;
	}

}

