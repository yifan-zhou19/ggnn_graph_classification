package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int m,int n);
		int k;
		int i;
		int m;
		int w;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
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
			w = f(m, n);
			System.out.printf("%d\n",w);
		}
	}
		public static int f(int m,int n)
		{
			if (m == 0 || n == 1)
			{
				return (1);
			}
			if (m < n)
			{
				return f(m, m);
			}
			else
			{
				return f(m, n - 1) + f(m - n, n);
			}
		}

}

