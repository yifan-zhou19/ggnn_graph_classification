package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct address
	//	{
	//		int x;
	//		int y;
	//		int z;
	//	}
	//	point[10];
		int n;
		int i;
		int j;
		int k;
		double[] d = new double[45];
		double t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			point[i].x = ConsoleInput.readToWhiteSpace(true);
			point[i].y = ConsoleInput.readToWhiteSpace(true);
			point[i].z = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[(2 * n - 1 - i) * i / 2 + j - i - 1] = Math.sqrt((point[i].x - point[j].x) * (point[i].x - point[j].x) + (point[i].y - point[j].y) * (point[i].y - point[j].y) + (point[i].z - point[j].z) * (point[i].z - point[j].z));
			}
		}
		for (i = 0;i < n * (n - 1) / 2 - 1;i++)
		{
			for (j = i + 1;j < n * (n - 1) / 2;j++)
			{
				if (d[j] > d[i])
				{
					t = d[i];
					d[i] = d[j];
					d[j] = t;
				}
			}
		}
		for (i = 0;i < n * (n - 1) / 2;)
		{
			for (j = 0;j < n - 1;j++)
			{
				for (k = j + 1;k < n;k++)
				{
					if (Math.sqrt((point[k].x - point[j].x) * (point[k].x - point[j].x) + (point[k].y - point[j].y) * (point[k].y - point[j].y) + (point[k].z - point[j].z) * (point[k].z - point[j].z)) == d[i])
					{
						System.out.print("(");
						System.out.print(point[j].x);
						System.out.print(",");
						System.out.print(point[j].y);
						System.out.print(",");
						System.out.print(point[j].z);
						System.out.print(")-(");
						System.out.print(point[k].x);
						System.out.print(",");
						System.out.print(point[k].y);
						System.out.print(",");
						System.out.print(point[k].z);
						System.out.print(")=");
					 System.out.print((fixed));
					 System.out.printf("%.2d", d[i]);
					 System.out.printf("%.2d", "\n");
					}
				}
			}
			for (j = i + 1;j < n * (n - 1) / 2;j++)
			{
				if (d[j] != d[i])
				{
					break;
				}
			}
			i = j;
		}
		return 0;
	}






}

