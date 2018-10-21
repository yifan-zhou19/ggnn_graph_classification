package <missing>;

public class GlobalMembers
{
	public static int[] c = new int[1000];
	public static int[] d = new int[1000];
	public static int j;
	public static int Main()
	{
		void f();
		int i;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		for (j = 0;j < s;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d[j] = Integer.parseInt(tempVar2);
			}
			for (i = 2;i <= Math.sqrt(d[j]);i++)
			{
				if (d[j] % i == 0)
				{
					c[j]++;
					f(i, d[j] / i);
				}
			}
		}
		for (j = 0;j < s;j++)
		{
			System.out.printf("%d\n",c[j] + 1);
		}
	}
	public static void f(int s,int m)
	{
		int k;
		for (k = s;k <= Math.sqrt(m);k++)
		{
			if (m % k == 0)
			{
				c[j]++;
				f(k, m / k);
			}
		}
	}

}

