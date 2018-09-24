package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int num;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  num = Integer.parseInt(tempVar);
		  }
		  int i;
		  for (i = 0;i < num;i++)
		  {
			int m;
			int n;
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
			int[][] a = new int[m][n];
			for (int j = 0;j < m;j++)
			{
			  for (int h = 0;h < n;h++)
			  {
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  a[j][h] = Integer.parseInt(tempVar4);
			  }
			  }
			}
			int sum = 0;
			for (int j = 0;j < n;j++)
			{
			  sum += a[0][j];
			}
			for (int j = 1;j < m;j++)
			{
			sum += a[j][0];
			}
			for (int j = 1;j < n;j++)
			{
			sum += a[m - 1][j];
			}
			for (int j = 1;j < m - 1;j++)
			{
			sum += a[j][n - 1];
			}
			System.out.printf("%d\n",sum);
		  }
		  System.in.read();
		  System.in.read();
	}

}

