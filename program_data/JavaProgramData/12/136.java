package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][16];
		int i;
		int j;
		int k;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][0] = Integer.parseInt(tempVar);
			}
			if (a[i][0] == -1)
			{
				break;
			}
			else
			{
				for (j = 1;j < 16;j++)
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
				}
			}
		}

		for (i = 0;i < 100;i++)
		{

			int num = 0;
			if (a[i][0] == -1)
			{
				break;
			}
			else
			{
				for (j = 0;(j < 16) && (a[i][j] != 0);j++)
				{
					for (k = j + 1;(k < 16) && (a[i][k] != 0);k++)
					{
						if (a[i][k] == 2 * a[i][j])
						{
							num++;
						}
						else if (a[i][j] == 2 * a[i][k])
						{
							num++;
						}
					}
				}
			}
			 System.out.printf("%d\n",num);
		}



	}



}

