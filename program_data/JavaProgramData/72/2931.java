package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] height = new int[20][20];
		int m;
		int n;
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int i;
	   int j;
	   for (i = 0;i < m;i++)
	   {
		   for (j = 0;j < n;j++)
		   {
			   height[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
	   }
	   int judge;
	   int piece;
	   for (i = 0;i < m;i++)
	   {
		   for (j = 0;j < n;j++)
		   {
			   piece = 0;
			   judge = 0;
			   if (i >= 1)
			   {
				   judge += (height[i][j] >= height[i - 1][j]);
				   piece++;
			   }
			   if (i < m - 1)
			   {
				   judge += (height[i][j] >= height[i + 1][j]);
				   piece++;
			   }
			   if (j >= 1)
			   {
				   judge += (height[i][j] >= height[i][j - 1]);
				   piece++;
			   }
			   if (j < n - 1)
			   {
				   judge += (height[i][j] >= height[i][j + 1]);
				   piece++;
			   }
			   if (judge == piece)
			   {
				   System.out.print(i);
				   System.out.print(" ");
				   System.out.print(j);
				   System.out.print("\n");
			   }

		   }
	   }
	   System.in.read();
	   System.in.read();
	   System.in.read();


		return 0;
	}
}

