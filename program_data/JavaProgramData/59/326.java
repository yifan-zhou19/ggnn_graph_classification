package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  char[][] a = new char[100][100];
	  char[][] b = new char[100][100];
	  int n;
	  int i;
	  int j;
	  int k;
	  int x = 0;
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
				a[i] = tempVar2.charAt(0);
			}
			for (j = 0;j < n;j++)
			{
				 b[i][j] = a[i][j];
			}
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  k = Integer.parseInt(tempVar3);
	  }
	  for (;k > 1;k--)
	  {
		  for (i = 0;i < n;i++)
		  {
			   for (j = 0;j < n;j++)
			   {
					b[i][j] = a[i][j];
			   }
		  }
		  for (i = 0;i < n;i++)
		  {
			   for (j = 0;j < n;j++)
			   {
					if (b[i][j] == '#' || b[i][j] == '@')
					{
					continue;
					}
					if ((i > 0 && b[i - 1][j] == '@') || (j > 0 && b[i][j - 1] == '@') || (i < n - 1 && b[i + 1][j] == '@') || (j < n - 1 && b[i][j + 1] == '@'))
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
					x++;
					}
			   }
	  }
		  System.out.printf("%d\n",x);
	}

}

