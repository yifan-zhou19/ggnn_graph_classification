package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		int s = 0;
		int[][] a = new int[5][5];
		int[] b = new int[5];
		int[] c = new int[5];
		int[] d = new int[5];
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
						  b[i] = a[i][0];
						  for (j = 0;j < 5;j++)
						  {
										  if (a[i][j] >= b[i])
										  {
														 b[i] = a[i][j];
														 d[i] = j;
										  }
						  }

		}
		for (j = 0;j < 5;j++)
		{
						  c[j] = a[0][j];
						  for (i = 0;i < 5;i++)
						  {
										  if (a[i][j] <= c[j])
										  {
														 c[j] = a[i][j];
										  }
						  }
		}
		for (i = 0;i < 5;i++)
		{
						  t = d[i];
						  if (b[i] == c[t])
						  {
										 System.out.printf("%d %d %d",i + 1,t + 1,b[i]);
										 s = s + 1;
						  }
		}
		if (s == 0)
		{
				 System.out.print("not found");
		}
	return 0;
	}
}

