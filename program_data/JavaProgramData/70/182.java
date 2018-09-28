package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int z = 0;
		int n;
		int x;
		int y;
		int i;
		int b;
		int k;
	double dis;
		float[][] dian = new float[100][100];
		double[] bijiao = new double[100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (x = 0;x < n;x++)
		{
				for (y = 0;y < 2;y++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						dian[x][y] = Float.parseFloat(tempVar2);
					}
				}
		}

		for (i = 0;i < n - 1;i++)
		{
				for (k = i + 1;k < n;k++)
				{
						bijiao[z] = Math.sqrt((dian[k][0] - dian[i][0]) * (dian[k][0] - dian[i][0]) + (dian[k][1] - dian[i][1]) * (dian[k][1] - dian[i][1]));
					z = z + 1;
				}
		}
		dis = bijiao[0];
		for (b = 1;b <= z;b++)
		{
				if (bijiao[b] > dis)
				{
						dis = bijiao[b];
				}
			else
			{
				dis = dis;
			}
		}
		System.out.printf("%.4f\n",dis);

	}

}

