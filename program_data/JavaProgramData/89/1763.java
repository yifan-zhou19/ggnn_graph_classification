package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int w;
		  int x;
		  int y;
		  int v;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  v = n * n;
		  int[] a = new int[100000];
		  int[] b = new int[100000];
		  for (i = 0;i < 100000;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  b[i] = Integer.parseInt(tempVar3);
			  }
			  if (a[i] == 0 && b[i] == 0)
			  {
						 w = i + 1;
						 break;
			  }
		  }
		  for (j = 0;j < n;j++)
		  {
			  x = 0;
			  y = 0;
			  for (i = 0;i < w;i++)
			  {
						if (a[i] == j)
						{
						x++;
						}
						if (b[i] == j)
						{
						y++;
						}
			  }
			  if (j == 0)
			  {
					  if (x == 1 && y == n)
					  {
								   System.out.printf("%d",j);
								   break;
					  }

			  }
			  else
			  {
				  if (x == 0 && y == n - 1)
				  {
					  System.out.printf("%d",j);
					  break;
				  }
			  }
		  }
		  if (j == n)
		  {
		  System.out.print("NOT FOUND");
		  }
		  System.in.read();
		  System.in.read();
	}

}

