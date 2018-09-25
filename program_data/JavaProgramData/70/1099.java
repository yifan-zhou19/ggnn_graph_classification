package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		double[][] numm = new double[100][2];
		double dis;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double max = 0;
		for (int i = 0; i < num ; i++)
		{
			numm[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			numm[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < num;i++)
		{
			for (int j = 0;j < i;j++)
			{
				dis = Math.sqrt(Math.pow(numm[i][0] - numm[j][0],2) + Math.pow(numm[i][1] - numm[j][1],2));
				if (dis > max)
				{
					max = dis;
				}
			}
		}

			System.out.printf("%.4f", max);

		return 0;
	}


}

