package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[8][8];
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
	   int i;
	   int j;
		int w = 0;
		int[] l1 = new int[8];
		int[] l2 = new int[8];
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
		   int max = 0;
		   for (j = 0;j < n;j++)
		   {
			   if (max < a[i][j])
			   {
				   max = a[i][j];
				   l1[i] = j;
			   }
		   }
	   }
	   for (j = 0;j < n;j++)
	   {
		   int min = 100000;
		  for (i = 0;i < m;i++)
		  {
			  if (min > a[i][j])
			  {
				  min = a[i][j];
				   l2[j] = i;
			  }
		  }
		  if (l1[l2[j]] == j)
		  {
			  System.out.printf("%d+%d", l2[j], j);
			  return 0;
		  }
	   }
	   System.out.print("No");
	   return 0;
	}

}

