package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct sanD
	//	{
	//		int x;
	//		int y;
	//		int z;
	//	}
	//	room[10];
		int n;
		int i;
		int j;
		double[] dis = new double[100];
		double temp;
		int[] x1 = new int[100];
		int[] x2 = new int[100];
		int[] y1 = new int[100];
		int[] y2 = new int[100];
		int[] z1 = new int[100];
		int[] z2 = new int[100];
		int k = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			room[i].x = ConsoleInput.readToWhiteSpace(true);
			room[i].y = ConsoleInput.readToWhiteSpace(true);
			room[i].z = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0; i < n; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				x1[k] = room[i].x;
				y1[k] = room[i].y;
				z1[k] = room[i].z;
				x2[k] = room[j].x;
				y2[k] = room[j].y;
				z2[k] = room[j].z;
				dis[k] = Math.sqrt((x1[k] - x2[k]) * (x1[k] - x2[k]) + (y1[k] - y2[k]) * (y1[k] - y2[k]) + (z1[k] - z2[k]) * (z1[k] - z2[k]));
				k++;
			}
		}
		for (i = 1; i <= n * (n - 1) / 2; i++)
		{
			for (j = n * (n - 1) / 2; j >= 1 + i ; j--)
			{
				if (dis[j] > dis[j - 1])
				{
					temp = dis[j - 1];
					dis[j - 1] = dis[j];
					dis[j] = temp;
					temp = x1[j - 1];
					x1[j - 1] = x1[j];
					x1[j] = temp;
					temp = x2[j - 1];
					x2[j - 1] = x2[j];
					x2[j] = temp;
					temp = y1[j - 1];
					y1[j - 1] = y1[j];
					y1[j] = temp;
					temp = y2[j - 1];
					y2[j - 1] = y2[j];
					y2[j] = temp;
					temp = z1[j - 1];
					z1[j - 1] = z1[j];
					z1[j] = temp;
					temp = z2[j - 1];
					z2[j - 1] = z2[j];
					z2[j] = temp;
				}
			}
		}
		for (i = 1; i <= n * (n - 1) / 2; i++)
		{
			System.out.print("(");
			System.out.print(x1[i]);
			System.out.print(",");
			System.out.print(y1[i]);
			System.out.print(",");
			System.out.print(z1[i]);
			System.out.print(")-(");
			System.out.print(x2[i]);
			System.out.print(",");
			System.out.print(y2[i]);
			System.out.print(",");
			System.out.print(z2[i]);
			System.out.print(")=");
			System.out.printf("%.2f", dis[i]);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}

}

