package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int n;
	  int i;
	  int p;
	  int q;
	  int[][] a = new int[11][11];
	  int[][] b = new int[11][11];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  a[5][5] = m;
	  for (i = 0;i < n;i++)
	  {
		for (p = 0;p < 11;p++)
		{
		  for (q = 0;q < 11;q++)
		  {
			b[p][q] = a[p][q];
		  }
		}
		for (p = 1;p < 10;p++)
		{
		  for (q = 1;q < 10;q++)
		  {
			a[p][q] = 2 * b[p][q] + b[p - 1][q] + b[p - 1][q - 1] + b[p][q - 1] + b[p + 1][q] + b[p][q + 1] + b[p + 1][q + 1] + b[p + 1][q - 1] + b[p - 1][q + 1];
		  }
		}
	  }
	  for (p = 1;p < 10;p++)
	  {
		for (q = 1;q < 10;q++)
		{
		  if (q < 9)
		  {
			System.out.printf("%d ",a[p][q]);
		  }
		  if (q == 9)
		  {
			System.out.printf("%d\n",a[p][q]);
		  }
		}
	  }
	}

}

