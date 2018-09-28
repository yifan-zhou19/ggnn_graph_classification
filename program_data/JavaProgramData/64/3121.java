package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j = 0;
		int b;
		int[][] a = new int[15][3];
		double[] s = new double[10000];
		int[][] x = new int[10000][2];
		double p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int k = 0;k < n - 1;k++)
		{
		for (int m = k + 1;m < n;m++)
		{
			s[j] = Math.sqrt((a[k][0] - a[m][0]) * (a[k][0] - a[m][0]) + (a[k][1] - a[m][1]) * (a[k][1] - a[m][1]) + (a[k][2] - a[m][2]) * (a[k][2] - a[m][2]));
			x[j][0] = k;
			x[j][1] = m;
					j++;
		}
		}
		for (int z = 0;z < j - 1;z++)
		{
			for (int d = 0;d < j - 1 - z;d++)
			{
				if (s[d] < s[d + 1])
				{
					p = s[d + 1];
					s[d + 1] = s[d];
					s[d] = p;
					b = x[d + 1][0];
					x[d + 1][0] = x[d][0];
					x[d][0] = b;
					b = x[d + 1][1];
					x[d + 1][1] = x[d][1];
					x[d][1] = b;
				}
			}
		}
		for (int g = 0;g < j;g++)
		{
		System.out.print("(");
		System.out.print(a[x[g][0]][0]);
		System.out.print(",");
		System.out.print(a[x[g][0]][1]);
		System.out.print(",");
		System.out.print(a[x[g][0]][2]);
		System.out.print(")");
		System.out.print("-");
		System.out.print("(");
		System.out.print(a[x[g][1]][0]);
		System.out.print(",");
		System.out.print(a[x[g][1]][1]);
		System.out.print(",");
		System.out.print(a[x[g][1]][2]);
		System.out.print(")");
		System.out.print("=");
		System.out.printf("%.2f", s[g]);
		System.out.printf("%.2f", "\n");
		}
		return 0;
	}


}

