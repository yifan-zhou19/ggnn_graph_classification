package <missing>;

public class GlobalMembers
{
	public static double qh(int n)
	{
		int i;
		double f1 = 1.0;
		double f2 = 2.0;
		double cur = f2 / f1;
		double e;
		for (i = 2;i <= n;i++)
		{
			e = f2;
			f2 = f1 + f2;
			f1 = e;
			cur += f2 / f1;
		}
		return cur;
	}
	public static int Main()
	{
		int m;
		int k;
		int[] x = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (k = 0;k < m;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[k] = Integer.parseInt(tempVar2);
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *ptr;
		int ptr;
		for (k = 0;k < m;k++)
		{
			ptr = x[k];
			System.out.printf("%.3lf\n",qh(ptr));
		}
		return 0;
	}



}

