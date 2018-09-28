package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m = 0;
		double[] taoyan = new double[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct ss
	//	{
	//		int x;
	//		int y;
	//		int z;
	//		double jl[10];
	//	}
	//	zz[10];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; ++i)
		{
		zz[i].x = ConsoleInput.readToWhiteSpace(true);
		zz[i].y = ConsoleInput.readToWhiteSpace(true);
		zz[i].z = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				int a = (zz[i].x - zz[j].x) * (zz[i].x - zz[j].x) + (zz[i].y - zz[j].y) * (zz[i].y - zz[j].y) + (zz[i].z - zz[j].z) * (zz[i].z - zz[j].z);
				zz[i].jl[j] = Math.sqrt(a);
				taoyan[m++] = zz[i].jl[j];
			}
		}
		sort(taoyan, taoyan + m);
		for (k = m ; k >= 0; k--)
		{
			for (i = 0; i < n - 1; ++i)
			{
				for (j = i + 1; j < n; ++j)
				{
					if (zz[i].jl[j] == taoyan[k])
					{
						System.out.print("(");
						System.out.print(zz[i].x);
						System.out.print(",");
						System.out.print(zz[i].y);
						System.out.print(",");
						System.out.print(zz[i].z);
						System.out.print(")-(");
						System.out.print(zz[j].x);
						System.out.print(",");
						System.out.print(zz[j].y);
						System.out.print(",");
						System.out.print(zz[j].z);
						System.out.print(")=");
						System.out.printf("%.2f", zz[i].jl[j]);
						System.out.printf("%.2f", "\n");
						zz[i].jl[j] = 0;
					}

				}
			}

		}


		return 0;
	}

}

