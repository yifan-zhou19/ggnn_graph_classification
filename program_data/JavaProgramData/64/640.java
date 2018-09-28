package <missing>;

public class GlobalMembers
{
	//************************
	//???????
	//?????
	//???2011-12-14
	//************************
	public static int Main()
	{
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct distance
	//	{
	//		int x1; //??
	//		int y1;
	//		int z1;
	//		int x2;
	//		int y2;
	//		int z2;
	//		double c; //??
	//	}
	//	dis[46];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int k = 0;
		for (i = 0;i < n;i++) //??????????????
		{
			for (j = i + 1;j < n;j++)
			{
				dis[k].x1 = x[i];
				dis[k].y1 = y[i];
				dis[k].z1 = z[i];
				dis[k].x2 = x[j];
				dis[k].y2 = y[j];
				dis[k].z2 = z[j];
				dis[k++].c = Math.sqrt((dis[k].x1 - dis[k].x2) * (dis[k].x1 - dis[k].x2) + (dis[k].y1 - dis[k].y2) * (dis[k].y1 - dis[k].y2) + (dis[k].z1 - dis[k].z2) * (dis[k].z1 - dis[k].z2));
			}
		}
		int t;
		int t1;
		for (i = 0;i < n * (n - 1) / 2 - 1;i++)
		{
			for (j = i + 1;j < n * (n - 1) / 2;j++)
			{
				if (dis[j].c - dis[i].c > 1e-6) //??????????????????
				{
					dis[45] = dis[j];
					for (t = j, t1 = j;t > i;t--)
					{
						dis[t] = dis[--t1];
					}
					dis[i] = dis[45];
				}
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++) //??
		{
			System.out.printf("%f", "(");
			System.out.printf("%f", dis[i].x1);
			System.out.printf("%f", ",");
			System.out.printf("%f", dis[i].y1);
			System.out.printf("%f", ",");
			System.out.printf("%f", dis[i].z1);
			System.out.printf("%f", ")");
			System.out.printf("%f", "-");
			System.out.printf("%f", "(");
			System.out.printf("%f", dis[i].x2);
			System.out.printf("%f", ",");
			System.out.printf("%f", dis[i].y2);
			System.out.printf("%f", ",");
			System.out.printf("%f", dis[i].z2);
			System.out.printf("%f", ")");
			System.out.printf("%f", "=");
			System.out.printf("%.2f", dis[i].c);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

