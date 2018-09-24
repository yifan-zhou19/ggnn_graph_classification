package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int x1;
	 int x2;
	 int y1;
	 int y2;
	 int i;
	 int j;
	 int k;
	 int m;
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 x1 = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 y1 = Integer.parseInt(tempVar2);
	 }
	 int[][] s = new int[x1][y1];
	 for (i = 0;i < x1;i++)
	 {
		 for (j = 0;j < y1;j++)
		 {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   s[i][j] = Integer.parseInt(tempVar3);
		   }
		 }
	 }
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 x2 = Integer.parseInt(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead(" ");
	 if (tempVar5 != null)
	 {
		 y2 = Integer.parseInt(tempVar5);
	 }
	 int[][] t = new int[x2][y2];
	 for (i = 0;i < x2;i++)
	 {
		 for (j = 0;j < y2;j++)
		 {
		   String tempVar6 = ConsoleInput.scanfRead();
		   if (tempVar6 != null)
		   {
			   t[i][j] = Integer.parseInt(tempVar6);
		   }
		 }
	 }
	 int[][] r = new int[x1][y2];
	 for (i = 0;i < x1;i++)
	 {
		 for (j = 0;j < y2;j++)
		 {
			 r[i][j] = 0;
			 for (k = 0;k < y1;k++)
			 {
				 r[i][j] = r[i][j] + s[i][k] * t[k][j];
			 }
		 }
	 }
	 for (i = 0;i < x1;i++)
	 {
		 System.out.printf("%d",r[i][0]);
		 for (j = 1;j < y2;j++)
		 {
		   System.out.printf(" %d",r[i][j]);
		 }
		 System.out.print("\n");
	 }
	}

}

