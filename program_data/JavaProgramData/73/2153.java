package <missing>;

public class GlobalMembers
{
	public static int[][] op = new int[5][5];
	public static int[][] vis = new int[5][5];


	public static int Main()
	{
		for (int i = 0;i < 5;i++)
		{
		  for (int j = 0;j < 5;j++)
		  {
		   op[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
		}
		for (int i = 0;i < 5;i++)
		{
		 for (int j = 0;j < 5;j++)
		 {
				 for (int col = 0;col < 5;col++)
				 {
				   if (op[i][j] < op[i][col])
				   {
					vis[i][j] = 1;
				   }
				 }
				 for (int cow = 0;cow < 5;cow++)
				 {
				   if (op[i][j] > op[cow][j])
				   {
					vis[i][j] = 1;
				   }
				 }
		 }
		}
		  int sum = 0;
		  for (int i = 0;i < 5;i++)
		  {
		   for (int j = 0;j < 5;j++)
		   {
				   if (vis[i][j] == 0)
				   {
					   System.out.print(i + 1);
					   System.out.print(" ");
					   System.out.print(j + 1);
					   System.out.print(" ");
					   System.out.print(op[i][j]);
					   System.out.print("\n");
					sum++;
				   }
		   }
		  }
		 if (sum == 0)
		 {
			 System.out.print("not found");
			 System.out.print("\n");
		 }
		 return 0;
	}





}

