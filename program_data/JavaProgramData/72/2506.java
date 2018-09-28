package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int n;
	 int i;
	 int k = 0;
	 int j;
	 int[][] a = new int[20][20];
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
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	// struct sh
	// {
	//  int m;
	//  int n;
	// }
	// sh[400];
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
	 if (a[0][0] >= a[0][1] != 0 && a[0][0] >= a[1][0])
	 {
	  sh[k].m = 0;
	  sh[k].n = 0;
	  k++;
	 }
	 if (a[0][n - 1] >= a[0][n - 2] != 0 && a[0][n - 1] >= a[1][n - 1])
	 {
	  sh[k].m = 0;
	  sh[k].n = n - 1;
	  k++;
	 }
	 if (a[m - 1][0] >= a[m - 2][0] != 0 && a[m - 1][0] >= a[m - 1][1])
	 {
	  sh[k].m = m - 1;
	  sh[k].n = 0;
	  k++;
	 }
	 if (a[m - 1][n - 1] >= a[m - 2][n - 1] != 0 && a[m - 1][n - 1] >= a[m - 1][n - 2])
	 {
	  sh[k].m = m - 1;
	  sh[k].n = n - 1;
	  k++;
	 }


	 for (i = 0;i < m;i++)
	 {
	  for (j = 0;j < n;j++)
	  {
	   if (i == 0 && j != 0 && j != n - 1)
	   {
		if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1])
		{
		 sh[k].m = i;
		 sh[k].n = j;
		 k++;
		}
	   }
		else if (j == 0 && i != 0 && i != m - 1)
		{
		 if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j])
		 {
		 sh[k].m = i;
		 sh[k].n = j;
		 k++;
		 }
		}
		 else if (j == n - 1 && i != 0 && i != m - 1)
		 {
		  if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1])
		  {
		 sh[k].m = i;
		 sh[k].n = j;
		 k++;
		  }
		 }
		 else if (i == m - 1 && j != 0 && j != n - 1)
		 {
		  if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1])
		  {
		 sh[k].m = i;
		 sh[k].n = j;
		 k++;
		  }
		 }
		 else if (i != 0 && i != m - 1 && j != 0 && j != n - 1)
		 {
			 if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j])
			 {
		 sh[k].m = i;
		 sh[k].n = j;
		 k++;
			 }
		 }

	  }
	 }
	  int e;
	  int f;
	  for (j = 1;j <= k;j++)
	  {
	   for (i = 0;i < k - j;i++)
	   {
		if (sh[i].m > sh[i + 1].m)
		{
		 e = sh[i + 1].m;
		 f = sh[i + 1].n;
		 sh[i + 1].m = sh[i].m;
		 sh[i + 1].n = sh[i].n;
		 sh[i].m = e;
		 sh[i].n = f;
		}
	   }
	  }
	  int c = 0;
	  i = 0;
	  for (;c < k;c = i + 1)
	  {
	  for (j = 1;j <= k;j++)
	  {
		  for (i = c;i < k;i++)
		  {
	   if (sh[i].m == sh[i + 1].m)
	   {
		   if (sh[i].n > sh[i + 1].n)
		   {

				f = sh[i + 1].n;

				sh[i + 1].n = sh[i].n;

				sh[i].n = f;
		   }
		   else
		   {
			   continue;
		   }
	   }
	   else
	   {
			break;
	   }
		  }
	  }
	  }

	  for (i = 0;i < k;i++)
	  {
		  System.out.printf("%d %d\n",sh[i].m,sh[i].n);
	  }
	  return 0;
	}


}

