package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int c;
	int r;
	int x;
	int t;
	int r1;
	int r2;
	int c1;
	int c2;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[][] sz = new int[n][n];
	t = 0;
	for (r = 0;r < n;r++)
	{
			  for (c = 0;c < n;c++)
			  {
					 String tempVar2 = ConsoleInput.scanfRead();
					 if (tempVar2 != null)
					 {
						 (sz[r][c]) = Integer.parseInt(tempVar2);
					 }
					 if (t == 0 && sz[r][c] == 0)
					 {
							 r1 = r;
							 c1 = c;


							 t = 1;
					 }
			  }
	}
	t = 0;
	for (r = n - 1;r >= 0;r--)
	{
			   for (c = n - 1;c >= 0;c--)
			   {
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							(sz[r][c]) = Integer.parseInt(tempVar3);
						}
						if (t == 0 && sz[r][c] == 0)
						{
								  r2 = r;
								  c2 = c;
								  t = 1;
						}
			   }
	}
		x = (r2 - r1 - 1) * (c2 - c1 - 1);
		System.out.printf("%d",x);
			   return 0;

	}


}

