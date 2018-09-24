package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int a;
		int c;
		int b;
		int d;
		int[][] image = new int[M][N];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					image[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
	   for (i = 0;i < n;i++)
	   {
		   for (j = 0;j < n;j++)
		   {
			  if (image[i][j] == 0 && image[i][j - 1] != 0 && image[i - 1][j] != 0)
			  {
				   a = i;
				   b = j;
			  }
			  else if (image[i][j] == 0 && image[i][j + 1] != 0 && image[i + 1][j] != 0)
			  {
				   c = i;
				   d = j;
			  }
		   }
	   }
		System.out.printf("%d",(c - a - 1) * (d - b - 1));
	}
}

