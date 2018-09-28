package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int c;
		int m = 0;
		int n;
		int k;
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
		i = n;
		a = n - 1;
		c = 1;
		while (i > 0)
		{
			if (a % (n - 1) == 0)
			{
				m = (a / (n - 1) * n) + k;
				a = m;
				i--;
			}
			else
			{
				c++;
				m = 0;
				a = c * (n - 1);
				i = n;
			}
		}
		System.out.printf("%d\n",m);
		return 0;
	}
}

