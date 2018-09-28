package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int x = 0;
		  int y = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[][] a =
		  {
			  {10, 0}
		  };
		  for (j = 0;j < n;j++)
		  {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a[j][0] = Integer.parseInt(tempVar2);
			   }
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   a[j][1] = Integer.parseInt(tempVar3);
			   }
		  }
		  for (i = 0;i < n;i++)
		  {
			   if (a[i][0] == 0 && a[i][1] == 1)
			   {
				   x++;
			   }
			   if (a[i][0] == 1 && a[i][1] == 0)
			   {
				   y++;
			   }
			   if (a[i][0] == 0 && a[i][1] == 2)
			   {
				   y++;
			   }
			   if (a[i][0] == 2 && a[i][1] == 0)
			   {
				   x++;
			   }
			   if (a[i][0] == 1 && a[i][1] == 2)
			   {
				   x++;
			   }
			   if (a[i][0] == 2 && a[i][1] == 1)
			   {
				   y++;
			   }
			   if (a[i][0] == a[i][1] && a[i][0] < 10)
			   {
				   ;
			   }
		  }
		  if (x > y)
		  {
		  System.out.print("A");
		  }
		  if (x == y)
		  {
		   System.out.print("Tie");
		  }
		  if (x < y)
		  {
		   System.out.print("B");
		  }
		  System.out.print("\n");
	}
}

