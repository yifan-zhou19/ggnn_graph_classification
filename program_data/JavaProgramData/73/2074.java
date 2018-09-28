package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6]; //????????????????????i?j????????max?????k?mark?
		int i;
		int j;
		int max;
		int k = 0;
		int mark = 0;
	 for (i = 1;i < 6;i++) //??????
	 {
			 for (j = 1;j < 6;j++)
			 {
		 a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 }
	 }

	 for (i = 1;i < 6;i++) //?????????????????????
	 {
		 max = a[i][1];
		 for (j = 1;j < 6;j++)
		 {
			 if (a[i][j] >= max)
			 {
				 max = a[i][j];
				 k = j;
			 }
		 }

		if (a[i][k] <= a[1][k] != 0 && a[i][k] <= a[2][k] != 0 && a[i][k] <= a[3][k] != 0 && a[i][k] <= a[4][k] != 0 && a[i][k] <= a[5][k]) //???????????????????????

		{
				 mark = 1;
			  System.out.print(i);
			  System.out.print(" ");
			  System.out.print(k);
			  System.out.print(" ");
			  System.out.print(a[i][k]);
			  System.out.print("\n");
		}

	 }
	 if (mark == 0)
	 {
		 System.out.print("not found");
	 }
	 return 0;
	}
}

