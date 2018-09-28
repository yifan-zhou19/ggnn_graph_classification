package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
	 int[][] a = new int[301][301];
	 for (j = 1;j < 301;j++)
	 {
		 a[1][j] = 1;
		 for (i = 2;i < 301;i++)
		 {
			 a[i][j] = (a[i - 1][j] + j - 1) % i + 1;
		 }
	 }
	 for (i = 0;i < 1000;i++)
	 {
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 m = Integer.parseInt(tempVar2);
	 }
	 if (m == 0 && n == 0)
	 {
		 break;
	 }
	 else
	 {
		System.out.printf("%d\n",a[n][m]);
	 }
	 }
		 return 0;
	}

}

