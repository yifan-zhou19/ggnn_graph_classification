package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int[][] b = new int[100][15];
		int c;
		int i;
		int m;
		int x;
		int y;
		int n;
		int e;
		c = 0;
		i = 0;
			for (m = 0;m < 16;m++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a = Integer.parseInt(tempVar);
				}
				  if (a != 0)
				  {
					b[i][m] = a;
				  }
				  if (a == 0)
				  {
						 for (x = 0;x < m;x++)
						 {
						 for (y = 0;y < m;y++)
						 {
							n = b[i][x] / b[i][y];
							e = b[i][x] % b[i][y];
							   if (n == 2 && e == 0)
							   {
								c++;
							   }
						 }
						 }
				System.out.printf("%d\n",c);
				 c = 0;
				 m = -1;
				 i++;
				  }
			if (a == -1)
			{
					break;
			}
			}
			return 0;
	}

}

