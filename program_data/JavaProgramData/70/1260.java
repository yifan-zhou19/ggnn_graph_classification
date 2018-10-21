package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  double max = 0.0;
	  int sum = n * (n - 1) / 2;
	  double[][] array = new double[101][2];
	  double[] distance = new double[5001];
	  for (int i = 0;i < n;i++)
	  {
		  array[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		  array[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	  }
	  int k = 0;
	  for (int i = 0;i < n - 1;i++)
	  {
		  for (int j = i + 1;j < n;j++)
		  {
			  distance[k++] = Math.pow((array[i][0] - array[j][0]),2) + Math.pow((array[i][1] - array[j][1]),2);
		  }
	  }
	  for (k = 0;k < sum;k++)
	  {
			 if (max <= distance[k])
			 {
					  max = distance[k];
			 }
	  }
	  double Max;
	  Max = Math.sqrt(max);
		 System.out.printf("%.4f\n",Max);
		   return 0;
	}


}

