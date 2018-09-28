package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double far = 0;
		double dis = 0;
		double[][] point = new double[n][2];
		for (i = 0;i < n;i++)
		{
						point[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
						point[i][2] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
				for (j = i + 1;j < n;j++)
				{
								  dis = Math.sqrt((point[i][1] - point[j][1]) * (point[i][1] - point[j][1]) + (point[i][2] - point[j][2]) * (point[i][2] - point[j][2]));
								  if (dis >= far)
								  {
									  far = dis;
								  }
				}
		}
								  System.out.printf("%.4f\n",far);

								  return 0;
	}



}

