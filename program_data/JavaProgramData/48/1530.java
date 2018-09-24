package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[][] a = new int[L][L];
		 int[][] b = new int[L][L];
		 int m;
		 int n;
		 int d;
		 int i;
		 int j;
		 int x;
		 int y;
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(a,0,(Integer.SIZE / Byte.SIZE));
		 a[4][4] = m;
		 for (d = 1;d <= n;d++)
		 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				  memset(b,0,(Integer.SIZE / Byte.SIZE));
				  for (i = 1;i < L - 1;i++)
				  {
						   for (j = 1;j < L - 1;j++)
						   {
								   b[i][j] += a[i][j];
								   for (x = -1;x <= 1;x++)
								   {
										   for (y = -1;y <= 1;y++)
										   {
										   b[i + y][j + x] = b[i + y][j + x] + a[i][j];
										   }
								   }
						   }
				  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
				  memcpy(a,b,(Integer.SIZE / Byte.SIZE));
		 }
		 for (i = 0;i < L;i++)
		 {
				  for (j = 0;j < L - 1;j++)
				  {
				  System.out.printf("%d ",a[i][j]);
				  }
				  System.out.printf("%d\n",a[i][8]);
		 }
		 System.in.read();
		 System.in.read();
		 System.in.read();
		 System.in.read();
	}
}

