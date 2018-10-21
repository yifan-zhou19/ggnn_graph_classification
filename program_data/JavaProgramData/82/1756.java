package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int p;
		int c;
			 int d = 0;
		int i = 0;
		int max = new int(int x,int y);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = 1;p <= n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (90 <= a & a <= 140)
			{
				if (60 <= b & b <= 90)
				{
					i = i + 1;
				}
				else
				{
					i = 0;
				}
			}
			else
			{
				i = 0;
			}
			c = i;
			d = max_int(d, c);
		}
		System.out.printf("%d\n",d);
		return 0;
	}
	public static int max_int(int x,int y)
	{
		int z;
		if (x > y)
		{
			z = x;
		}
		else
		{
			z = y;
		}
		return (z);
	}
}

