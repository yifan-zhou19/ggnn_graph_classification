package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[][] a = new int[6][6];
	 int i;
	 int j;
	 int max;
	 int h;
	 int flag;
	 for (i = 1; i < 6; i++)
	 {
		 for (j = 1; j < 6; j++)
		 {
			 a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	 }
	 h = 0;
	 flag = 0;
	 for (i = 1; i < 6; i++)
	 {
		 max = a[i][1];
		 for (j = 1; j < 6; j++)
		 {
			 if (a[i][j] >= max)
			 {
				 max = a[i][j];
				 h = j;
			 }
		 }
		if (a[i][h] <= a[5][h] != 0 && a[i][h] <= a[1][h] != 0 && a[i][h] <= a[2][h] != 0 && a[i][h] <= a[3][h] != 0 && a[i][h] <= a[4][h])
		{
					flag = 1;
					System.out.print(i);
					System.out.print(" ");
					System.out.print(h);
					System.out.print(" ");
					System.out.print(a[i][h]);
					System.out.print("\n");
		}
	 }
	 if (flag == 0)
	 {
		 System.out.print("not found");
	 }
	 return 0;
	}
}

