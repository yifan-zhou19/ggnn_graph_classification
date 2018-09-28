package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] x = new int[100];
		int i;
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
							x[i] = Integer.parseInt(tempVar2);
						}
						int j;
						double[] y = new double[1000];
						double a = 0.0;
						double ave = 0.0;
						double s;
						for (j = 0;j < x[i];j++)
						{
										   String tempVar3 = ConsoleInput.scanfRead();
										   if (tempVar3 != null)
										   {
											   y[j] = Double.parseDouble(tempVar3);
										   }
										   a += y[j];
						}
						a = a / x[i];
						for (j = 0;j < x[i];j++)
						{
										   ave += (y[j] - a) * (y[j] - a);
						}
						s = Math.sqrt(ave / x[i]);
						System.out.printf("%.5lf\n",s);
		}
		return 0;
	}
}

