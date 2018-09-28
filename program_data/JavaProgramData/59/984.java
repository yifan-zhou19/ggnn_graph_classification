package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int count = 0;
	  int t;
	  int n;
	  int i;
	  int j;
	  int m;
	  char[][] a = new char[1000][1000];
	  char[][] b = new char[1000][1000];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
	   for (j = 0;j < n;j++)
	   {
			if (j == n - 1)
			{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				a[i][j] = tempVar2.charAt(0);
			}
			}
			else
			{
			String tempVar3 = ConsoleInput.scanfRead(null, 1);
			if (tempVar3 != null)
			{
				a[i][j] = tempVar3.charAt(0);
			}
			}
	   }
	  }
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  m = Integer.parseInt(tempVar4);
	  }
	  for (t = 1;t < m;t++)
	  {
	   for (i = 0;i < n;i++)
	   {
		for (j = 0;j < n;j++)
		{
		 if (a[i][j] == '@')
		 {
		  if ((i + 1) < n && a[i + 1][j] == '.')
		  {
		  b[i + 1][j] = '@';
		  }

		  if ((i - 1) >= 0 && a[i - 1][j] == '.')
		  {
		  b[i - 1][j] = '@';
		  }

		  if ((j + 1) < n && a[i][j + 1] == '.')
		  {
		  b[i][j + 1] = '@';
		  }

		  if ((j - 1) >= 0 && a[i][j - 1] == '.')
		  {
		  b[i][j - 1] = '@';
		  }
		 }
		}
	   }
	   for (i = 0;i < n;i++)
	   {
				for (j = 0;j < n;j++)
				{
					if (b[i][j] == '@' && a[i][j] != '#')
					{
						 a[i][j] = '@';
					}
				}
	   }
	  }
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
				  if (a[i][j] == '@')
				  {
					 count++;
				  }
				}
			}
		/*  for (i=0;i<n;i++)
		  {
		      for (j=0;j<n;j++)
		        {
		           if (j==n-1)
		            printf("%c\n",a[i][j]);
		           else 
		            printf("%c",a[i][j]);
		        }
		  }*/
	System.out.printf("%d",count);
	}


}

