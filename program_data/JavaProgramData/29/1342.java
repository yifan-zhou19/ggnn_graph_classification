package <missing>;

public class GlobalMembers
{
	public static double add(int n)
	{
		double b = 2.0;
		double a = 1.0;
		double c;
		double s = 0;
		for (;n > 0;n--)
		{
			s += b / a;
			c = a;
			a = b;
			b = c + b;
		}
		return s;
	}
	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] sz = new int[m];
		int i;
		for (i = 0;i < m;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  sz[i] = Integer.parseInt(tempVar2);
		  }
		}
		double a;
		for (i = 0;i < m;i++)
		{
		  a = add(sz[i]);
		  System.out.printf("%.3lf\n",a);
		}
		return 0;
	}

}

