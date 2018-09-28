package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int i;
			int n;
			int s1;
			int[] x = new int[10];
			int[] f = new int[10];

			double s2;
			double[] G = new double[10];
			float GPA;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			s1 = 0;
			s2 = 0;

			for (i = 0;i < n;i++)
			{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						x[i] = Integer.parseInt(tempVar2);
					}
					s1 += x[i];
			}
			for (i = 0;i < n;i++)
			{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						f[i] = Integer.parseInt(tempVar3);
					}
					if (f[i] >= 90)
					{
						G[i] = 4.0;
					}
			else if (f[i] >= 85)
			{
				G[i] = 3.7;
			}
			else if (f[i] >= 82)
			{
				G[i] = 3.3;
			}
			else if (f[i] >= 78)
			{
				G[i] = 3.0;
			}
		else if (f[i] >= 75)
		{
			G[i] = 2.7;
		}
		else if (f[i] >= 72)
		{
			G[i] = 2.3;
		}
		else if (f[i] >= 68)
		{
			G[i] = 2.0;
		}
		else if (f[i] >= 64)
		{
			G[i] = 1.5;
		}
		else if (f[i] >= 60)
		{
			G[i] = 1.0;
		}
			else if (f[i] < 60)
			{
				G[i] = 0.0;
			}
					s2 += (G[i]) * (x[i]);
			}



			GPA = 1.0 * s2 / s1;

			System.out.printf("%.2f",GPA);
			return 0;
	}
}

