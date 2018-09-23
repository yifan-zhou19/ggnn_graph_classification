package <missing>;

public class GlobalMembers
{
	public static int f(int a,int b)
	{
		int i;
		int p;
		int q;
		for (i = b,p = 0;i <= Math.sqrt(a);i++)
		{
			if (a % i == 0)
			{
				q = f(a / i, i);
				p = p + q;
			}
		}
		p++;
		return (p);
	}
	public static void Main()
	{
		int i;
		int a;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			k = f(a, 2);
			System.out.printf("%d\n",k);
		}

	}
}

