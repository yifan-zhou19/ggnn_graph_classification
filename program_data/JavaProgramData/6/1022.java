package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int l;
		int sum;
		int temp;
		int c;
		int d;
		int e;
		int q;
		int w;
		int r;
		int t;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[] m = new int[100];
		int[] n = new int[100];
		for (i = 0;i < k;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							m[i] = Integer.parseInt(tempVar2);
						}
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							n[i] = Integer.parseInt(tempVar3);
						}
						for (j = 0;j < m[i];j++)
						{
										   for (l = 0;l < n[i];l++)
										   {
															  String tempVar4 = ConsoleInput.scanfRead();
															  if (tempVar4 != null)
															  {
																  a[j][l] = Integer.parseInt(tempVar4);
															  }
										   }
						}
						sum = 0;
						temp = 0;
						c = 0;
						d = 0;
						e = 0;
						for (j = 0;j < n[i];j++)
						{
										   temp = temp + a[0][j];
						}
						for (j = 0;j < n[i];j++)
						{
										   c = c + a[m[i] - 1][j];
						}
						for (j = 0;j < m[i];j++)
						{
										   d = d + a[j][0];
						}
						for (j = 0;j < m[i];j++)
						{
										   e = e + a[j][n[i] - 1];
						}
						if (m[i] == 1 && n[i] == 1)
						{
										  sum = a[0][0];
										  System.out.printf("%d\n",sum);
						}
						if (m[i] == 1 && n[i] != 1)
						{
										   for (j = 0;j < n[i];j++)
										   {
															  sum = sum + a[0][j];
										   }
										   System.out.printf("%d\n",sum);
						}
						if (m[i] != 1 && n[i] == 1)
						{
											for (j = 0;j < n[i];j++)
											{
															   sum = sum + a[j][0];
											}
											System.out.printf("%d\n",sum);
						}
						if (m[i] != 1 && n[i] != 1)
						{
											q = a[0][0];
											w = a[0][n[i] - 1];
											r = a[m[i] - 1][0];
											t = a[m[i] - 1][n[i] - 1];
											sum = c + d + e + temp - q - w - r - t;
											System.out.printf("%d\n",sum);
						}
		}
		return 0;
	}
}

