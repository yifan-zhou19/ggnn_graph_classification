package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i;
		 int j;
		 int height;
		 int[][] a = new int[101][101];
		 int[][] b = new int[101][101];
		 int[][] c = new int[101][101];
		 int k;
		 int l;
		 int a1;
		 int a2;
		 int b1;
		 int b2;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a1 = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 a2 = Integer.parseInt(tempVar2);
		 }
		 for (i = 1; i <= a1; i++)
		 {
				for (j = 1; j <= a2; j++)
				{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i][j] = Integer.parseInt(tempVar3);
			 }
				}
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 b1 = Integer.parseInt(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead(" ");
		 if (tempVar5 != null)
		 {
			 b2 = Integer.parseInt(tempVar5);
		 }
		 for (i = 1; i <= b1; i++)
		 {
			 for (j = 1; j <= b2; j++)
			 {
			 String tempVar6 = ConsoleInput.scanfRead();
			 if (tempVar6 != null)
			 {
				 b[i][j] = Integer.parseInt(tempVar6);
			 }
			 }
		 }
		 for (k = 1; k <= a1; k++)
		 {
			 for (l = 1; l <= b2; l++)
			 {
				 for (i = 1; i <= b1; i++)
				 {
					  c[k][l] += a[k][i] * b[i][l];
				 }
				if (l < b2)
				{
				System.out.printf("%d ", c[k][l]);
				}
				else
				{
				System.out.printf("%d", c[k][l]);
				}
			 }
			   System.out.print("\n");
		 }
	}

}

