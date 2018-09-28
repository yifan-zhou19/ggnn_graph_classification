package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int[] age = new int[100];
	  double[] percent = new double[3];
	  double[] sum = new double[3];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			age[i] = Integer.parseInt(tempVar2);
		}
	  }
	  sum[0] = 0;
	  sum[1] = 0;
	  sum[2] = 0;
	  sum[3] = 0;
	  for (j = 0;j < n;j++)
	  {
		if (age[j] <= 18)
		{
		  sum[0] += 1;
		  percent[0] = sum[0] / n * 100;
		}
		if ((19 <= age[j]) && (age[j] <= 35))
		{
		  sum[1] += 1;
		  percent[1] = sum[1] / n * 100;
		}
		if ((36 <= age[j]) && (age[j] <= 60))
		{
		  sum[2] += 1;
		  percent[2] = sum[2] / n * 100;
		}
	  }
	  percent[3] = 100 - percent[0] - percent[1] - percent[2];
	  System.out.print("1-18:");
	  System.out.printf(" %.2lf%\n",percent[0]);
	  System.out.print("19-35:");
	  System.out.printf(" %.2lf%\n",percent[1]);
	  System.out.print("36-60:");
	  System.out.printf(" %.2lf%\n",percent[2]);
	  System.out.print("60??:");
	  System.out.printf(" %.2lf%\n",percent[3]);
	  return 0;
	}

}

