package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] b = new int[5];
		int[] c = new int[5];
		int i;
		int j;
		int f = 0;
		for (i = 0; i < 5; i++)
		{
			  for (j = 0; j < 5; j++)
			  {
				  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				  if (i == 0)
				  {
						  b[j] = a[i][j];
				  }
				  if (j == 0)
				  {
						  c[i] = a[i][j];
				  }
				  if (a[i][j] < b[j])
				  {
						 b[j] = a[i][j];
				  }
				  if (a[i][j] > c[i])
				  {
					  c[i] = a[i][j];
				  }
			  }
		}
		for (i = 0; i < 5; i++)
		{
			  for (j = 0; j < 5; j++)
			  {
				  if (b[j] == c[i])
				  {
						  System.out.print(i + 1);
						  System.out.print(" ");
						  System.out.print(j + 1);
						  System.out.print(" ");
						  System.out.print(b[j]);
						  System.out.print("\n");
						  f = 1;
				  }
			  }
		}
		if (f == 0)
		{
			  System.out.print("not found");
			  System.out.print("\n");
		}
		return 0;
	}

}

