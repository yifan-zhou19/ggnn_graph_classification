package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2012-10-8
	 *      Author: Lixurong
	 */


//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int runnian(int a);

	public static int Main()
	{
		int n; //????
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = n * (n - 1) / 2; //????
		double[][] a = new double[n][3]; //????
		double[][] b = new double[k][3]; //????
		for (int i = 0; i < n; i++) //????
		{
			a[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			a[i][2] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		int p = 0;
		for (int i = 0; i < n - 1; i++) //??????
		{
			for (int j = i + 1; j < n; j++)
			{
				b[p][1] = i;
				b[p][2] = j;
				b[p][0] = Math.sqrt(Math.pow((a[i][0] - a[j][0]),2) + Math.pow((a[i][1] - a[j][1]),2) + Math.pow((a[i][2] - a[j][2]),2));
				p++;
			}
		}

		for (int i = 0; i < k - 1; i++) //????
		{
			for (int j = 0;j < k - 1; j++)
			{
				if (b[j][0] < b[j + 1][0])
				{
					double h = b[j][0];
					b[j][0] = b[j + 1][0];
					b[j + 1][0] = h;
					int s = (int)b[j][1];
					b[j][1] = b[j + 1][1];
					b[j + 1][1] = s;
					int e = (int)b[j][2];
					b[j][2] = b[j + 1][2];
					b[j + 1][2] = e;
				}
			}
		}

		for (int i = 0; i < k; i++) //????
		{
			System.out.print("(");
			System.out.printf("%f", a[(int)b[i][1]][0]);
			System.out.printf("%f", ",");
			System.out.printf("%f", a[(int)b[i][1]][1]);
			System.out.printf("%f", ",");
			System.out.printf("%f", a[(int)b[i][1]][2]);
			System.out.printf("%f", ")-(");
			System.out.printf("%f", a[(int)b[i][2]][0]);
			System.out.printf("%f", ",");
			System.out.printf("%f", a[(int)b[i][2]][1]);
			System.out.printf("%f", ",");
			System.out.printf("%f", a[(int)b[i][2]][2]);
			System.out.printf("%f", ")=");
			System.out.printf("%.2f", b[i][0]);
			if (i != k - 1)
			{
				System.out.printf("%.2f", "\n");
			}
		}

		return 0;
	}

}

