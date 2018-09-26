package <missing>;

public class GlobalMembers
{
	/*
	 * 80.cpp
	 * ??????
	 *  Created on: 2011-12-14
	 * ???????????n??????10??,??n?????????,???????????????????????????
	 */

	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int p;
		int t = 0;
		double q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct zb
	//	{
	//		int x;
	//		int y;
	//		int z;
	//	}
	//	aa[n];

		for (i = 0;i < n;i++)
		{
			aa[i].x = ConsoleInput.readToWhiteSpace(true);
			aa[i].y = ConsoleInput.readToWhiteSpace(true);
			aa[i].z = ConsoleInput.readToWhiteSpace(true);
		}

		double[][] s = new double[n][n];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				s[i][j] = 0.0;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				s[i][j] = (sqrt)((aa[i].x - aa[j].x) * (aa[i].x - aa[j].x) + (aa[i].y - aa[j].y) * (aa[i].y - aa[j].y) + (aa[i].z - aa[j].z) * (aa[i].z - aa[j].z));
			}
		}

		k = (n - 1) * (n - 1);
		double[] ss = new double[k];
		for (i = 0;i < k;i++)
		{
			ss[i] = 0.0;
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 1;j < n;j++)
			{
				ss[t] = s[i][j];
				t = t + 1;
			}
		}

		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k - i - 1;j++)
			{
				if (ss[j] < ss[j + 1])
				{
					q = ss[j + 1];
					ss[j + 1] = ss[j];
					ss[j] = q;
				}
			}
		}

		p = n * (n - 1) / 2;
		int a = 0;
		for (t = 0;t < p;t++)
		{
			for (i = 0;i < n - 1;i++)
			{
				for (j = 1;j < n;j++)
				{
					if (ss[t] == s[i][j])
					{
						System.out.print("(");
						System.out.print(aa[i].x);
						System.out.print(",");
						System.out.print(aa[i].y);
						System.out.print(",");
						System.out.print(aa[i].z);
						System.out.print(")");
						System.out.print("-");
						System.out.print("(");
						System.out.print(aa[j].x);
						System.out.print(",");
						System.out.print(aa[j].y);
						System.out.print(",");
						System.out.print(aa[j].z);
						System.out.print(")");
						System.out.print("=");
						System.out.printf("%.2f", s[i][j]);
						System.out.printf("%.2f", "\n");
						s[i][j] = -1.0;
						a = 1;

					}
				}
			}
		}
		return 0;
	}

}

