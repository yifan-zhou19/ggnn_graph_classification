package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int k;
	   int[][] a = new int[120][120];
	   int[][] b = new int[120][120];
	   int[][] c = new int[120][120];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	   memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	   memset(b,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	   memset(c,0,(Integer.SIZE / Byte.SIZE));
	   int x1;
	   int y1;
	   int x2;
	   int y2;
	   x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < x1;i++)
	   {
		   for (j = 0;j < y1;j++)
		   {
			   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
	   }
	   x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < x2;i++)
	   {
		   for (j = 0;j < y2;j++)
		   {
			   b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
	   }
	   for (i = 0;i < x1;i++)
	   {
		   for (j = 0;j < y2;j++)
		   {
			   for (k = 0;k < y1;k++)
			   {
				   c[i][j] = c[i][j] + a[i][k] * b[k][j];
			   }
		   }
	   }
	   for (i = 0;i < x1;i++)
	   {
		   for (j = 0;j < y2 - 1;j++)
		   {
			   System.out.print(c[i][j]);
			   System.out.print(' ');
		   }
		   System.out.print(c[i][j]);
		   System.out.print("\n");
	   }
	   return 0;

	}
}

