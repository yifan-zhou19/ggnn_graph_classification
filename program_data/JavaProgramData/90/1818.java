package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int m,int n);
		int z;
		int a;
		int b;
		int i;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			z = Integer.parseInt(tempVar);
		}
		for (i = 0;i < z;i++)
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
		sum = f(a, b);
		System.out.printf("%d\n",sum);
		}
		return 0;
	}
	public static int f(int m,int n)
	{
		if (n == 1 || m == 0 || m == 1)
		{
			return 1;
		}
		if (m < 0)
		{
			return 0;
		}
		return f(m, n - 1) + f(m - n, n);
	}

}

