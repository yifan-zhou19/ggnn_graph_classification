package <missing>;

public class GlobalMembers
{
	public static int fj(int a,int zs)
	{
		int k;
		int n;
		int z;
		n = 0;
		z = 0;
		for (k = zs;k <= Math.sqrt(a);k++)
		{
			if (a % k == 0)
			{
				n = n + fj(a / k, k);
			z = 1;
			}
		}
			if (z == 0)
			{
				return 1;
			}
			else
			{
				return n + 1;
			}
	}
	public static int Main()
	{
		int m;
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",fj(t, 2));
		}
		return 0;
	}

}

