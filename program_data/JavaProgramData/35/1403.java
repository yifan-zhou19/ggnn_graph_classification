package <missing>;

public class GlobalMembers
{
	public static int[][] matrix = new int[1000][1000];



	public static void Main(String[] args)
	{
		int row;
		int col;
		int k;
		int n;
		int i;
		int j;
		int[] l = new int[8];
		int[] p = new int[8];
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
						for (j = 0;j < col;j++)
						{
						matrix[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						if (matrix[i][j] > matrix[i][j - 1])
						{
						k = j;

						}
						}
						p[i] = k;

		}
		 for (j = 0;j < col;j++)

		 {
						   for (i = 0;i < row;i++)
						   {
							   if (matrix[i][j] < matrix[i - 1][j])
							   {
						   k = i;
							   }
						   }

						   l[j] = k;
		 }



		 for (i = 0;i < row;i++)
		 {

						   k = p[i];
						   if (l[k] == i)
						   {
									  System.out.print(i);
									  System.out.print("+");
									  System.out.print(k);
						   flag = 1;
						   }
		 }
		 if (flag == 0)
		 {
		 System.out.print("No");
		 System.out.print("\n");
		 }





















	}

}

