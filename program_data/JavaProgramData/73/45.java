package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[7][7];
		int i;
		int j;
		int x = 0;
		int y = 0;
		int m;
		int k;
		for (i = 0;i < 5;i++)
		{
		   for (j = 0;j < 5;j++)
		   {
			  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
		}
		for (i = 0;i < 5;i++)
		{
			 x = i;
			 y = 0;
			 m = a[i][0];
			 for (j = 1;j < 5;j++)
			 {
				if (m < a[i][j])
				{
				   m = a[i][j];
				   x = i;
				   y = j;
				}

			 }
			 for (k = 0;k < 5;k++)
			 {
					 if (m > a[k][y])
					 {
					   break;
					 }
			 }
				  if (k == 5)
				  {
						System.out.print(x + 1);
						System.out.print(" ");
						System.out.print(y + 1);
						System.out.print(" ");
						System.out.print(m);
						i = 5;
						j = 5;
						m = 0;
				  }
		}
		if (m != 0)
		{
		   System.out.print("not found");
		}
		return 0;
	}

}

