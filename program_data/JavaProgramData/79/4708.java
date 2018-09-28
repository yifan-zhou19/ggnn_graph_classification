package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int i;
		int k = 0;
		for (i = 2;i <= n;i++)
		{
			k = ((m % i) + k) % i;
		}
		return k;
	}

	public static int Main()
	{
		int a;
		int b;
		int i;
		int re;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				b = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a == 0)
			{
				break;
			}
			re = f(a, b) + 1;
			System.out.printf("%d\n",re);
		}
		return 0;

	}
}

