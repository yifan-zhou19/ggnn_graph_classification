package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int[][] a = new int[9][9];
	   int hang;
	   int lie;
	   int i;
	   int j;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   hang = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(",");
	   if (tempVar2 != null)
	   {
		   lie = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i < hang;i++)
	   {
		 for (j = 0;j < lie;j++)
		 {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i][j] = Integer.parseInt(tempVar3);
		  }
		 }
	   }
	   int k = 0;
	   int x;
	   int l;
	   int f = 1;
	for (i = 0;i < hang;i++)
	{
		   for (j = 0;j < lie;j++)
		   {
			   if (a[i][j] > k)
			   {
				   k = a[i][j];
				   x = j;
			   }
		   }
		   int flag = 1;
		   for (l = 0;l < hang;l++)
		   {
			   if (k > a[l][x])
			   {
				   flag = 0;
			   }
		   }
		   if (flag == 1)
		   {
			   System.out.printf("%d+%d",i,x);
			   f = 0;
			   break;
		   }
	}
	if (f != 0)
	{
		System.out.print("No");
	}
	}
}

