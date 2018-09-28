package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int n;
	 int[][] a = new int[22][22];
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
	 for (int i = 0;i < m;i++)
	 {
				for (int j = 0;j < n;j++)
				{
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 a[i + 1][j + 1] = Integer.parseInt(tempVar3);
						 }
				}
	 }
	 for (int i = 0;i < m;i++)
	 {
				  for (int j = 0;j < n;j++)
				  {
						   if (a[i + 1][j + 1] >= a[i + 1][j] != 0 && a[i + 1][j + 1] >= a[i][j + 1] != 0 && a[i + 1][j + 1] >= a[i + 2][j + 1] != 0 && a[i + 1][j + 1] >= a[i + 1][j + 2])
						   {
						   System.out.printf("%d %d\n",i,j);
						   }
				  }
	 }
	 System.in.read();
	 System.in.read();
	 System.in.read();
	}

}

