package <missing>;

public class GlobalMembers
{
	/**
	* @file 1000012800_3.cpp
	* @author ??
	* @date 2010-12-15
	* @description
	* ??????:?????? 
	*/

	public static int Main()
	{
		int n;
		int[][] dot = new int[100][3];
		int count = -1;
		double[][] counter = new double[5000][3];
		double tmp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			dot[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			dot[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			dot[i][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0; i < n - 1; i++)
		{
			for (int j = i + 1; j < n; j++)
			{
				count++;
				counter[count][0] = Math.sqrt((double)((dot[i][0] - dot[j][0]) * (dot[i][0] - dot[j][0]) + (dot[i][1] - dot[j][1]) * (dot[i][1] - dot[j][1]) + (dot[i][2] - dot[j][2]) * (dot[i][2] - dot[j][2])));
				counter[count][1] = i;
				counter[count][2] = j;
			}
		}
		for (int i = 0; i < count; i++)
		{
			for (int j = count; j > i; j--)
			{
				if (counter[j][0] > counter[j - 1][0])
				{
					for (int k = 0; k < 3; k++)
					{
						tmp = counter[j][k];
						counter[j][k] = counter[j - 1][k];
						counter[j - 1][k] = tmp;
					}
				}
			}
		}
		for (int i = 0; i <= count; i++)
		{
			System.out.print("(");
			System.out.print(dot[(int)counter[i][1]][0]);
			System.out.print(",");
			System.out.print(dot[(int)counter[i][1]][1]);
			System.out.print(",");
			System.out.print(dot[(int)counter[i][1]][2]);
			System.out.print(")-(");
			System.out.print(dot[(int)counter[i][2]][0]);
			System.out.print(",");
			System.out.print(dot[(int)counter[i][2]][1]);
			System.out.print(",");
			System.out.print(dot[(int)counter[i][2]][2]);
			System.out.print(")=");
			System.out.printf("%.2f", counter[i][0]);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}


}

