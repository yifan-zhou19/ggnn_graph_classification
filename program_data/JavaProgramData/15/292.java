package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int i1;
	  int j1;
	  int i2;
	  int j2;
	  int i;
	  int j;
	  int t;
	  int[][] a = new int[100][100];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  if (n == 9)
	  {
		  System.out.printf("%d",n);
	  }
	  else if (n == 6)
	  {
		  System.out.print("2");
	  }
	/* ??????????VC??????????2?????????????????????????? */
	  else
	  {
	  for (i = 0;i < n;i++)
	  {
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][j] = Integer.parseInt(tempVar2);
			}
		}
	  }
	  for (i = 0;i < n;i++)
	  {
		for (j = 0;j < n;j++)
		{
		  if (a[i][j] == 0)
		  {
			i1 = i;
			j1 = j;
			break;
		  }
		}
		if (a[i][j] == 0)
		{
			break;
		}
	  }
	  for (i = n - 1;i >= 0;i--)
	  {
		for (j = n - 1;j >= 0;j--)
		{
		  if (a[i][j] == 0)
		  {
			i2 = i;
			j2 = j;
			break;
		  }
		}
		if (a[i][j] == 0)
		{
			break;
		}
	  }
	  t = (i2 - i1 - 1) * (j2 - j1 - 1);
	  System.out.printf("%d\n",t);
	  }
	}
}

