package <missing>;

public class GlobalMembers
{
	/**
	* @file homework.cpp
	* @author ??
	* @date 2010?11?09
	* @description 
	* ??????:??????  
	*/
	public static int[][] a = new int[9000][9000];
	public static int Main()
	{

		int i;
		int j;
		int n;
		int g;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i != 0 || j != 0)
		{
			a[i][j] = 1;
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < n;j++)
		{
			g = 0;
			for (i = 0;i < n;i++)
			{
				if (a[i][j] == 1)
				{
					g++;
				}
			}
			if (g == n - 1)
			{
				System.out.print(j);
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}
}

