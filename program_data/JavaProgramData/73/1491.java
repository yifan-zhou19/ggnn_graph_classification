package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[][] a = new int[5][5];
	  int m = 0;
	  int p;
	  int q;
	  int r = 1;
	  int w = 0;
	  for (int i = 0;i < 5;i++)
	  {
		for (int j = 0;j < 5;j++)
		{
		  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	  }
	  for (int i = 0;i < 5;i++)
	  {
		   m = 0;
		for (int j = 0;j < 5;j++)
		{
			if (a[i][j] > m)
			{
			  m = a[i][j];
			 p = i;
			 q = j;
			}
		}
			r = 1;
		  for (int k = 0;k < 5;k++)
		  {
			if (m > a[k][q])
			{
			   r = 0;
			   break;
			}
		  }
			if (r == 1)
			{
			 System.out.print(p + 1);
			 System.out.print(" ");
			 System.out.print(q + 1);
			 System.out.print(" ");
			 System.out.print(m);
			 System.out.print("\n");
			 w++;
			}

	  }
		 if (w == 0)
		 {
			 System.out.print("not found");
			 System.out.print("\n");
		 }

	  return 0;

	}
}

