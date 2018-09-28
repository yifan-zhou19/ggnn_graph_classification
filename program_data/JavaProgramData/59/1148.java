package <missing>;

public class GlobalMembers
{
	public static char[][] a = new char[110][110];
	public static int Main()
	{
		int n;
		int m;
		int sum = 0;
		int[] disx = {1, 0, -1, 0};
		int[] disy = {0, -1, 0, 1};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (int i = 1;i <= n;i++)
		 {
			 for (int j = 1;j <= n;j++)
			 {
				 a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			 }
		 }
		 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (int q = 1;q < m;q++)
		 {
			 for (int i = 0;i <= n;i++)
			 {
				 for (int j = 0;j <= n;j++)
				 {
					 if (a[i][j] == '@')
					 {
						  for (int i_ = 0;i_ < 4;i_++)
						  {
						   if (a[i + disx[i_]][j + disy[i_]] == '.')
						   {
								  a[i + disx[i_]][j + disy[i_]] = '&';
						   }
						  }
					 }
				 }
			 }
			  for (int i = 0;i <= n;i++)
			  {
				 for (int j = 0;j <= n;j++)
				 {
					 if (a[i][j] == '&')
					 {
						 a[i][j] = '@';
					 }
				 }
			  }
		 }
		 for (int i = 0;i <= n;i++)
		 {
			 for (int j = 0;j <= n;j++)
			 {
				 if (a[i][j] == '@')
				 {
					 sum++;
				 }
			 }
		 }
		 System.out.print(sum);
		 System.out.print("\n");

		return 0;

	}
}

