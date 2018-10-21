package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] dian = new int[10][3];
		int n;
		int j;
		int i;
		int k;
		int[][] diandui = new int[1000][6];
		double[] d = new double[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < 3;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					dian[j][i] = Integer.parseInt(tempVar2);
				}
			}
		}
		int p = 0;
		for (j = 1;j < n;j++)
		{
			for (k = 0;k < j;k++)
			{
				int x;
				x = (dian[j][0] - dian[k][0]) * (dian[j][0] - dian[k][0]) + (dian[j][1] - dian[k][1]) * (dian[j][1] - dian[k][1]) + (dian[j][2] - dian[k][2]) * (dian[j][2] - dian[k][2]);
				d[p] = Math.sqrt(x);
				diandui[p][0] = dian[k][0];
				diandui[p][1] = dian[k][1];
				diandui[p][2] = dian[k][2];
				diandui[p][3] = dian[j][0];
				diandui[p][4] = dian[j][1];
				diandui[p][5] = dian[j][2];
				p++;


			}
		}
		int a;
		int b;
		for (k = 0;k < p;k++)
		{
			for (i = 0;i < p - k - 1;i++)
			{
				double t;
				if (d[i] < d[i + 1])
				{
					t = d[i];
					d[i] = d[i + 1];
					d[i + 1] = t;
					for (a = 0;a < 6;a++)
					{
						b = diandui[i][a];
						diandui[i][a] = diandui[i + 1][a];
						diandui[i + 1][a] = b;
					}

				}
			}
		}
		for (i = 0;i < p;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",diandui[i][0],diandui[i][1],diandui[i][2],diandui[i][3],diandui[i][4],diandui[i][5],d[i]);

		}
		return 0;
	}


}

