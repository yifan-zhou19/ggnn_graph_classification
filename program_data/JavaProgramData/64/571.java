package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[][] s = new double[10][3]; //?s????n?????
		double[] a = new double[100];
		double[] b = new double[100];
		double[] l = new double[100];
		int n;
		int i;
		int j;
		int k = 0;
		int g = 0;
		int c;
		int d;
		double t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
				s[i][j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (g = i + 1;g < n;g++)
			{
				l[k] = Math.sqrt((s[i][0] - s[g][0]) * (s[i][0] - s[g][0]) + (s[i][1] - s[g][1]) * (s[i][1] - s[g][1]) + (s[i][2] - s[g][2]) * (s[i][2] - s[g][2]));
				a[k] = i;
				b[k] = g;
				k++;
			}
		}
		k = k; //l????k????
		for (i = 0;i < k - 1;i++)
		{
			for (j = 0;j < k - i;j++)
			{
				if (l[j] < l[j + 1])
				{
					t = l[j + 1];
					l[j + 1] = l[j];
					l[j] = t; //?????
					t = 0;
					t = a[j + 1];
					a[j + 1] = a[j];
					a[j] = t;
					t = 0;
					t = b[j + 1];
					b[j + 1] = b[j];
					b[j] = t; //??a?b?????l?????
				}
			}
		}
			for (i = 0;i < k;i++)
			{
				c = a[i];
				d = b[i];
				System.out.print("(");
				System.out.print(s[c][0]);
				System.out.print(",");
				System.out.print(s[c][1]);
				System.out.print(",");
				System.out.print(s[c][2]);
				System.out.print(")-(");
				System.out.print(s[d][0]);
				System.out.print(",");
				System.out.print(s[d][1]);
				System.out.print(",");
				System.out.print(s[d][2]);
				System.out.print(")=");
				System.out.printf("%.2f",l[i]);
				if (i < k - 1)
				{
				System.out.print("\n");
				}
			}


		return 0;
	}

}

