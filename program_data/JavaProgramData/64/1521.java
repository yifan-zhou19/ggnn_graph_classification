package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct distance
	//	{
	//		int x1;
	//		int y1;
	//		int z1;
	//		int x2;
	//		int y2;
	//		int z2;
	//		double d;
	//	}
	//	dis[100], t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				dis[k].x1 = x[i];
				dis[k].y1 = y[i];
				dis[k].z1 = z[i];
				dis[k].x2 = x[j];
				dis[k].y2 = y[j];
				dis[k].z2 = z[j];
				dis[k].d = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				k++;
			}
		}
		for (i = 0; i < k - 1; i++)
		{
			for (j = 0; j < k - 1 - i; j++)
			{
				if (dis[j].d < dis[j + 1].d)
				{
					t = dis[j];
					dis[j] = dis[j + 1];
					dis[j + 1] = t;
				}
			}
		}
		for (i = 0; i < k; i++)
		{
			System.out.print("(");
			System.out.print(dis[i].x1);
			System.out.print(",");
			System.out.print(dis[i].y1);
			System.out.print(",");
			System.out.print(dis[i].z1);
			System.out.print(")-(");
			System.out.print(dis[i].x2);
			System.out.print(",");
			System.out.print(dis[i].y2);
			System.out.print(",");
			System.out.print(dis[i].z2);
			System.out.print(")=");
			System.out.printf("%.2f", dis[i].d);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}

}

