package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[][] s = new int[20][20];
	 int m;
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 for (int i = 0;i <= m - 1;i++)
	 {
		 for (int j = 0;j <= n - 1;j++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 s[i][j] = Integer.parseInt(tempVar3);
			 }
		 }
	 }
	 for (int a = 0;a <= m - 1;a++)
	 {
		 for (int b = 0;b <= n - 1;b++)
		 {
			 if (a == 0)
			 {
				 if (b == 0)
				 {
					 if (s[a][b] >= s[a][b + 1] != 0 && s[a][b] >= s[a + 1][b])
					 {
						 System.out.printf("%d %d\n",a,b);
					 }
				 }
				 else if (b <= n - 2)
				 {
					 if (s[a][b] >= s[a][b + 1] != 0 && s[a][b] >= s[a][b - 1] != 0 && s[a][b] >= s[a + 1][b])
					 {
						  System.out.printf("%d %d\n",a,b);
					 }
				 }
				 else if (b == n - 1)
				 {
					 if (s[a][b] >= s[a][b - 1] != 0 && s[a][b] >= s[a + 1][b])
					 {
						 System.out.printf("%d %d\n",a,b);
					 }
				 }
			 }
			 else if (a != 0 && a != m - 1)
			 {
				 if (b == 0)
				 {
					 if (s[a][b] >= s[a + 1][b] != 0 && s[a][b] >= s[a - 1][b] != 0 && s[a][b] >= s[a][b + 1])
					 {
						 System.out.printf("%d %d\n",a,b);
					 }
				 }
				 else if (b <= n - 2)
				 {
					 if (s[a][b] >= s[a][b + 1] != 0 && s[a][b] >= s[a][b - 1] != 0 && s[a][b] >= s[a + 1][b] != 0 && s[a][b] >= s[a - 1][b])
					 {
						 System.out.printf("%d %d\n",a,b);
					 }
				 }
				 else if (b == n - 1)
				 {
					 if (s[a][b] >= s[a][b - 1] != 0 && s[a][b] >= s[a - 1][b] != 0 && s[a][b] >= s[a + 1][b])
					 {
						 System.out.printf("%d %d\n",a,b);
					 }
				 }
			 }
			 else
			 {
				 if (b == 0)
				 {
					 if (s[a][b] >= s[a][b + 1] != 0 && s[a][b] >= s[a - 1][b])
					 {
						 System.out.printf("%d %d\n",a,b);
					 }
				 }
				 else if (b != n - 1)
				 {
					 if (s[a][b] >= s[a][b - 1] != 0 && s[a][b] >= s[a][b + 1] != 0 && s[a][b] >= s[a - 1][b])
					 {
						 System.out.printf("%d %d\n",a,b);
					 }
				 }
				 else
				 {
					 if (s[a][b] >= s[a][b - 1] != 0 && s[a][b] >= s[a - 1][b])
					 {
						 System.out.printf("%d %d\n",a,b);
					 }
				 }
			 }
		 }
	 }








	 return 0;
	}
}

