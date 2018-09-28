package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[][] str = new double[200][2]; //??????????
		double dis;
		double max = 0;
		int n;
		int a = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			str[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			str[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n - 1;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				dis = Math.sqrt(Math.pow(str[i][0] - str[j][0],2) + Math.pow(str[i][1] - str[j][1],2));
				if (max < dis)
				{
					max = dis; //?????
				}
			}
		}
		System.out.printf("%.4f\n",max); //??
		return 0;
	}

}

