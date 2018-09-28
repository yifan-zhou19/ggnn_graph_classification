package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int[][] spot = new int[100][3];
			int n;
			int i;
			int j;
			int k = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//		struct D
	//		{
	//				int s[2][3];
	//				double d;
	//		}
	//		D[1000],tem;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (i = 0;i < n;i++)
			{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						spot[i][0] = Integer.parseInt(tempVar2);
					}
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						spot[i][1] = Integer.parseInt(tempVar3);
					}
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						spot[i][2] = Integer.parseInt(tempVar4);
					}
			}
			for (i = 0;i < n - 1;i++)
			{
					for (j = i + 1;j < n;j++)
					{
							D[k].s[0][0] = spot[i][0];
							D[k].s[0][1] = spot[i][1];
							D[k].s[0][2] = spot[i][2];
							D[k].s[1][0] = spot[j][0];
							D[k].s[1][1] = spot[j][1];
							D[k].s[1][2] = spot[j][2];
							D[k].d = (double)Math.sqrt((spot[i][0] - spot[j][0]) * (spot[i][0] - spot[j][0]) + (spot[i][1] - spot[j][1]) * (spot[i][1] - spot[j][1]) + (spot[i][2] - spot[j][2]) * (spot[i][2] - spot[j][2]));
							k++;
					}
			}
			for (i = 0;i < k;i++)
			{
					for (j = k - 1;j > i;j--)
					{
							if (D[j].d > D[j - 1].d)
							{
									tem = D[j];
									D[j] = D[j - 1];
									D[j - 1] = tem;
							}
					}
			}
			for (i = 0;i < k;i++)
			{
					System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",D[i].s[0][0],D[i].s[0][1],D[i].s[0][2],D[i].s[1][0],D[i].s[1][1],D[i].s[1][2],D[i].d);
			}
	}
}

