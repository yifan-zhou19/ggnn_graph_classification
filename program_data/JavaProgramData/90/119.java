package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int z;
		if (n > m)
		{
			n = m;
		}
		if (m == 1 || n == 1)
		{
			z = 1;
		}
		else if (m == 0 || n == 0)
		{
			z = 1;
		}
		else
		{
		z = f(m - n, n) + f(m, n - 1);
		}
		return (z);
	}

	public static void Main()
	{
	int t;
	int i;
	int M;
	int N;
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
			M = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			N = Integer.parseInt(tempVar3);
		}
		System.out.printf("%d\n",f(M, N));
	}
	}
}

