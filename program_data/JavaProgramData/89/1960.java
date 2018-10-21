package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int n;
		  int[][] a = new int[2][10000];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
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
		  while (i != 0 || j != 0)
		  {
			  a[0][i]++;
			  a[1][j]++;
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  i = Integer.parseInt(tempVar4);
			  }
			  String tempVar5 = ConsoleInput.scanfRead(" ");
			  if (tempVar5 != null)
			  {
				  j = Integer.parseInt(tempVar5);
			  }
		  }
		  for (i = 0;i < n;i++)
		  {
			  if (a[0][i] == 0 && a[1][i] == n - 1)
			  {
				  System.out.printf("%d",i);
				  break;
			  }
		  }
		  if (i == n)
		  {
			  System.out.print("NOT FOUND");
		  }
	}

}

