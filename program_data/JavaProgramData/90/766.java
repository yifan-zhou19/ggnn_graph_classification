package <missing>;

public class GlobalMembers
{
	public static int f(int a,int b)
	{
		if (b == 1)
		{
			return 1;
		}
		if (a < 0)
		{
			return 0;
		}
		else
		{
			return f(a - b, b) + f(a, b - 1);
		}
	}
	public static int Main()
	{
		int w;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (;w > 0;w--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",f(m, n));
		}
	}
}

