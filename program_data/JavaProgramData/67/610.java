package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int i;
	  double m0;
	  double m;
	  double x;
	  double[] a = new double[n + 1];
	  double[] b = new double[n + 1];
	  double t0;
	  double t;
	  for (i = 0;i < n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Double.parseDouble(tempVar3);
		}
	  }
	  t0 = a[0] - b[0];
	  m0 = t0 / a[0];
	  for (i = 1;i < n;i++)
	  {
		t = a[i] - b[i];
		m = t / a[i];
		if (m >= m0)
		{
		  x = m - m0;
		  if (x > 0.05)
		  {
			System.out.print("worse\n");
		  }
		  else
		  {
			System.out.print("same\n");
		  }
		}
		else
		{
		  x = m0 - m;
		  if (x > 0.05)
		  {
			 System.out.print("better\n");
		  }
		  else
		  {
			System.out.print("same\n");
		  }
		}
	  }
	}

}

