package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int n;
		  int m = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[][] a = new int[2][n];
		  for (i = 0;i < n;i++)
		  {
			  a[0][i] = 0;
			  a[1][i] = 0;
		  }
		  for (;;)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  i = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  j = Integer.parseInt(tempVar3);
		  }
		  if (i == 0 && j == 0)
		  {
			  break;
		  }
		  else
		  {
		  a[0][i]++;
		  }
		  a[1][j]++;
		  }
		  for (i = 0;i < n;i++)
		  {
		  if (a[0][i] == 0 && a[1][i] == (n - 1))
		  {
		  System.out.printf("%d",i);
		  m++;
		  }
		  }
		  if (m == 0)
		  {
			  System.out.print("NOT FOUND");
		  }
	}

}

