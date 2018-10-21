package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	int m;
	char[][] p = new char[150][150];
	char[][] a = new char[150][150];
	for (i = 0;i < 150;i++)
	{
	   for (j = 0;j < 150;j++)
	   {
			p[i][j] = '0';
			a[i][j] = '0';
	   }
	}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 1;
		j = 1;
	for (i = 1;i < n + 1;i++)

	{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  p[i] = tempVar2.charAt(0);
			  }
			  for (j = n;j >= 1;j--)
			  {
							   p[i][j] = p[i][j - 1];

			  }
							   p[i][0] = '0';
		  //printf("%c\n",p[i][j]);
	}

	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	//printf("%d\n",m);
	   for (k = 0;k < m - 1;k++)
	   {
	 for (i = 1;i < n + 1;i++)
	 {
	  for (j = 1;j < n + 1;j++)
	  {
			if (p[i][j] != '#')
			{

			if (p[i + 1][j] == '@' || p[i][j + 1] == '@' || p[i - 1][j] == '@' || p[i][j - 1] == '@')
			{
						  a[i][j] = '!';
			}
			}
	  }
	 }
			for (i = 1;i < n + 1;i++)
			{
		  for (j = 1;j < n + 1;j++)
		  {
		 if (a[i][j] == '!')
		 {
					 p[i][j] = '@';
					 a[i][j] = '0';
		 }
		  }
			}
	   }
	int sum = 0;
	for (i = 1;i < n + 1;i++)
	{
	  for (j = 1;j < n + 1;j++)
	  {
	   if (p[i][j] == '@')
	   {
		sum++;
	   }
	  }
	}
		System.out.printf("%d",sum);

	}

}

