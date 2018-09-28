package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[][] a = new int[11][11];
	public static int[][] b = new int[11][11];
	public static int Main()
	{
		 int i;
		 int j;
		 int h;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(b,0,(Integer.SIZE / Byte.SIZE));
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 m = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 n = Integer.parseInt(tempVar2);
		 }
		 a[5][5] = m;
		 for (h = 1;h <= n;)
		 {
		   for (i = 0;i <= 10;i++)
		   {
			  for (j = 0;j <= 10;j++)
			  {
				  b[i][j] = a[i][j];
			  }
		   }
			for (i = 5 - h;i <= 5 + h;i++)
			{
				 for (j = 5 - h;j <= 5 + h;j++)
				 {
					  a[i][j] = b[i - 1][j - 1] + b[i - 1][j] + b[i - 1][j + 1] + b[i][j - 1] + 2 * b[i][j] + b[i][j + 1] + b[i + 1][j - 1] + b[i + 1][j] + b[i + 1][j + 1];
				 }
			}
		  h++;
		 }
		 for (i = 1;i <= 9;i++)
		 {
			 for (j = 1;j <= 8;j++)
			 {
				 System.out.printf("%d ",a[i][j]);
			 }
			  for (j = 9;j <= 9;j++)
			  {
				 System.out.printf("%d\n",a[i][j]);
			  }
		 }
	}
}

