package <missing>;

public class GlobalMembers
{
	/*
	*????04.cpp
	*??????
	*?????2011-12-15
	*???????????n??????10??,??n?????????,???????????????????????????
	*/

	public static int Main()
	{
		int n; //?????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct zb //?????????????
	//	{
	//		int x;
	//		int y;
	//		int z;
	//	}
	//	dian[n];
		for (int i = 0;i < n;i++) //????
		{
			dian[i].x = ConsoleInput.readToWhiteSpace(true);
			dian[i].y = ConsoleInput.readToWhiteSpace(true);
			dian[i].z = ConsoleInput.readToWhiteSpace(true);
		}
		double[][] distance = new double[n][n]; //????????
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				distance[i][j] = 0.0;
			}
		}
		for (int i = 0;i < n - 1;i++) //?????????
		{
			for (int j = i + 1;j < n;j++)
			{
				distance[i][j] = (sqrt)((dian[i].x - dian[j].x) * (dian[i].x - dian[j].x) + (dian[i].y - dian[j].y) * (dian[i].y - dian[j].y) + (dian[i].z - dian[j].z) * (dian[i].z - dian[j].z));
			}
		}
		int amount = n * (n - 1) / 2;
		for (int i = 0;i < amount;i++) //??????????
		{
			double maxdis = 0;
			int maxX = 0;
			int maxY = 0;
			for (int j = 0;j < n - 1;j++) //??????????????????
			{
				for (int k = j + 1;k < n;k++)
				{
					if (maxdis < distance[j][k])
					{
						maxdis = distance[j][k];
						maxX = j;
						maxY = k;
					}
				}
			}
			System.out.print("(");
			System.out.print(dian[maxX].x);
			System.out.print(",");
			System.out.print(dian[maxX].y);
			System.out.print(",");
			System.out.print(dian[maxX].z);
			System.out.print(")");
			System.out.print("-");
			System.out.print("(");
			System.out.print(dian[maxY].x);
			System.out.print(",");
			System.out.print(dian[maxY].y);
			System.out.print(",");
			System.out.print(dian[maxY].z);
			System.out.print(")");
			System.out.print("=");
			System.out.printf("%.2f", maxdis);
			System.out.printf("%.2f", "\n");
			distance[maxX][maxY] = 0.0;
		}
		return 0;
	}
}

