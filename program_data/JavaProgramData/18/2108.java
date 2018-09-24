package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int k;
	  for (k = 0;k < n;k++)
	  {
	  int i;
	  int j;
	  int l;
	  int[][] a = new int[100][100];
	  int[] s = new int[100];

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

	  for (l = 0;l < n - 1;l++)
	  {
		  int[] minh = new int[100];
	  for (i = 0;i < n;i++)
	  {

		  if (a[i][0] >= 0)
		  {
		  minh[i] = a[i][0];
		for (j = 0;j < n;j++)
		{
		  if (a[i][j] < minh[i] && a[i][j] >= 0)
		  {
			  minh[i] = a[i][j];
		  }
		}
		for (j = 0;j < n;j++)
		{
		  a[i][j] = a[i][j] - minh[i];
		}
		  }
	  }
	  int[] minl = new int[100];
	  for (i = 0;i < n;i++)
	  {
		  if (a[0][i] >= 0)

		  {
			  minl[i] = a[0][i];
	   for (j = 0;j < n;j++)
	   {
		  if (a[j][i] < minl[i] && a[i][j] >= 0)
		  {
			  minl[i] = a[j][i];
		  }
	   }
		for (j = 0;j < n;j++)
		{
		  a[j][i] = a[j][i] - minl[i];
		}
		  }
	  }
	  s[l] = a[l + 1][l + 1];

	  for (i = 0;i < n;i++)
	  {
		  a[l + 1][i] = -1;
		a[i][l + 1] = -1;
	  }
	  }
	  int sum = 0;
	  for (i = 0;i < n - 1;i++)
	  {
		sum = sum + s[i];
	  }
	  System.out.printf("%d\n",sum);
	  }
	}
}

