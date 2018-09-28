package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int m;
	  int i;
	  int j;
	  int k;
	  int s = 0;
	  char[][][] a = new char[110][110][110];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[1][i] = tempVar2.charAt(0);
		  }
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  m = Integer.parseInt(tempVar3);
	  }



	  for (k = 2;k <= m;k++)
	  {
		if (a[k - 1][0][0] == '.')
		{
		  if ((a[k - 1][1][0] == '@') || (a[k - 1][0][1] == '@'))
		  {
			a[k][0][0] = '@';
		  }
		  else
		  {
			a[k][0][0] = a[k - 1][0][0];
		  }
		}
		else
		{
		  a[k][0][0] = a[k - 1][0][0];
		}

		if (a[k - 1][0][n - 1] == '.')
		{
		  if ((a[k - 1][0][n - 2] == '@') || (a[k - 1][1][n - 1] == '@'))
		  {
			a[k][0][n - 1] = '@';
		  }
		  else
		  {
			a[k][0][n - 1] = a[k - 1][0][n - 1];
		  }
		}
		else
		{
		  a[k][0][n - 1] = a[k - 1][0][n - 1];
		}

		if (a[k - 1][n - 1][0] == '.')
		{
		  if ((a[k - 1][n - 1][1] == '@') || (a[k - 1][n - 2][0] == '@'))
		  {
			a[k][n - 1][0] = '@';
		  }
		  else
		  {
			a[k][n - 1][0] = a[k - 1][n - 1][0];
		  }
		}
		else
		{
		  a[k][n - 1][0] = a[k - 1][n - 1][0];
		}

		if (a[k - 1][n - 1][n - 1] == '.')
		{
		  if ((a[k - 1][n - 1][n - 2] == '@') || (a[k - 1][n - 2][n - 1] == '@'))
		  {
			a[k][n - 1][n - 1] = '@';
		  }
		  else
		  {
			a[k][n - 1][n - 1] = a[k - 1][n - 1][n - 1];
		  }
		}
		else
		{
		  a[k][n - 1][n - 1] = a[k - 1][n - 1][n - 1];
		}

		for (i = 1;i < n - 1;i++)
		{
		  if ((a[k - 1][i][0] == '.') && ((a[k - 1][i - 1][0] == '@') || (a[k - 1][i + 1][0] == '@') || (a[k - 1][i][1] == '@')))
		  {
			a[k][i][0] = '@';
		  }
		  else
		  {
			a[k][i][0] = a[k - 1][i][0];
		  }

		  if ((a[k - 1][i][n - 1] == '.') && ((a[k - 1][i - 1][n - 1] == '@') || (a[k - 1][i + 1][n - 1] == '@') || (a[k - 1][i][n - 2] == '@')))
		  {
			a[k][i][n - 1] = '@';
		  }
		  else
		  {
			a[k][i][n - 1] = a[k - 1][i][n - 1];
		  }

		 if ((a[k - 1][0][i] == '.') && ((a[k - 1][0][i - 1] == '@') || (a[k - 1][1][i] == '@') || (a[k - 1][0][i + 1] == '@')))
		 {
			a[k][0][i] = '@';
		 }
		  else
		  {
			a[k][0][i] = a[k - 1][0][i];
		  }

		 if ((a[k - 1][n - 1][i] == '.') && ((a[k - 1][n - 1][i - 1] == '@') || (a[k - 1][n - 2][i] == '@') || (a[k - 1][n - 1][i + 1] == '@')))
		 {
			a[k][n - 1][i] = '@';
		 }
		  else
		  {
			a[k][n - 1][i] = a[k - 1][n - 1][i];
		  }
		}

		for (i = 1;i < n - 1;i++)
		{
		  for (j = 1;j < n - 1;j++)
		  {
			if (a[k - 1][i][j] == '.')
			{
			  if ((a[k - 1][i - 1][j] == '@') || (a[k - 1][i + 1][j] == '@') || (a[k - 1][i][j - 1] == '@') || (a[k - 1][i][j + 1] == '@'))
			  {
				a[k][i][j] = '@';
			  }
			  else
			  {
				a[k][i][j] = a[k - 1][i][j];
			  }
			}
			else
			{
			  a[k][i][j] = a[k - 1][i][j];
			}
		  }
		}
	  }

	   for (i = 0;i < n;i++)
	   {
		for (j = 0;j < n;j++)
		{
		  if (a[m][i][j] == '@')
		  {
		   s++;
		  }
		}
	   }
	  System.out.printf("%d\n",s);
	}
}

