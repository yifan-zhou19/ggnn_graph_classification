package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int d;
		int n;
		int b = 0;
		int a = 0;
		int i = 1;
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
				c = Integer.parseInt(tempVar2);
			}
			if (b > a)
			{
				  d = a;
				  a = b;
				  b = d;
			}
			if (c >= a != 0 && a >= b)
			{
				  b = a;
				  a = c;
			}
			if (a > c && c > b)
			{
				  b = c;
			}
		}
		System.out.printf("%d\n%d",a,b);
		return 0;
	}


}

