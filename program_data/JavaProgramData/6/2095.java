package <missing>;

public class GlobalMembers
{
	/*
	 * bianyuanshuzizhihe.cpp
	 *
	 *  Created on: 2012-12-13
	 *      Author: Lenovo
	 */
	public static int Main()
	{
		int[][] array = new int[100][100];
		int n;
		int sum;
		int row;
		int col;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * point;
		point = array;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;n > 0;n--)
		{
			sum = 0;
			row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (point = array;point < array + row * col;point++)
			{
				*point = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			point = array;
			for (;point < array + col;point++)
			{
				sum = sum + *point;
			}
			point--;
			for (point = point + col;point < array + row * col;point = point + col)
			{
				sum = sum + *point;
			}
			point -= col;
			for (point = point - 1;point >= array + (row - 1) * col;point--)
			{
				sum = sum + *point;
			}
			point++;
			for (point = point - col;point > array;point = point - col)
			{
				sum = sum + *point;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

