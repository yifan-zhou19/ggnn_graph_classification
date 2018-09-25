package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int m;
	  int i;
	  int j;
	  int d;
	  int[][] s = new int[5][5];
	  int[][] t = new int[5][5];
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
		  n = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  m = Integer.parseInt(tempVar3);
	  }
	  if (n >= 0 && n < 5 && m >= 0 && m < 5)
	  {
		for (i = 0;i < 5;i++)
		{
		  for (j = 0;j < 5;j++)
		  {
			if (i == m || i == n)
			{
			  t[i][j] = s[m + n - i][j];
			}
			else
			{
			  t[i][j] = s[i][j];
			}
		  }
		}
		for (i = 0;i < 5;i++)
		{
		  for (j = 0;j < 4;j++)
		  {
			System.out.printf("%d ",t[i][j]);
		  }
		  System.out.printf("%d\n",t[i][4]);
		}
	  }
	  else
	  {
		System.out.print("error");
	  }
	  return 0;
	}


}

