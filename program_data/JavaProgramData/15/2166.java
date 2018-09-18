package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int[][] a = new int[1000][1000];
		 int i;
		 int j;
		 int m = 0;
		 int k;
		 int r1;
		 int r2;
		 int c1;
		 int c2;
		 int x = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < n;i++)
		 {
			 for (j = 0;j < n;j++)
			 {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 a[i][j] = Integer.parseInt(tempVar2);
				 }
			 }
		 }
		  for (i = 0;i < n;i++)
		  {
			 for (j = 0;j < n;j++)
			 {
				 if ((a[i][j] == 0) && x == 0)
				 {
					 r1 = i + 1;
				 c1 = j + 1;
				 x = 1;
				 }
			 if ((a[i][j] == 0))
			 {
					  r2 = i - 1;
					  c2 = j - 1;
			 }
			 }
		  }
		  System.out.printf("%d\n",(r2 - r1 + 1) * (c2 - c1 + 1));
		  return 0;
	}
}

