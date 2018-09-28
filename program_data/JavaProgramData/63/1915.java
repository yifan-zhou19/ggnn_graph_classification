package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i;
		 int j;
		 int k;
		 int[][] a = new int[100][100];
		 int[][] b = new int[100][100];
		 int[][] c = new int[100][100];
		 int n;
		 int a1;
		 int a2;
		 int b1;
		 int b2;
		 int c1;
		 int c2;

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
		 a1--;
		 a2--;
		 for (i = 0;i <= a1;i++)
		 {
			 for (j = 0;j <= a2;j++)
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
		 b1--;
		 b2--;
		 for (i = 0;i <= b1;i++)
		 {
			 for (j = 0;j <= b2;j++)
			 {
				 String tempVar6 = ConsoleInput.scanfRead();
				 if (tempVar6 != null)
				 {
					 b[i][j] = Integer.parseInt(tempVar6);
				 }
			 }
		 }
		 c1 = a1;
		 c2 = b2;
		 for (i = 0;i <= c1;i++)
		 {
			 for (j = 0;j <= c2;j++)
			 {
				 c[i][j] = 0;
			 }
		 }

		 for (i = 0;i <= c1;i++)
		 {
			 for (j = 0;j <= c2;j++)
			 {
				 for (k = 0;k <= a2;k++)
				 {
					 c[i][j] += a[i][k] * b[k][j];
				 }
			 }
		 }

		 for (i = 0;i <= c1;i++)
		 {
			 System.out.printf("%d",c[i][0]);
			 for (j = 1;j <= c2;j++)
			 {
				 System.out.printf(" %d",c[i][j]);
			 }
			 System.out.print("\n");
		 }
	}
}

