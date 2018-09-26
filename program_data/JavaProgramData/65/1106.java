package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int[][] a = new int[300][2];
	  int countA = 0;
	  int countB = 0;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		  for (j = 0;j < 2;j++)
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
		  if ((a[i][0] == 0 && a[i][1] == 1) || (a[i][0] == 1 && a[i][1] == 2) || (a[i][0] == 2 && a[i][1] == 0))
		  {
			  countA = countA + 1;
		  }
		  else if ((a[i][0] == 0 && a[i][1] == 0) || (a[i][0] == 1 && a[i][1] == 1) || (a[i][0] == 2 && a[i][1] == 2))
		  {
			  countA = countA + 1;
			  countB = countB + 1;
		  }
		  else
		  {
			  countB = countB + 1;
		  }
	  }

	  if (countA > countB)
	  {
		  System.out.print("A");
	  }
	  else if (countB > countA)
	  {
		  System.out.print("B");
	  }
	  else
	  {
		  System.out.print("Tie");
	  }





		return 0;
	}

}

