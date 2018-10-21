package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[][] a = new int[10][10];
	  int m;
	  int n;
	  int i;
	  int j;
	  int max;
	  int p;
	  int is;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(",");
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  for (i = 0;i < m;i++)
	  {
	  for (j = 0;j < n;j++)
	  {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  a[i][j] = Integer.parseInt(tempVar3);
	  }
	  }
	  }
	  for (i = 0;i < m;i++)
	  {
		max = a[i][0];
		p = 0;
		for (j = 1;j < n;j++)
		{
		if (max < a[i][j])
		{
			max = a[i][j];
			p = j;
		}
		}
		is = 1;
		for (j = 0;j < m;j++)
		{
			if (a[j][p] < a[i][p])
			{
			is = 0;
			break;
			}
		}
		if (is != 0)
		{
			System.out.printf("%d+%d\n",i,p);
			return 0;
		}
	  }
	  System.out.print("No\n");
	  return 0;
	}

}

