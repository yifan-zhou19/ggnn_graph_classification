package <missing>;

public class GlobalMembers
{
	 public static void Main()
	 {
	 int[][] a = new int[9][9];
	 int i;
	 int j;
	 int x;
	 int y;
	 int t;
	 int k = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 x = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(",");
	 if (tempVar2 != null)
	 {
		 y = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < x;i++)
	 {
	   for (j = 0;j < y;j++)
	   {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i][j] = Integer.parseInt(tempVar3);
		}
	   }
	 }
	 for (i = 0;i < x;i++)
	 {
		for (j = 0;j < y;j++)
		{
		   for (k = 0;k < y;k++)
		   {
		   if (a[i][k] > a[i][j])
		   {
				break;
		   }
		   }
		   if (k == y)
		   {
			  for (k = 0;k < x;k++)
			  {
			   if (a[k][j] < a[i][j])
			   {
				 break;
			   }
			  }
			  if (k == x)
			  {
				 System.out.printf("%d+%d",i,j);
				 t++;
			  }
		   }
		}
	 }
	 if (t == 0)
	 {
	  System.out.print("No");
	 }
	 }
}

