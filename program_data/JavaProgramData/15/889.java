package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int k;
	 int e = -1;
	 int r;
	 int row1;
	 int row2;
	 int rol1;
	 int rol2;
	 int[][] s = new int[h][l];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 System.in.read();
	 for (i = 0;i < n;i++)
	 {
		 for (k = 0;k < n;k++)
		 {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  (s[i][k]) = Integer.parseInt(tempVar2);
		  }
		  System.in.read();
		 }
	 }
	 for (i = 0;i < n;i++)
	 {
		  for (k = 0;k < n;k++)
		  {
				if (s[i][k] == 0 && e < 0)
				{
					e += 1;
					row1 = i;
					rol1 = k;
				}
					else if ((s[i][k] == 0) && (e >= 0))
					{
					row2 = i;
					rol2 = k;
					}
		  }
	 }
	  r = (row2 - row1 - 1) * (rol2 - rol1 - 1);
	  System.out.printf("%d",r);
	 return 0;
	}
}

