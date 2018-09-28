package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	 int[] sz = new int[1000];
	 double[] l = new double[1000];
	 double a = 2.0000;
	 double b = 1.0000;
	  int i;
	  int j;
	  double c;
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  sz[i] = Integer.parseInt(tempVar2);
		  }
		  l[i] = 0;

	  }
	  for (i = 0;i < n;i++)
	  {
	  a = 2.0000;
	  b = 1.0000;
	  for (j = 0;j < sz[i];j++)
	  {
	  l[i] += a / b;
	   c = a;
	   a = a + b;
	   b = c;

	  }
	  System.out.printf("%.3lf\n",l[i]);
	  }

	}

}

