package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int[][] a = new int[100][100];
	  int i;
	  int j;
	  int i1;
	  int i2;
	  int j1;
	  int j2;
	  int k1 = 0;
	  int k2 = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
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
				  k1 = 1;
				  break;
			}
		   }
		   if (k1 == 1)
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
				  k2 = 1;
				  break;
			}
		   }
		   if (k2 == 1)
		   {
			   break;
		   }
	  }
	  System.out.printf("%d",((i2 - i1 - 1) * (j2 - j1 - 1)));

	}

}

