package <missing>;

public class GlobalMembers
{
	public static int[][] matrix = new int[1000][1000];

	public static void Main(String[] args)
	{
		int row;
		int col;
		int k = 0;
		int n;
		int i;
		int j;
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
						for (j = 0;j < n;j++)
						{
						matrix[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						}
		}
		for (i = 0;i < n;i++)
		{
						for (j = 0;j < n;j++)
						{
										if (matrix[i][j] == 0 && matrix[i][j + 1] != 0 && matrix[i][j - 1] != 0)
										{
										   for (j;j < n;j++)
										   {
											   if (matrix[i][j + 1] == 255)
											   {
											   k++;
											   }
											   else
											   {
											   break;
											   }
										   }
										break;
										}




						}
		}
		System.out.print(k);
		System.out.print("\n");













	}

}

