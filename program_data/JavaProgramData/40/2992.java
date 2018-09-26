package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  double[] a = new double[4];
		  double j;
		  double s;
		  double S;
		  int i = 0;
		  for (i = 0;i < 4;i++)
		  {
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Double.parseDouble(tempVar);
			}
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  j = Double.parseDouble(tempVar2);
		  }
		  j = (j / 180) * 3.1415926 / 2;
		  s = (a[0] + a[1] + a[2] + a[3]) / 2;
		  if ((s - a[0]) * (s - a[1]) * (s - a[2]) * (s - a[3]) - a[0] * a[1] * a[2] * a[3] * Math.cos(j) * Math.cos(j) >= 0.getValue() != 0)
		  {
		  S = Math.sqrt((s - a[0]) * (s - a[1]) * (s - a[2]) * (s - a[3]) - a[0] * a[1] * a[2] * a[3] * Math.cos(j) * Math.cos(j));
		  System.out.printf("%.4lf\n",S);
		  }
		  else
		  {
			  System.out.print("Invalid input");
		  }

	}

}

