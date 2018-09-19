package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int k = 0;
		int s;
		int n;
		int imin;
		int imax;
		int jmax;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		imin = 100;
		imax = 0;
		jmax = 0;
		for (i = 1;i <= n;i++)
		{
		for (j = 1;j <= n;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i][j] = Integer.parseInt(tempVar2);
		}
		}
		}


		  for (i = 1;i <= n;i++)
		  {
		  for (j = 1;j <= n;j++)
		  {
			  if (a[i][j] == 0)
			  {
				  k++;
			  if (i < imin)
			  {
				  imin = i;
			  }
			  if (i > imax)
			  {
				  imax = i;
			  }
			  if (j > jmax)
			  {
				  jmax = j;
			  }
			  }

		  }
		  }


		  s = (imax - imin + 1) * (jmax - imin + 1);
		  System.out.printf("%d\n",s - k);
		  return 0;
	}
}

