package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int k;
	  int n;
	  int i;
	  int j;
	  double[] x = new double[100];
	  double a;
	  double s;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  k = Integer.parseInt(tempVar);
	  }
	  for (j = 0;j < k;j++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a = 0;
		s = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			a += x[i];
		}
		a = a / n;
		for (i = 0;i < n;i++)
		{
			s += (x[i] - a) * (x[i] - a);
		}
		s = Math.sqrt(s / n);
		System.out.printf("%.5f\n",s);
	  }
	  return 0;
	}
}

