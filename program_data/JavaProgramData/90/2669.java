package <missing>;

public class GlobalMembers
{
	public static int f(int a,int b)
	{
		if (a == 0 || b == 1)
		{
			return 1;
		}
		if (a < 0)
		{
			return 0;
		}
		return f(a - b, b) + f(a, b - 1);
	}
	public static int Main()
	{
		int t;
		int a;
		int b;
		int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		t = Integer.parseInt(tempVar);
	}

	for (i = 0;i < t;i++)
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
	return 0;
	}
}

