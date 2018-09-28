package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int i;
		int j;
		int m;
		int counter = 0;
		int[][] b = new int[110][110];
		int[][] c = new int[110][110];
		char[][] a = new char[110][110];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
		  for (j = 1;j <= n;j++)
		  {
			 a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			 if (a[i][j] == '#')
			 {
			   b[i][j] = -1; // -1 kongzhe
			 }
			 if (a[i][j] == '@')
			 {
				   b[i][j] = 1;
			 } // 1 debing
		  }
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i <= n;i++)
		{
			 b[0][i] = 10;
			 b[n + 1][i] = 10;
		}
		for (i = 0;i <= n;i++)
		{
			 b[i][0] = 10;
			 b[i][n + 1] = 10;
		}


		for (t = 1;t < m;t++)
		{
		   for (i = 1;i <= n;i++)
		   {
			 for (j = 1;j <= n;j++)
			 {
				 if (b[i][j] == 1 && c[i][j] == 0)
				 {
						if (b[i - 1][j] == 0 && c[i - 1][j] == 0)
						{
							  b[i - 1][j] = 1;
							  c[i - 1][j] = 1;
						}
						if (b[i][j - 1] == 0 && c[i][j - 1] == 0)
						{
							  b[i][j - 1] = 1;
							  c[i][j - 1] = 1;
						}
						if (b[i + 1][j] == 0 && c[i + 1][j] == 0)
						{
							 b[i + 1][j] = 1;
							 c[i + 1][j] = 1;
						}
						if (b[i][j + 1] == 0 && c[i][j + 1] == 0)
						{
							  b[i][j + 1] = 1;
							  c[i][j + 1] = 1;
						}
				 }
				 else
				 {
					 continue;
				 }
			 }
		   }

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		  memset(c,0,(Integer.SIZE / Byte.SIZE));
		}
		counter = 0;
		 for (i = 1;i <= n;i++)
		 {
			 for (j = 1;j <= n;j++)
			 {
			   if (b[i][j] == 1)
			   {
					counter++;
			   }
			 }
		 }
		System.out.print(counter);
		System.out.print("\n");

		return 0;
	}


}

