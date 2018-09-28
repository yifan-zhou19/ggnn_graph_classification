package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] s = new int[5][5];
		int m;
		int n;
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					s[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
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
				if (m >= 5 || n >= 5)
				{
					System.out.print("error");
				}
				else
				{
					for (i = 0;i < 5;i++)
					{
						for (j = 0;j < 4;j++)
						{
							if (i == m)
							{
								System.out.printf("%d ",s[n][j]);
							}
							else if (i == n)
							{
								System.out.printf("%d ",s[m][j]);
							}
							else
							{
								System.out.printf("%d ",s[i][j]);
							}
						}
						if (i == m)
						{
							System.out.printf("%d",s[n][4]);
						}
						else if (i == n)
						{
							System.out.printf("%d",s[m][4]);
						}
						else
						{
							System.out.printf("%d",s[i][4]);
						}
						System.out.print("\n");
					}
				}
	}

}

