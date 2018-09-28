public class coordinate
{
	public int x;
	public int y;
	public int z;

}

package <missing>;

public class GlobalMembers
{
	public static coordinate[] point = tangible.Arrays.initializeWithDefaultcoordinateInstances(10);

	public static int Main()
	{
		double[][] dis = new double[10][10];
		double[] d = new double[100];
		double temp = 0;
		int i;
		int j;
		int n;
		int k1 = 0;
		int k2 = 0;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			point[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			point[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			point[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				dis[i][j] = Math.sqrt((point[i].x - point[j].x) * (point[i].x - point[j].x) + (point[i].y - point[j].y) * (point[i].y - point[j].y) + (point[i].z - point[j].z) * (point[i].z - point[j].z));
				d[10 * i + j] = Math.sqrt((point[i].x - point[j].x) * (point[i].x - point[j].x) + (point[i].y - point[j].y) * (point[i].y - point[j].y) + (point[i].z - point[j].z) * (point[i].z - point[j].z));
			}
		}
		for (i = 0; i < 99; i++)
		{
			for (j = 99; j > i; j--)
			{
				if (d[j] > d[j - 1])
				{
					temp = d[j];
					d[j] = d[j - 1];
					d[j - 1] = temp;
				}
			}
		}
		for (i = 99; i >= 1; i--)
		{
			if (d[i] == d[i - 1])
			{
				d[i] = 0;
			}

		}
		for (k = 0; k < 99; k++)
		{
			if (d[k] != 0)
			{
				for (i = 0; i < n - 1; i++)
				{
					for (j = i + 1; j < n; j++)
					{
						if (dis[i][j] == d[k])
						{

						   System.out.print("(");
						   System.out.print(point[i].x);
						   System.out.print(",");
						   System.out.print(point[i].y);
						   System.out.print(",");
						   System.out.print(point[i].z);
						   System.out.print(")-(");
						   System.out.print(point[j].x);
						   System.out.print(",");
						   System.out.print(point[j].y);
						   System.out.print(",");
						   System.out.print(point[j].z);
						   System.out.print(")=");
						   System.out.printf("%.2f", dis[i][j]);
						   System.out.printf("%.2f", "\n");
						}

					}
				}
			}
		}

		return 0;
	}
}

