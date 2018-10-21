package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int i;
	public static int j;
	public static int t;
	public static int p;
	public static int x;
	public static int y;
	public static int q;
	 public static char[][][] c = new char[2][100][100];

	public static int Main()
	{
	 p = 0;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 1;i <= n;i++)
	 {
	  for (j = 1;j <= n;j++)
	  {
	   c[p][i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
	  }
	 }
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   m--;
	 while (m > 0)
	 {
		 q = 1 - p;
		  for (i = 1;i <= n;i++)
		  {
		   for (j = 1;j <= n;j++)
		   {
			 if (c[p][i][j] == '@')
			 {
				x = i - 1;
				y = j;
				if (c[p][x][y] != '#')
				{
					c[q][x][y] = '@';
				}
				x = i + 1;
				y = j;
				if (c[p][x][y] != '#')
				{
					c[q][x][y] = '@';
				}
				x = i;
				y = j - 1;
				if (c[p][x][y] != '#')
				{
					c[q][x][y] = '@';
				}
				x = i;
				y = j + 1;
				if (c[p][x][y] != '#')
				{
					c[q][x][y] = '@';
				}
			 }
			 if ((c[p][i][j] == '@') || (c[p][i][j] == '#'))
			 {
			 c[q][i][j] = c[p][i][j];
			 }
		   }
		  }
		 p = q;
		 m--;
	 }
	 t = 0;
	 for (i = 1;i <= n;i++)
	 {
	  for (j = 1;j <= n;j++)
	  {
	   if (c[p][i][j] == '@')
	   {
		   t++;
	   }
	  }
	 }
	 System.out.print(t);
	 t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 return 0;
	}

}

