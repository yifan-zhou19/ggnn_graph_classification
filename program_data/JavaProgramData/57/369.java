package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   char i;
	   char[][] in = new char[55][20];
	   int j;
	   int k;
	   for (i = 1;i <= n + 1;i++)
	   {
		   in[i] = new Scanner(System.in).nextLine();
		   k = String.valueOf(in[i]).length();
		   if (in[i][k - 1] == 'r')
		   {
			   for (j = 0;j < k - 2;j++)
			   {
				   System.out.printf("%c",in[i][j]);
			   }
			   if (j == k - 2)
			   {
				   System.out.print("\n");
			   }
		   }
		   if (in[i][k - 1] == 'y')
		   {
			   for (j = 0;j < k - 2;j++)
			   {
				   System.out.printf("%c",in[i][j]);
			   }
			   if (j == k - 2)
			   {
				   System.out.print("\n");
			   }
		   }
		   if (in[i][k - 1] == 'g')
		   {
			   for (j = 0;j < k - 3;j++)
			   {
				   System.out.printf("%c",in[i][j]);
			   }
			   if (j == k - 3)
			   {
				   System.out.print("\n");
			   }
		   }

	   }


	}


}

