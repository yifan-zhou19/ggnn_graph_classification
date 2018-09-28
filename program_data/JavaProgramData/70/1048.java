package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] a = new double[n];
		double[] b = new double[n];
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
		double max = 0;
		for (i = 0;i < n - 1;i++)
		{
			 for (j = i + 1;j < n;j++)
			 {
			 max = (((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j])) > max)? ((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j])):max;
			 }
		}
		System.out.printf("%.4lf",Math.sqrt(max));
	}

}

