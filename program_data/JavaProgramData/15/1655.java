package <missing>;

public class GlobalMembers
{
		public static int[][] sz = new int[ROW][COL];

	public static int Main()
	{
		int row;
		int col;
		int a;
		int b;
		int c;
		int d;
		int t;
		int s;
		int x;
		int n;
		int m = 0;
		int l = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			for (row = 0;row < n;row++)
			{
				for (col = 0;col < n;col++)
				{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[row][col] = Integer.parseInt(tempVar2);
			}
				}
			}
			for (row = 0;row < n;row++)
			{
				for (col = 0;col < n;col++)
				{
					if (sz[row][col] == 0)
					{
						a = row;
						b = col;
						m = 1;


	//		printf("%d %d %d\n ",a, b ,m);
						break;
					}
				}
				 if (m == 1)
				 {
				break;
				 }
			}
			for (row = n - 1;row >= 0;row--)
			{
				for (col = n - 1;col >= 0;col--)
				{

	//	printf("%d %d \n ",row,col);

					if (sz[row][col] == 0)
					{
					c = row;
					d = col;
					l = 1;
	//	printf("%d %d %d\n ",c, d ,l);
			break;
					}
				}
				   if (l == 1)
				   {
					break;
				   }
			}

			t = c - a - 1;
			s = d - b - 1;

	//		printf("%d %d\n",t,s);

			if (t < 0 || s < 0)
			{
				x = 0;
			}
				else
				{
			x = t * s;
				}
			System.out.printf("%d\n",x);
			return 0;
	}
}

