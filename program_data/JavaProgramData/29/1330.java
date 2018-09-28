package <missing>;

public class GlobalMembers
{
	public static double sum(int n)
	{
	  int i;
	  double a;
	  double b;
	  double c;
	  double d = 0;
	  double r;
	  a = 1;
	  b = 2;
	  for (i = 1;i <= n;i++)
	  {
		r = b / a;
		c = a;
		a = b;
		b = c + a;
		d = d + r;



	  }
	  return d;

	}
	public static int Main()
	{
	  int m;
	  int i;
	  int[] sz = new int[100];
	  double result = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= m;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[i] = Integer.parseInt(tempVar2);
		}
	  }
	  for (i = 1;i <= m;i++)
	  {
		result = sum(sz[i]);
		System.out.printf("%.3lf\n",result);
	  }
	  return 0;
	}
}

