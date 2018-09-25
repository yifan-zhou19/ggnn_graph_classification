package <missing>;

public class GlobalMembers
{
	//************************************************
	// file: 2.cpp
	// description: ?????????
	// date: 2012-11-24
	// author: ?? 1200012858
	//************************************************
	public static void zero(int[][] array)
	{
		int i;
		int j;
		int minuend;
		for (i = 0; i < num; i++)
		{
			minuend = array[i][0];
			for (j = 0; j < num; j++)
			{
				if (array[i][j] < minuend)
				{
					minuend = array[i][j];
				}
			}
			for (j = 0; j < num; j++)
			{
				array[i][j] = array[i][j] - minuend;
			}
		}
		for (i = 0; i < num; i++)
		{
			minuend = array[0][i];
			for (j = 0; j < num; j++)
			{
				if (array[j][i] < minuend)
				{
					minuend = array[j][i];
				}
			}
			for (j = 0; j < num; j++)
			{
				array[j][i] = array[j][i] - minuend;
			}
		}
	}
	public static void subduction(int[][] array)
	{
		int i;
		int j;
		int k;
		for (i = 2; i < num; i++)
		{
			for (j = 0; j < num; j++)
			{
				array[i - 1][j] = array[i][j];
			}
		}
		for (i = 2; i < num; i++)
		{
			for (j = 0; j < num; j++)
			{
				array[j][i - 1] = array[j][i];
			}
		}
		num--;
	}
	public static int num;
	public static int[][] array = new int[100][100];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < n; k++)
		{
			sum = 0;
			num = n;
			for (i = 0; i < n; i++)
			{
			   for (j = 0; j < n; j++)
			   {
					array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   }
			}
			for (i = 1; i < n; i++)
			{
			   zero(array);
			   sum = sum + array[1][1];
			   subduction(array);
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

