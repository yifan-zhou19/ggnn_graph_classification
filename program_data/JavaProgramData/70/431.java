package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int k = 0;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[][] a = new double[100][2];
		double[] d = new double[1000];
		float max = 0F;
		for (i = 0;i < n;i++)
		{
		 a[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		 a[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
			  d[k] = Math.sqrt(Math.pow(a[j][0] - a[i][0],2) + Math.pow(a[j][1] - a[i][1],2));
			  if (max < d[k])
			  {
				  max = d[k];
			  }
			  k++;
			}
		}
	   System.out.printf("%.4f\n", max);
	   return 0;
	}
}

