package <missing>;

public class GlobalMembers
{
	public static int[][] h = new int[21][21];
	public static int Main()
	{
		int i = 1;
		int j = 1;
		int m = 0;
		int n = 0;
	  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 1;i <= m;i++)
	  {
		 for (j = 1;j <= n;j++)
		 {
			 h[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	  }
	  i = j = 1;
	  for (i = 1;i <= m;i++)
	  {
		 for (j = 1;j <= n;j++)
		 {
			 if ((h[i][j] >= h[i - 1][j]) && (h[i][j] >= h[i + 1][j]) && (h[i][j] >= h[i][j - 1]) && (h[i][j] >= h[i][j + 1]))
			 {
				 System.out.print(i - 1);
				 System.out.print(" ");
				 System.out.print(j - 1);
				 System.out.print("\n");
			 }
		 }
	  }
	  return 0;
	}
}

