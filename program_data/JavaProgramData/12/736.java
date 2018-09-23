package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int i;
			int j;
			int k;
			int m;
			int[][] a = new int[17][17];
			int[] b = new int[100];
			int[] c = new int[100];
			for (i = 1;i <= 100;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][1] = Integer.parseInt(tempVar);
				}
				if (a[i][1] == -1)
				{
				break;
				}
				else
				{
					for (j = 2;j <= 100;j++)
					{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i][j] = Integer.parseInt(tempVar2);
					}
					if (a[i][j] == 0)
					{
					break;
					}
					else
					{
						b[i] = j;
					}
					}
				}
				for (k = 1;k <= b[i];k++)
				{
					for (m = 1;m <= b[i];m++)
					{
						if (a[i][k] == 2 * a[i][m])
						{
							c[i]++;
						}
					}
				}
					System.out.printf("%d\n",c[i]);
			}



	}
}

