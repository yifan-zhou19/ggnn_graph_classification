package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a;
	   int b;
	   int i;
	   int j;
	   int q;
	   a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int[][] m = new int[a + 1][b + 1]; //???????
	   for (i = 1;i <= a;i++)
	   {
		   for (j = 1;j <= b;j++)
		   {
				 m[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
	   }
	   for (q = 2;q <= a + b;q++) //???????,??????????,?q
	   {
		 for (i = 1,j = q - i;j > 0;i++,j = q - i) //?????????????????
		 {
			  if (j <= b != 0 && i <= a) //???????
			  {
			   System.out.print(m[i][j]);
			   System.out.print("\n");
			  }
		 }
	   }
	   return 0;
	}

}

