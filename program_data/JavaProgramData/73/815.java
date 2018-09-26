package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
	public static int max(int i,int j)
	{
		int s = 0;
		for (int k = 0;k < 5;k++)
		{
			if (a[i][j] >= a[i][k])
			{
			s++;
			}
		}
		if (s == 5)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int min(int i,int j)
	{
		int s = 0;
		for (int k = 0;k < 5;k++)
		{
			if (a[i][j] <= a[k][j])
			{
			s++;
			}
		}
		if (s == 5)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		  for (int i = 0;i < 5;i++)
		  {
		  for (int j = 0;j < 5;j++)
		  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i][j] = Integer.parseInt(tempVar);
		  }
		  }
		  }
		  int s = 0;
		  int I;
		  int J;
		  for (int i = 0;i < 5;i++)
		  {
		  for (int j = 0;j < 5;j++)
		  {
		  if (max(i, j) == 1 && min(i, j) == 1)
		  {
			  s = a[i][j];
			  I = i;
			  J = j;
		  }
		  }
		  }
		  if (s != 0)
		  {
		  System.out.printf("%d %d %d\n",I + 1,J + 1,s);
		  }
		  else
		  {
			  System.out.print("not found\n");
		  }
	}
}

