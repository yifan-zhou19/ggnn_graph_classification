package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int q;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int x1;
		int x2;
		int y1;
		int y2;
		int[][] c = new int[100][100];
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				a[i][j] = b[i][j] = c[i][j] = 0;
			}
		}
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x2;i++)
		{
			for (j = 0;j < y2;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (x2 != y1)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < x1;i++)
			{
				for (j = 0;j < y2;j++)
				{
					for (q = 0;q < x2;q++)
					{
						c[i][j] = a[i][q] * b[q][j] + c[i][j];
					}
				}
			}
			/*for(i=0;i<x1;i++)
			{
				for(j=0;j<y1-1;j++)
			    {
					cout<<a[i][j]<<' ';
				}
			    cout<<a[i][y1-1]<<endl;
			}
			for(i=0;i<x2;i++)
			{
				for(j=0;j<y2-1;j++)
				{
					cout<<b[i][j]<<' ';
				}
				cout<<b[i][y2-1]<<endl;
			}*/
			for (i = 0;i < x1;i++)
			{
				for (j = 0;j < y2 - 1;j++)
				{
					System.out.print(c[i][j]);
					System.out.print(' ');
				}
				System.out.print(c[i][y2 - 1]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

