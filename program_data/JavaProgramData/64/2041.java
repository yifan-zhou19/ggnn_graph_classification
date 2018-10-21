package <missing>;

public class GlobalMembers
{
	/*
	 * julipaixu.cpp
	 *????????n??????10??,??n?????????,???? [ ????]  ???????????????????
	 *  Created on: 2013-11-1
	 *      Author: 13141
	 *
	????????????????n??????????????????(??????)?????????0?100????????????????
	 *
	?????n????????n*(n-1)/2???????????
	(x1,y1,z1)-(x2,y2,z2)=??
	???????????2??
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] x = new int[n];
		int[] y = new int[n];
		int[] z = new int[n];
		int t = n * (n - 1) / 2; //CN2 ??
		int[] d = new int[t];
		int[] a = new int[t]; //??????????????
		int[] b = new int[t];
		int k = 0;
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[k] = ((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j])); //????????
				a[k] = i;
				b[k] = j;
				k++;
			}
		}
		for (int c = 1;c < t;c++)
		{
			for (int r = 0;r < (k - c);r++)
			{
				if (d[r] < d[r + 1])
				{
					swap(d[r],d[r + 1]);
					swap(a[r],a[r + 1]);
					swap(b[r],b[r + 1]);
				}
			}
		}
		for (int w = 0;w < t;w++)
		{
			System.out.print("(");
			System.out.print(x[a[w]]);
			System.out.print(",");
			System.out.print(y[a[w]]);
			System.out.print(",");
			System.out.print(z[a[w]]);
			System.out.print(")-(");
			System.out.print(x[b[w]]);
			System.out.print(",");
			System.out.print(y[b[w]]);
			System.out.print(",");
			System.out.print(z[b[w]]);
			System.out.print(")=");
			System.out.printf("%.2f", Math.sqrt(d[w]));
			System.out.printf("%.2f", "\n");
		}

		return 0;
	}
}

