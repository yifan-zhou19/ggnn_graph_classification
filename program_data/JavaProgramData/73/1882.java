package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int max;
		int min;
		int x;
		int y;
		int n = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++)
		{
			max = a[i][0];
			y = 0;

		  for (j = 0;j < 5;j++)
		  {
		  if (a[i][j] > max)
		  {
			  max = a[i][j];
			  y = j;
		  }
		  }
		  min = a[i][y];
		  x = i;
		  for (j = 0;j < 5;j++)
		  {
			  if (min > a[j][y])
			  {
				  x = j;
				  min = a[j][y];
			  }
		  }
		  if (i == x)
		  {
			  System.out.print(x + 1);
			  System.out.print(' ');
			  System.out.print(y + 1);
			  System.out.print(' ');
			  System.out.print(a[x][y]);
			  break;
		  }
		  n++;
		 if (n == 5 && i != x)
		 {
			 System.out.print("not found");
		 }
		}
	  return 0;


	}

}

