package <missing>;

public class GlobalMembers
{
	// ???? ?? 1000062708
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct num
	//	{
	//		int x;
	//		int y;
	//		int z;
	//	}
	//	a[10];
		int i;
		int j;
		int k;
		int n;
		int xx;
		int yy;
		double[][] b = new double[10][10];
		double m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i].x = ConsoleInput.readToWhiteSpace(true);
			a[i].y = ConsoleInput.readToWhiteSpace(true);
			a[i].z = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				b[i][j] = Math.sqrt((double)(a[i].x - a[j].x) * (a[i].x - a[j].x) + (double)(a[i].y - a[j].y) * (a[i].y - a[j].y) + (double)(a[i].z - a[j].z) * (a[i].z - a[j].z));
			}
		}
		for (k = 0;k < n * (n - 1) / 2;k++)
		{
			m = 0;
			for (i = 0;i < n;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (b[i][j] > m)
					{
						xx = i;
						yy = j;
						m = b[i][j];
					}
				}
			}
			System.out.print("(");
			System.out.print(a[xx].x);
			System.out.print(",");
			System.out.print(a[xx].y);
			System.out.print(",");
			System.out.print(a[xx].z);
			System.out.print(")-(");
			System.out.print(a[yy].x);
			System.out.print(",");
			System.out.print(a[yy].y);
			System.out.print(",");
			System.out.print(a[yy].z);
			System.out.print(")=");
			System.out.printf("%.2f", m);
			System.out.printf("%.2f", "\n");
			b[xx][yy] = 0;
		}
		return 0;
	}



}

