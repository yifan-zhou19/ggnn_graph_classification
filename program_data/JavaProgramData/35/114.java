package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int[][] a = new int[300][300];
	  int i;
	  int j;
	  int m;
	  int n;
	  int max;
	  int maxi = 0;
	  int maxj = 0;
	  int l = 1;
	  int s = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(",");
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
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
	  for (i = 0;i < m;i++)
	  {
		  max = a[i][0];
		 for (j = 0;j < n;j++)
		 {
		  if (max < a[i][j])
		  {
				max = a[i][j];
			 maxi = i;
			 maxj = j;
		  }
		 }
		 for (i = 0;i < m;i++)
		 {
		  if (max > a[i][maxj])
		  {
			 l = 0;
		  }
		 }
		 if (l == 1)
		 {
			 System.out.printf("%d+%d",maxi,maxj);
			 s++;
		 }
	  }
	   if (s == 0)
	   {
		   System.out.print("No");
	   }
	}
}

