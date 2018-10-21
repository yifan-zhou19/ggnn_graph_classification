package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[][] a = new double[100][2];
		double max = 0;
		double distance = 0;
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			 for (j = 0;j < 2;j++)
			 {
		  a[i][j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			 }
		}
		for (i = 0;i < n - 1;i++)
		{
		 for (j = i + 1;j < n;j++)
		 {
		  distance = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]));
		  if (distance > max)
		  {
			  max = distance;
		  }
		 }
		}
		System.out.printf("%.4f\n",max);
		return 0;
	}
}

