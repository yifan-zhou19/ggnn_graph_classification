package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print("\n");
		int[][] a = new int[102][102];
		int[][] b = new int[102][102];
		for (int i = 0;i < n;i++) //???????
		{
		 for (int l = 0;l < m;l++)
		 {
		 a[i][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 System.out.print("\n");
		}
		System.out.print("\n");
		j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print("\n");
		for (int i = 0;i < j;i++) //???????
		{
		 for (int l = 0;l < k;l++)
		 {
		 b[i][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 System.out.print("\n");
		}
		 System.out.print("\n");
		 int[][] c = new int[102][102];
		 for (int i = 0;i < n;i++)
		 {
		for (int l = 0;l < k;l++)
		{
		   c[i][l] = 0;
		   for (int p = 0;p < m;p++) //?????????
		   {
		   c[i][l] = c[i][l] + a[i][p] * b[p][l];
		   }
		}
		 }
		 for (int i = 0;i < n;i++)
		 {
		   for (int l = 0;l < k - 1;l++) //??????????
		   {
		   System.out.print(c[i][l]);
		   System.out.print(" ");
		   }
	   System.out.print(c[i][k - 1]);
	   System.out.print("\n");
		   System.out.print("\n");
		 }
		 System.out.print("\n");
		 return 0;
	}


}

