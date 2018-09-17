package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int an;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		an = f(m, n);
		System.out.printf("%d",an);

	}
	public static int f(int a,int b)
	{
		int w;
		if (a == b)
		{
			w = a;
		}
		if (a > b)
		{
			w = f(a / 2, b);
		}
		if (a < b)
		{
			w = f(a, b / 2);
		}
		return w;

	}

}

