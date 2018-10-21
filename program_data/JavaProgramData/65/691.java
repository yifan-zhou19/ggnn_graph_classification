package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int s;
	  int[][] a = new int[200][3];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 (a[i][0]) = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 (a[i][1]) = Integer.parseInt(tempVar3);
		 }
	  }
	  j = 0;
	  s = 0;
	  for (i = 0;i < n;i++)
	  {
		  if ((a[i][0] == 0 && a[i][1] == 1) || (a[i][0] == 1 && a[i][1] == 2) || (a[i][0] == 2 && a[i][1] == 0))
		  {
			   j++;
		  }

		  if ((a[i][1] == 0 && a[i][0] == 1) || (a[i][1] == 1 && a[i][0] == 2) || (a[i][1] == 2 && a[i][0] == 0))
		  {
			   s++;
		  }
	  }
	  if (j < s)
	  {
		  System.out.print("B");
	  }
	  if (j > s)
	  {
		  System.out.print("A");
	  }
	  if (j == s)
	  {
		  System.out.print("Tie");
	  }
	  return 0;
	}

}

