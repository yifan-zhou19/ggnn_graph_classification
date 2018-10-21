package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int m;
		  int n;
		  int[][] a = new int[5][5];
		  int max;
		  int min;
		  int s = 0;
		  for (i = 0;i < 5;i++)
		  {
				for (j = 0;j < 5;j++)
				{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
				}
		  }
		  for (i = 0;i < 5;i++)
		  {
				for (j = 0;j < 5;j++)
				{
						max = a[i][j];
						for (m = 0;m < 5;m++)
						{
							if (a[i][m] > max)
							{
						 max = a[i][m];
							}
						}
						min = a[i][j];
						for (n = 0;n < 5;n++)
						{
							if (a[n][j] < min)
							{
						 min = a[n][j];
							}
						}
						 if ((a[i][j] == max) && (a[i][j] == min))
						 {
						 System.out.printf("%d %d %d\n",i + 1,j + 1,a[i][j]);
						 }
						 else
						 {
						 s++;
						 }
						 if (s == 25)
						 {
						 System.out.print("not found\n");
						 }
				}
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

