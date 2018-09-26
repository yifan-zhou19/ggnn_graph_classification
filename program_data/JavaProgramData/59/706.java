package <missing>;

public class GlobalMembers
{
	public static char[][] a = new char[105][105];
	public static int n;
	public static void infect(int m)
	{
	  int i;
	  int j;
	  if (m == 1)
	  {
		  return;
	  }
	  for (i = 0;i < n;i++)
	  {
		for (j = 0;j < n;j++)
		{
		  if (a[i][j] == '@')
		  {
			if (i + 1 < n && a[i + 1][j] == '.')
			{
			  a[i + 1][j] = ',';
			}
			if (j + 1 < n && a[i][j + 1] == '.')
			{
			  a[i][j + 1] = ',';
			}
			if (i - 1 >= 0 && a[i - 1][j] == '.')
			{
			  a[i - 1][j] = ',';
			}
			if (j - 1 >= 0 && a[i][j - 1] == '.')
			{
			  a[i][j - 1] = ',';
			}
		  }
		}
	  }
		for (i = 0;i < n;i++)
		{
		 for (j = 0;j < n;j++)
		 {
			if (a[i][j] == ',')
			{
			   a[i][j] = '@';
			}
		 }
		}

		infect(m - 1);
		return;
	}
	public static int Main()
	{
	  int m;
	  int i;
	  int j;
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
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  m = Integer.parseInt(tempVar3);
	  }
	  infect(m);
	  int sum = 0;
	  for (i = 0;i < n;i++)
	  {
		 for (j = 0;j < n;j++)
		 {
			if (a[i][j] == '@')
			{
			  sum++;
			}
		 }
	  }
	  System.out.printf("%d",sum);
	 return 0;
	}

}

