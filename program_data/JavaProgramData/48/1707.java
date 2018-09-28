package <missing>;

public class GlobalMembers
{
	public static int[][] m = new int[L + 5][L + 5];
	public static int[][] tmp = new int[L + 5][L + 5];
	public static int i = 0;
	public static int j = 0;
	public static int k = 0;
	public static int n;
	public static int Main()
	{
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m[4][4] = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }
		  for (k = 1;k <= n;k++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
							 memset(tmp,0,(Integer.SIZE / Byte.SIZE));
		  for (i = 0;i <= L - 1;i++)
		  {
							  for (j = 0;j <= L - 1;j++)
							  {
												 tmp[i][j] = 2 * m[i][j] + m[i - 1][j - 1] + m[i][j - 1] + m[i + 1][j - 1] + m[i + 1][j] + m[i - 1][j] + m[i + 1][j + 1] + m[i][j + 1] + m[i - 1][j + 1];
							  }
		  }
		  for (i = 0;i <= L - 1;i++)
		  {
							  for (j = 0;j <= L - 1;j++)
							  {
												 m[i][j] = tmp[i][j];
							  }
		  }
		  }
		  for (i = 0;i <= L - 1;i++)
		  {
			   System.out.printf("%d %d %d %d %d %d %d %d %d\n",m[i][0],m[i][1],m[i][2],m[i][3],m[i][4],m[i][5],m[i][6],m[i][7],m[i][8]);
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

