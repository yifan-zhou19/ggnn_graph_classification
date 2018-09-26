package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = new int(int x,int y);
		int k;
		int i;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}

		  System.out.printf("%d\n", sum(m, n));
		}
		 return 0;
	}
		public static int sum(int x,int y)
		{
		  int[][] b = new int[100][100];
		  int sum = 0;
		  int i;
		  int j;
		  for (i = 0;i < x;i++)
		  {
		  for (j = 0;j < y;j++)
		  {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 b[i][j] = Integer.parseInt(tempVar);
		 }
		  }
		  }
		  for (i = 0;i < x;i++)
		  {
		 for (j = 0;j < y;j++)
		 {
		 if (i == 0 || i == (x - 1) || j == 0 || j == (y - 1))
		 {
		  sum = sum + b[i][j];
		 }
		 }
		  }
		  return (sum);
		}

}

