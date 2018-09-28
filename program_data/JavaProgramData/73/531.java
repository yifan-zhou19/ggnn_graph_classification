package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[][] a = new int[5][5];
	 int i;
	 int j;
	 int x;
	 int l;
	 int n;
	 int max;
	 for (i = 0;i <= 4;i++)
	 {
		for (j = 0;j <= 4;j++)
		{
		   x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   a[i][j] = x;
		}
	 }
	 l = 0;
	 for (i = 0;i <= 4;i++)
	 {
	   max = a[i][0];
	   n = 0;
	   for (j = 1;j <= 4;j++)
	   {
		  if (a[i][j] > a[i][n])
		  {
			n = j;
		  }
	   }
	   if ((a[i][n] <= a[0][n]) && (a[i][n] <= a[1][n]) && (a[i][n] <= a[2][n]) && (a[i][n] <= a[3][n]) && (a[i][n] <= a[4][n]))
	   {
		System.out.print(i + 1);
		System.out.print(" ");
		System.out.print(n + 1);
		System.out.print(" ");
		System.out.print(a[i][n]);
		System.out.print("\n");
		l++;
	   }
	 }
	 if (l == 0)
	 {
	   System.out.print("not found");
	   System.out.print("\n");
	 }
	 return 0;
	}

}

