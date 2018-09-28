package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int s;
		int t;
		char[][] a = new char[102][102];
		char[][] b = new char[102][102];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

	/*  ??????????????????????
		for(i=1;i<=n;i++){     
			for(j=1;j<=n;j++){
				scanf("%c",&(a[i][j]));
			}
		}
	*/
	//??????????????????????
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i][1]) = tempVar2.charAt(0);
			}
		}

		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (j = 0;j < n + 2;j++)
		{
			a[0][j] = '#';
			a[n + 1][j] = '#';
		}
		for (i = 0;i < n + 2;i++)
		{
			a[i][0] = '#';
			a[i][n + 1] = '#';
		}
		for (s = 2;s <= m;s++)
		{
			for (i = 1;i <= n;i++)
			{
			   for (j = 1;j <= n;j++)
			   { //???????????????a????????b??????????b??????????
				   //if(a[i][j]=='@'){   
					   b[i][j] = a[i][j];
				   //}
			   }
			}
			for (i = 1;i <= n;i++)
			{
			   for (j = 1;j <= n;j++)
			   {
				   if (b[i][j] == '@')
				   {
					   if (a[i][j + 1] != '#')
					   {
						   a[i][j + 1] = '@';
					   }
					   if (a[i][j - 1] != '#')
					   {
						   a[i][j - 1] = '@';
					   }
					   if (a[i + 1][j] != '#')
					   {
						   a[i + 1][j] = '@';
					   }
					   if (a[i - 1][j] != '#')
					   {
						   a[i - 1][j] = '@';
					   }
				   }
			   }
			}
		}
		t = 0;
		for (i = 0;i <= n + 1;i++)
		{
			for (j = 0;j <= n + 1;j++)
			{
				if (a[i][j] == '@')
				{
					t = t + 1;
				}
			}
		}
		System.out.printf("%d",t);
		return 0;
	}


}

