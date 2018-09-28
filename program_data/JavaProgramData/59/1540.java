package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int day;
		int count = 0;
		int[][] iday = new int[100][100];
		char[][] room = new char[100][100];
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				iday[i][j] = 200;
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					room[i][j] = tempVar2.charAt(0);
				}
				while ((room[i][j] == ' ') || (room[i][j] == '\n'))
				{
					String tempVar3 = ConsoleInput.scanfRead(null, 1);
					if (tempVar3 != null)
					{
						room[i][j] = tempVar3.charAt(0);
					}
				}
				if (room[i][j] == '@')
				{
					iday[i][j] = 1;
				}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
		for (day = 2;day <= m;day++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if ((room[i][j] == '@') && (iday[i][j] < day))
					{
						if ((room[i][j + 1] == '.') && (j + 1 < n))
						{
							room[i][j + 1] = '@';
							iday[i][j + 1] = day;
						//printf("??room[%d][%d]\n",i,j+1);
						}

						if ((room[i][j - 1] == '.') && (j - 1 >= 0))
						{
							room[i][j - 1] = '@';
							iday[i][j - 1] = day;
						 //   printf("??room[%d][%d]\n",i,j-1);
						}

						if ((room[i + 1][j] == '.') && (i + 1 < n))
						{
							room[i + 1][j] = '@';
							iday[i + 1][j] = day;
						 //   printf("??room[%d][%d]\n",i+1,j);
						}

						if ((room[i - 1][j] == '.') && (i - 1 >= 0))
						{
							room[i - 1][j] = '@';
							iday[i - 1][j] = day;
						 //   printf("??room[%d][%d]\n",i-1,j);
						}

					}
				}
			}
	 /*       for(i1=0;i1<n;i1++)
	            for(j1=0;j1<n;j1++)
	            {
	                printf("%c",room[i1][j1]);
	                if(j1==n-1)
	                    printf("\n");
	                else printf(" ");
	            }
	        printf("\n");         */

		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (room[i][j] == '@')
				{
					count++;
				}
			}
		}
		System.out.printf("%d\n",count);

	}
}

