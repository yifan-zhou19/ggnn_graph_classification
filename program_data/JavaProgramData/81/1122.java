package <missing>;

public class GlobalMembers
{
	public static int change(int[][] a, int m, int n)
	{
		int count;
		int i;
		if (m < 0 || m >= 5 || n < 0 || n >= 5)
		{
				System.out.print("error");
				return 0;
		}
		for (count = 0;count < 5;count++)
		{
				if (count == n)
				{
					for (i = 0;i < 4;i++)
					{
						System.out.printf("%d ",a[m][i]);
					}
					System.out.printf("%d\n",a[m][4]);

				}
				else if (count == m)
				{
					for (i = 0;i < 4;i++)
					{
						System.out.printf("%d ",a[n][i]);
					}
					System.out.printf("%d\n",a[n][4]);

				}
				else
				{
					for (i = 0;i < 4;i++)
					{
						System.out.printf("%d ",a[count][i]);
					}
					System.out.printf("%d\n",a[count][4]);

				}
		}
			return 1;
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		int m;
		int n;
		int i;
		int j;
		int count = 0;
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
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
		change(a, m, n);

		/*for(count=0;count<5;count++)
			{
				if(count==n)
				{
					for(i=0;i<4;i++)
						printf("%d ",a[m][i]);
					printf("%d\n",a[m][4]);
				
				}
				else if(count==m)
				{
					for(i=0;i<4;i++)
						printf("%d ",a[n][i]);
					printf("%d\n",a[n][4]);
				
				}
				else 
				{
					for(i=0;i<4;i++)
						printf("%d ",a[count][i]);
					printf("%d\n",a[count][4]);
				
				}
			}return 0;*/
	}


}

