package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		int b;
		int c;
		int d;
		int e;
		int n;
		n = 2;
		while (n <= a)
		{
			if (n == 2)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					d = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					e = Integer.parseInt(tempVar3);
				}
				if (d >= e)
				{
					b = d;
					c = e;
				}
				else
				{
					b = e;
				c = d;
				}
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					d = Integer.parseInt(tempVar4);
				}
				if (d >= b)
				{
					c = b;
					b = d;
				}
				else if (d >= c)
				{
					c = d;
				}
			}
		n++;
		}
		System.out.printf("%d\n%d\n",b,c);
		return 0;
	}

}

