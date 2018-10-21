package <missing>;

public class GlobalMembers
{
	/*
	 *????SortTheDistance.cpp
	 *?????
	 *????: 2012-11-13
	 *?????????????????????????????
	 */


	public static int Main()
	{
		int[] x = new int[15];
		int[] y = new int[15];
		int[] z = new int[15];
		int[] left = new int[50];
		int[] right = new int[50];
		int n;
		int i;
		int j;
		int k = 0;
		int gn;
		int temp1;
		double[] dis = new double[50];
		double temp;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (i = 0; i < n; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				left[k] = i;
				right[k] = j;
				dis[k] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				k++;
			}
		}
		gn = k;
		for (i = 0; i < gn; i++)
		{
			for (j = 0; j < gn - i - 1; j++)
			{
				if (dis[j + 1] > dis[j])
				{
					temp = dis[j];
					dis[j] = dis[j + 1];
					dis[j + 1] = temp;
					temp1 = left[j];
					left[j] = left[j + 1];
					left[j + 1] = temp1;
					temp1 = right[j];
					right[j] = right[j + 1];
					right[j + 1] = temp1;
				}
			}
		}

		for (i = 0; i < gn; i++)
		{
			System.out.print("(");
			System.out.print(x[left[i]]);
			System.out.print(",");
			System.out.print(y[left[i]]);
			System.out.print(",");
			System.out.print(z[left[i]]);
			System.out.print(")-(");
			System.out.print(x[right[i]]);
			System.out.print(",");
			System.out.print(y[right[i]]);
			System.out.print(",");
			System.out.print(z[right[i]]);
			System.out.print(")=");
			System.out.printf("%.2f", dis[i]);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}

}

