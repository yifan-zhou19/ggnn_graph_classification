package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int x;
		  int y;
		  int i;
		  int[] a = new int[100000];
		  int[] b = new int[100000];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		 while (true)
		 {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  x = Integer.parseInt(tempVar2);
				  }
				  String tempVar3 = ConsoleInput.scanfRead(" ");
				  if (tempVar3 != null)
				  {
					  y = Integer.parseInt(tempVar3);
				  }
				  if (x == 0 && y == 0)
				  {
				  break;
				  }
				  else
				  {
					  a[x] = 1;
					  b[y]++;
				  }
		 }
		  for (i = 0,x = 0;i <= n - 1;i++)
		  {
						   if (a[i] == 0)
						   {
							   x++;
							   y = i;
						   }
		  }
		  if (x == 1 && b[y] == n - 1)
		  {
		  System.out.printf("%d",y);
		  }
		  else
		  {
		  System.out.print("NOT FOUND");
		  }
	}
}

