package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] x = new int[n];
		int[] y = new int[n];
		int[] z = new int[n];
		c = n * (n - 1) / 2; //????
		int[] a = new int[c]; // ????????????????????
		int[] b = new int[c];
		double[] l = new double[c]; //????
		for (int i = 0 ; i < n ; i++) //??
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		c = -1;
		for (int i = 0 ; i < n - 1 ; i++) //???????
		{
			for (int j = i + 1 ; j < n ; j++)
			{
				c++;
				a[c] = i;
				b[c] = j;
				l[c] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
			}
		}
		double t1 = 0;
		int t = 0;
		for (int i = 0 ; i <= c ; i++) //??????????????
		{
			for (int j = 0 ; j <= c - 1 - i ; j++)
			{
				if (l[j] < l[j + 1])
				{
				  t1 = l[j];
				  l[j] = l[j + 1];
				  l[j + 1] = t1;
				  t = a[j];
				  a[j] = a[j + 1];
				  a[j + 1] = t;
				  t = b[j];
				  b[j] = b[j + 1];
				  b[j + 1] = t;
				}
			}
		}
		for (int i = 0 ; i <= c ; i++)
		{
			System.out.printf("%.2f", "(");
			System.out.printf("%.2f", x[a[i]]);
			System.out.printf("%.2f", ",");
			System.out.printf("%.2f", y[a[i]]);
			System.out.printf("%.2f", ",");
			System.out.printf("%.2f", z[a[i]]);
			System.out.printf("%.2f", ")-(");
			System.out.printf("%.2f", x[b[i]]);
			System.out.printf("%.2f", ",");
			System.out.printf("%.2f", y[b[i]]);
			System.out.printf("%.2f", ",");
			System.out.printf("%.2f", z[b[i]]);
			System.out.printf("%.2f", ")=");
			System.out.printf("%.2f", l[i]);
			System.out.printf("%.2f", "\n");
		}



		return 0;
	}

}

