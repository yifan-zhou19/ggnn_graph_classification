package <missing>;

public class GlobalMembers
{
	public static int func(int p,int q)
	{
		int t;
		if (p == 1 || q == 1)
		{
			return 1;
		}
		if (p > q)
		{
			t = func(p, q - 1) + func(p - q, q);
		}
		else if (p == q)
		{
			t = func(p, q - 1) + 1;
		}
		else
		{
			t = func(p, p);
		}
		return (t);
	}
	public static int Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int a;
			int b;
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
			System.out.printf("%d\n",func(a, b));
		}
		return 0;
	}

}

