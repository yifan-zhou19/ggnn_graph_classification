package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int r;
	int c;
	int[][] a = new int[8][8];
	int i;
	int j;
	int y;
	int t;
	int s;
	int max;
	int min;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		r = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		c = Integer.parseInt(tempVar2);
	}
	y = 0;
	for (i = 0;i < r;i++)
	{
	  for (j = 0;j < c;j++)
	  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i][j] = Integer.parseInt(tempVar3);
		  }
	  }
	}

	for (i = 0;i < r;i++)
	{
		max = 0;
	  for (s = 0;s < c;s++)
	  {
		if (a[i][s] > a[i][max])
		{
		  max = s;
		}
	  }
	  min = i;
	  for (t = 0;t < r;t++)
	  {

		if (a[t][max] < a[i][max])
		{
			min = t;
		}

	  }
	  if (min == i)
	  {
		  y = 1;
		  System.out.printf("%d+%d",i,max);
		  break;
	  }

	}
	if (y == 0)
	{
		System.out.print("No");
	}
	return 0;
	}
}

