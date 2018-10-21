package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		double[] sz = new double[1000];
		double sum = 0;
		double av = 0;
		double S = 0;
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
				 m = Integer.parseInt(tempVar2);
			 }
			 sum = 0;
			 av = 0;
			 for (j = 0;j < m;j++)
			 {
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 sz[j] = Double.parseDouble(tempVar3);
				 }
				 sum += sz[j];

			 }
			 av = sum / m;
			 sum = 0;
			 for (j = 0;j < m;j++)
			 {

				sum += (sz[j] - av) * (sz[j] - av);
			 }
			 S = Math.pow(sum / m,0.5);
			 System.out.printf("%.5lf\n", S);

		}
		return 0;
	}
}

