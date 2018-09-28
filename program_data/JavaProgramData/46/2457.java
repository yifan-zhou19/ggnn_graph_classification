package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int u;
		int v;
		int w;
		int x;
		int y;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a = 0;
		int b;
		int c = 1;
		int d;
		int[][] num = new int[150][150];
		for (u = 0; u <= row - 1; u++)
		{
			for (v = 0; v <= col - 1; v++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					num[u][v] = Integer.parseInt(tempVar);
				}
			}
		}
		b = col - 1;
		d = row - 1;
		for (u = 0; u <= (row - 1) / 2; u++)
		{
				if (u > b)
				{
					break;
				}
				for (v = u; v <= b; v++)
				{
					System.out.print(num[u][v]);
					System.out.print("\n");
				}
				for (w = u + 1; w <= d; w++)
				{
					System.out.print(num[w][b]);
					System.out.print("\n");
				}
				for (x = b - 1; x >= u; x--)
				{
					if (u < d)
					{
					System.out.print(num[d][x]);
					System.out.print("\n");
					}
				}
				for (y = d - 1; y >= u + 1; y--)
				{
					if (u < b)
					{
					System.out.print(num[y][u]);
					System.out.print("\n");
					}
				}
				b--;
				d--;
		}
		return 0;
	}



	/*
	
	
	a=0;b=m-1;c=0;d=n-1;
	while (a<=b && c<=d)
	{
	print(..);
	a++;b--;c++;d--;
	}
	
	*/
}

