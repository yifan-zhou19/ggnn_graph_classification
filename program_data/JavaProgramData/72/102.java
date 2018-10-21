package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	int[][] str = new int[100][100];
	int i;
	int j;
	int p;
	int q;
	int a;
	int b;
	a = n + 2;
	b = m + 2;
	for (j = 0;j < n + 2;j++)
	{
		str[0][j] = 0;
	}
	for (j = 0;j < n + 2;j++)
	{
		str[a][j] = 0;
	}
	for (i = 0;i < m + 2;i++)
	{
		str[i][0] = 0;
	}
	for (i = 0;i < m + 2;i++)
	{
		str[i][b] = 0;
	}
	for (i = 1;i < m + 1;i++)
	{
	  for (j = 1;j < n + 1;j++)
	  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  str[i][j] = Integer.parseInt(tempVar3);
		  }
	  }
	}
	 for (i = 1;i < m + 2;i++)
	 {
	  for (j = 1;j < n + 2;j++)
	  {
		  if (str[i][j] > 0)
		  {
		  if ((str[i][j] >= str[i][j - 1]) && (str[i][j] >= str[i][j + 1]) && (str[i][j] >= str[i - 1][j]) && (str[i][j] >= str[i + 1][j]))
		  {
		  p = i - 1;
		  q = j - 1;
	  System.out.printf("%d %d\n",p,q);
		  }
		  }
	  }
	 }
	}
}

