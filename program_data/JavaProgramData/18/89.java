package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int size;
		int t;
		int i;
		int j;
		int round;
		int[][] a = new int[101][101];
		int[] s = new int[101];
		int[] minx = new int[101];
		int[] miny = new int[101];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(s,0,(Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		size = n;

		for (t = 1;t <= n;t++)
		{
						 for (i = 1;i <= n;i++)
						 {
										  for (j = 1;j <= n;j++)
										  {
														   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
										  }

						 }
						 size = n;
						 for (round = 1;round <= n - 1;round++)
						 {
														for (i = 1;i <= size;i++)
														{
																			minx[i] = a[i][1];
														}
														for (i = 1;i <= size;i++)
														{
																		 for (j = 1;j <= size;j++)
																		 {
																						  if (a[i][j] < minx[i])
																						  {
																							  minx[i] = a[i][j];
																						  }


																		 }
														}
														for (i = 1;i <= size;i++)
														{
																		 for (j = 1;j <= size;j++)
																		 {
																						  a[i][j] = a[i][j] - minx[i];
																		 }
														}
														 for (j = 1;j <= size;j++)
														 {
																			 miny[j] = a[1][j];
														 }
														 for (j = 1;j <= size;j++)
														 {
																		 for (i = 1;i <= size;i++)
																		 {
																						  if (a[i][j] < miny[j])
																						  {
																							  miny[j] = a[i][j];
																						  }


																		 }
														 }
														for (i = 1;i <= size;i++)
														{
																		 for (j = 1;j <= size;j++)
																		 {
																						  a[i][j] = a[i][j] - miny[j];
																		 }
														}

														 s[t] = s[t] + a[2][2];
														 for (j = 2;j <= size-1;j++)
														 {
																		  a[1][j] = a[1][j + 1];
														 }
														 for (i = 2;i <= size-1;i++)
														 {
																		  a[i][1] = a[i + 1][1];
														 }
														 for (i = 2;i <= size-1;i++)
														 {
																		  for (j = 2;j <= size-1;j++)
																		  {
																						  a[i][j] = a[i + 1][j + 1];
																		  }
														 }
														 size--;

						 }

		}
		for (i = 1;i <= n;i++)
		{
						 System.out.print(s[i]);
						 System.out.print("\n");
		}
		return 0;
	}

}

