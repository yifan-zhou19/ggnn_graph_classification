package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double[][] dian = new double[10][2];
	double cha;
	double temp = 0;
	int n;
	int i;
	int j;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i <= n - 1;)
	{
		dian[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		dian[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		i++;
	}
	for (i = 0;i <= n - 1;i++)
	{
		for (j = 0;j <= n - 1;j++)
		{
			cha = Math.sqrt((dian[i][0] - dian[j][0]) * (dian[i][0] - dian[j][0]) + (dian[i][1] - dian[j][1]) * (dian[i][1] - dian[j][1]));
			if (cha >= temp)
			{
				temp = cha;
			}
		}
	}
	System.out.print(temp);
	System.out.print("\n");
	return 0;
	}
}

