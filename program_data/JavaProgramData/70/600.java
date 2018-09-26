package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[] t = new double[1000];
		double[] y = new double[1000];
		double max;
		double s;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t[i] = Double.parseDouble(tempVar2);
			}
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 y[i] = Double.parseDouble(tempVar3);
		 }
		}
		max = 0;
		for (i = 1;i <= n;i++)
		{
		for (j = i;j <= n;j++)
		{
			s = Math.sqrt((t[i] - t[j]) * (t[i] - t[j]) + (y[i] - y[j]) * (y[i] - y[j]));
		 if (s >= max)
		 {
			 max = s;
		 }
		}
		}
		System.out.printf("%.4f",max);
	}


}

