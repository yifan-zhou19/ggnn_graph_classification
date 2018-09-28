package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2010-12-29
	 *      Author: 10033
	 */


	public static int Main()
	{ //????
		int n;
		int i;
		int j;
		int[] a = new int[10]; //??
		int[] b = new int[10];
		int[] c = new int[10];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct zuobiao
	//	{ //???????????
	//		int x[2];
	//		int y[2];
	//		int z[2];
	//		float length;
	//	}
	//	number[100],t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //??
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++) //????zuobiao???
		{
			for (j = i + 1;j < n;j++)
			{
				number[(((n - 1) + (n - i)) * i / 2) + j - i].x[0] = a[i];
				number[(((n - 1) + (n - i)) * i / 2) + j - i].x[1] = a[j];
				number[(((n - 1) + (n - i)) * i / 2) + j - i].y[0] = b[i];
				number[(((n - 1) + (n - i)) * i / 2) + j - i].y[1] = b[j];
				number[(((n - 1) + (n - i)) * i / 2) + j - i].z[0] = c[i];
				number[(((n - 1) + (n - i)) * i / 2) + j - i].z[1] = c[j];
				number[(((n - 1) + (n - i)) * i / 2) + j - i].length = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]) + (c[i] - c[j]) * (c[i] - c[j]));
			}
		}
		for (i = 1;i <= (n - 1) * n / 2;i++) //????
		{
			for (j = 1;j <= (n - 1) * n / 2 - i;j++)
			{
				if (number[j].length < number[j + 1].length)
				{
					t = number[j];
					number[j] = number[j + 1];
					number[j + 1] = t;
				}
			}
		}
		for (i = 1;i <= (n - 1) * n / 2;i++) //??
		{
			System.out.print("(");
			System.out.print(number[i].x[0]);
			System.out.print(",");
			System.out.print(number[i].y[0]);
			System.out.print(",");
			System.out.print(number[i].z[0]);
			System.out.print(")-(");
			System.out.print(number[i].x[1]);
			System.out.print(",");
			System.out.print(number[i].y[1]);
			System.out.print(",");
			System.out.print(number[i].z[1]);
			System.out.print(")=");
			System.out.printf("%.2f", number[i].length);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	} //????

}

