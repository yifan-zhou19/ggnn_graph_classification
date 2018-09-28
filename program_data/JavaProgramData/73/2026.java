package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int flag = 0;
		int b;
		int c;
		int d;
		int e;
		int f = 0;
		int g;
		for (int i = 0 ;i < 5 ; i++)
		{
			 for (int k = 0 ;k < 5 ;k++)
			 {
				  a[i][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 }
		}

		for (int i = 0 ; i < 5 ; i++)
		{
			 b = a[i][0];
			 c = 0;
			 for (int j = 0 ; j < 5 ; j++)
			 {
				  if (a[i][j] >= b)
				  {
					   b = a[i][j];
					   c = j;
					   f = i;
				  }
			 }
			 if ((b <= a[1][c]) && (b <= a[2][c]) && (b <= a[3][c]) && (b <= a[4][c]) && (b <= a[0][c]))
			 {
				  flag = 1;
				  d = b;
				  e = c + 1;
				  g = f + 1;
				  break;
			 }
		}
		if (flag == 1)
		{
			 System.out.print(g);
			 System.out.print(" ");
			 System.out.print(e);
			 System.out.print(" ");
			 System.out.print(d);
		}
		else
		{
			 System.out.print("not found");
		}
		return 0;
	}

}

