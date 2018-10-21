package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m = 0;
		int k;
		int s;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[][] d = new double[101][101];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int x;
	//		int y;
	//		int z;
	//	}
	//	p[11];

		for (i = 0;i <= n - 1;i++)
		{
			p[i].x = ConsoleInput.readToWhiteSpace(true);
			p[i].y = ConsoleInput.readToWhiteSpace(true);
			p[i].z = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[i][j] = Math.sqrt((p[i].x - p[j].x) * (p[i].x - p[j].x) + (p[i].y - p[j].y) * (p[i].y - p[j].y) + (p[i].z - p[j].z) * (p[i].z - p[j].z));
			}
		}
		for (t = 0;t < (n * (n + 1)) / 2;t++)
		{
			for (i = 0;i < n;i++)
			{
			for (j = i + 1;j < n;j++)
			{
				m = 0;
				for (k = 0;k < n;k++)
				{
					for (s = k + 1;s <= n;s++)
					{
						if (d[i][j] < d[k][s])
						{
							m++;
						}
					}
				}
				if (m == t)
				{
					System.out.print("(");
					System.out.print(p[i].x);
					System.out.print(",");
					System.out.print(p[i].y);
					System.out.print(",");
					System.out.print(p[i].z);
					System.out.print(")");
					System.out.print("-");
					System.out.print("(");
					System.out.print(p[j].x);
					System.out.print(",");
					System.out.print(p[j].y);
					System.out.print(",");
					System.out.print(p[j].z);
					System.out.print(")");
					System.out.print("=");
					System.out.printf("%.2f", d[i][j]);
					System.out.printf("%.2f", "\n");
				}

			}
			}
		}
		return 0;
	}



}

