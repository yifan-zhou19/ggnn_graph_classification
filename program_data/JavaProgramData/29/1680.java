package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int i;
	  int p;
	  double x;
	  double y;
	  double z;
	  double[] a = new double[2000];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	x = 2;
	y = 1;
	a[0] = 0;
	  for (i = 1;i <= 20;i++)
	  {
		a[i] = a[i - 1] + x / y;
		z = x + y;
		y = x;
		x = z;
		//printf("%lf %lf %lf\n",x,y,z);
	  }
	  for (i = 1;i <= m;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = Integer.parseInt(tempVar2);
		}
		System.out.printf("%.3lf\n",a[p]);
	  }
	}
}

