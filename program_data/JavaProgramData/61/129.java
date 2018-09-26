package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int num = k;
		int n;
		int i;
		int m;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			m = num(k);
			System.out.printf("%d\n",m);
		}
	}

	public static int num(k UnnamedParameter)
	{
		int p;
		int a = 0;
		int b = 1;
		int c = 1;
		for (p = 1;p <= k;p++)
		{
			a = b;
			b = c;
			c = a + b;
		}
		return (a);
	}
}

