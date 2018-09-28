package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int a0;
		int a1;
		int a2;
		int i;
		int r;
		a0 = 1;
		a1 = 1;
		r = 0;
		if (n == 1)
		{
			return 1;
		}
		else if (n == 2)
		{
			return 1;
		}
		else if (n > 2)
		{
		for (i = 0;i < n - 2;i++)
		{
			a2 = a0 + a1;
			r = a2;
			a0 = a1;
			a1 = a2;
		}
		}
		return r;
	}
	public static int Main()
	{
		int a0;
		int a1;
		int i;
		int n;
		int l;
		int[] sz = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l = Integer.parseInt(tempVar);
		}
		for (i = 0;i < l;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
	//		printf("%d",f(n));
			sz[i] = f(n);
		}
		for (i = 0;i < l;i++)
		{
			System.out.printf("%d\n",sz[i]);
		}
		return 0;
	}
	//1,1,2,3,5,8
}

