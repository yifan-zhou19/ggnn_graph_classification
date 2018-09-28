package <missing>;

public class GlobalMembers
{
	public static int Main()
	{


	int i;
	int j;
	int n;
		double a;
		double[][] sv = new double[1000][2];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sv[i][j] = Double.parseDouble(tempVar2);
				}
			}
		}

		a = sv[0][1] / sv[0][0];

		for (i = 1;i < n;i++)
		{
			if (a - sv[i][1] / sv[i][0] > 0 && (a - sv[i][1] / sv[i][0]) > 0.05)
			{

					System.out.print("worse\n");

			}
			else if ((a - sv[i][1] / sv[i][0]) < 0 && sv[i][1] / sv[i][0] - a>0.05)
			{

					System.out.print("better\n");
			}

			else
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}












}

