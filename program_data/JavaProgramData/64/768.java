package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int pointnum;
		int groupnum;
		int i;
		int j;
		int k;
		int[][] point = new int[10][3];
		pointnum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		groupnum = pointnum * (pointnum - 1) / 2;
		for (i = 0;i < pointnum;i++)
		{
			for (j = 0;j < 3;j++)
			{
				point[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int[][] group = new int[45][6];
		double[] result = new double[45];
		for (i = 0;i < 45;i++)
		{
			result[i] = 0;
		}
		for (i = k = 0;i < pointnum - 1;i++)
		{
			for (j = i + 1;j < pointnum;j++)
			{
				group[k][0] = point[i][0];
				group[k][1] = point[i][1];
				group[k][2] = point[i][2];
				group[k][3] = point[j][0];
				group[k][4] = point[j][1];
				group[k][5] = point[j][2];
				result[k] = Math.sqrt((double)(point[i][0] - point[j][0]) * (point[i][0] - point[j][0]) + (point[i][1] - point[j][1]) * (point[i][1] - point[j][1]) + (point[i][2] - point[j][2]) * (point[i][2] - point[j][2]));
				k++;
			}
		}
		double temp1;
		int[] temp = new int[6];
		for (i = 0;i < groupnum - 1;i++)
		{
			for (j = 0;j < groupnum - 1 - i;j++)
			{
				if (result[j] < result[j + 1])
				{
					temp1 = result[j];
					result[j] = result[j + 1];
					result[j + 1] = temp1;
					for (k = 0;k < 6;k++)
					{
						temp[k] = group[j][k];
					}
					for (k = 0;k < 6;k++)
					{
						group[j][k] = group[j + 1][k];
					}
					for (k = 0;k < 6;k++)
					{
						group[j + 1][k] = temp[k];
					}
				}
			}
		}
		for (i = 0;i < groupnum;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",group[i][0],group[i][1],group[i][2],group[i][3],group[i][4],group[i][5],result[i]);
		}
		return 0;
	}

}

