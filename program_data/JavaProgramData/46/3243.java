package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int r;
		 int c;
		 int i;
		 int j;
		 int[][] a = new int[100][100];
		 int n;
		 int t = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 r = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 c = Integer.parseInt(tempVar2);
		 }
		 for (i = 0;i < r;i++)
		 {
			 for (j = 0;j < c;j++)
			 {
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 a[i][j] = Integer.parseInt(tempVar3);
				 }
			 }
		 }

		 for (n = 0;;n++)
		 {
			 for (j = n;j < c - n;j++,t++)
			 {
				 System.out.printf("%d\n",a[n][j]);
			 }
			 if (t >= r * c)
			 {
				 break;
			 }
			 for (i = n + 1;i < r - n;i++,t++)
			 {
				 System.out.printf("%d\n",a[i][c - 1 - n]);
			 }
			 if (t >= r * c)
			 {
				 break;
			 }
			 for (j = c - 2 - n;j >= n;j--,t++)
			 {
				 System.out.printf("%d\n",a[r - n - 1][j]);
			 }
			 if (t >= r * c)
			 {
				 break;
			 }
			 for (i = r - 2 - n;i > n;i--,t++)
			 {
				 System.out.printf("%d\n",a[i][n]);
			 }
			 if (t >= r * c)
			 {
				 break;
			 }
		 }

	}
}

