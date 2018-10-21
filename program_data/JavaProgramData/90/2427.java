package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int a,int b);
		int n;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;n - .0;)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b = Integer.parseInt(tempVar3);
				}
		System.out.printf("%d\n",f(a, b));
		}
	}
	public static int f(int a,int b)
	{
		if (a > 0 && b > 1)
		{
			return (f(a, b - 1) + f(a - b, b));
		}
		else if (a < 0 || b <= 0)
		{
			return (0);
		}
		else
		{
			return (1);
		}
	}

}

