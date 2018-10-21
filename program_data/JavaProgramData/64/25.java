package <missing>;

public class GlobalMembers
{
	//****************************************************** 
	//* ? ? ?   ?? ? ? ?                           *
	//* ? ?      ?? ? ?                              *
	//* ? ? ? ??2010 ? 12 ? 15 ?                   * 
	//* ? ?      ?1000010185                            *
	//****************************************************** 
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct distance // ???????????????
	//	{
	//		int x[3];
	//		int y[3];
	//		double d;
	//	}
	//	dis[45], temp;
		int n; // ??a???n????
		int[][] a = new int[10][3];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		// ?n?????????????dis?
		int k = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = i + 1; j < n; j++)
			{
				for (int p = 0; p < 3; p++)
				{
					dis[k].x[p] = a[i][p];
					dis[k].y[p] = a[j][p];
				}
				k++;
			}
		}

		// ??????????
		int k1 = n * (n - 1) / 2;
		for (int i = 0; i < k1; i++)
		{
			double sum = 0;
			for (int j = 0; j < 3; j++)
			{
				sum += (dis[i].x[j] - dis[i].y[j]) * (dis[i].x[j] - dis[i].y[j]);
			}
			dis[i].d = Math.sqrt(sum);
			for (int j = i - 1; j >= 0; j--)
			{
				if (dis[j + 1].d > dis[j].d)
				{
					temp = dis[j];
					dis[j] = dis[j + 1];
					dis[j + 1] = temp;
				}
			}
		}

		// ???????????
		for (int i = 0; i < k1; i++)
		{
			System.out.print('(');
			System.out.print(dis[i].x[0]);
			System.out.print(',');
			System.out.print(dis[i].x[1]);
			System.out.print(',');
			System.out.print(dis[i].x[2]);
			System.out.print(")-(");
			System.out.print(dis[i].y[0]);
			System.out.print(',');
			System.out.print(dis[i].y[1]);
			System.out.print(',');
			System.out.print(dis[i].y[2]);
			System.out.print(")=");
			System.out.printf("%.2f", dis[i].d);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

