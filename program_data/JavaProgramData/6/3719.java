package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int times;
		int x;
		int y;
		int i;
		int j;
		int k;
		int sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pointer=null;
		int pointer = null;
		times = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= times;i++)
		{
			sum = 0;
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (k = 0;k < x;k++)
			{
				for (j = 0;j < y;j++)
				{
					a[k][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					pointer = a[k][j];
					if (k == 0 || j == 0 || k == x - 1 || j == y - 1)
					{
					   sum = sum + pointer;
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

