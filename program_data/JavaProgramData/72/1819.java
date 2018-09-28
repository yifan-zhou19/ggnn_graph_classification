package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[][] a = new int[25][25];
		 int m;
		 int n;
		 int k;
		 int[] dx = {0, 0, 1, -1};
		 int[] dy = {1, -1, 0, 0};
		 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		 for (int i = 0; i < m; i++)
		 {
			   for (int j = 0; j < n; j++)
			   {
				   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   }
		 }

		 for (int i = 0; i < m; i++)
		 {
			   for (int j = 0; j < n; j++)
			   {
					 for (k = 0; k < 4; k++)
					 {
						 if (i + dx[k] >= 0 && i + dx[k] < m && j + dy[k] >= 0 && j + dy[k] < n)
						 {
							   if (a[i][j] < a[i + dx[k]][j + dy[k]])
							   {
								  break;
							   }
						 }
					 }
				if (k == 4)
				{
				   System.out.print(i);
				   System.out.print(" ");
				   System.out.print(j);
				   System.out.print("\n");
				}
			   }
		 }
		  return 0;
	}
}

