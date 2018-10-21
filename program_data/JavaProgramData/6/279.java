package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int n;
		int i;
		int j;
		int x;
		int y;
		int sum;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (c = 1;c <= n;c++)
		{
		  sum = 0;
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  x = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  y = Integer.parseInt(tempVar3);
		  }
		  for (i = 0;i < x;i++)
		  {
			for (j = 0;j < y;j++)
			{
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  a[i][j] = Integer.parseInt(tempVar4);
			  }
			}
		  }
		  for (i = 0;i < x;i++)
		  {
			sum = sum + a[i][0];
		  }
		  for (i = 0;i < x;i++)
		  {
			sum = sum + a[i][j - 1];
		  }
		  for (j = 0;j < y;j++)
		  {
			 sum = sum + a[0][j];
		  }
		  for (j = 0;j < y;j++)
		  {
			 sum = sum + a[x - 1][j];
		  }
		  sum = sum - a[0][0] - a[x - 1][0] - a[0][y - 1] - a[x - 1][y - 1];
		  if (c != n)
		  {
		  System.out.printf("%d\n",sum);
		  }
		  else
		  {
		  System.out.printf("%d",sum);
		  }
		}
	}
}

