package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[][] b = new int[5][5];
		int i = 0;
		int j = 0;
		int s = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++)
		{
			int x = 0;
			int y = 0;
			int t = 0;
			int d = 0;
			for (j = 0;j < 5;j = j + 1)
			{
				if (t <= a[i][j])
				{
					t = a[i][j];
					 x = i;
					 y = j;
				}
				else
				{
					x = i;
				}
			}
			//cout<<t<<endl;
			int k = 0;
			for (k = 0;k < 5;k++)
			{
				if (t > a[k][y])
				{
				d = d + 1;
				}
			}
			 if (d == 0)
			 {
			 System.out.print(x + 1);
			 System.out.print(" ");
			 System.out.print(y + 1);
			 System.out.print(" ");
			 System.out.print(t);
			 System.out.print("\n");
			 s = s + 1;
			 }
		}
		if (s == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}


}

