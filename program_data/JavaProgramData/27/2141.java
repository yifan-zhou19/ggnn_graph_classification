package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double[] d = new double[20]; //????????
		double[] e = new double[20];
		double[] f = new double[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int s;
		int t;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double y;
		double z;
		for (s = 1;s <= n;s++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  d[s] = Double.parseDouble(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  e[s] = Double.parseDouble(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  f[s] = Double.parseDouble(tempVar4);
		  }
		}
		for (t = 1;t <= n;t++)
		{
		  a = d[t]; //?????????
		  b = e[t];
		  c = f[t];

		if (b * b - 4 * a * c >= 0)
		{
		  if (b * b - 4 * a * c > 0)
		  {
			x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
		  }
		  else
		  {
			x1 = (-b) / (2 * a);
			x2 = (-b) / (2 * a);
			System.out.printf("x1=x2=%.5lf\n",x1);
		  }
		}
		else
		{
		  y = (-b) / (2 * a);
		  z = Math.sqrt(4 * a * c - b * b) / (2 * a);
		  if (Math.abs(y) < 0.00001)
		  {
			  y = 0;
		  }
		  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",y,z,y,z);
		}
		}
	System.in.read();
	System.in.read();
	return 0;
	}


}

