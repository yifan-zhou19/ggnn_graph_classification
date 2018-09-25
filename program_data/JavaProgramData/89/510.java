package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int[][] p = new int[100000][2];
	   int i;
	   int j;
	   int h;
	   int a = 0;
	   int b = 0;
	   int c = 0;
	   for (i = 0;;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   p[i][0] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   p[i][1] = Integer.parseInt(tempVar3);
		   }
		  if (p[i][0] == 0 && p[i][1] == 0)
		  {
		  break;
		  }
	   }
	   for (j = 0;j < n;j++)
	   {
		   a = 0;
		   b = 0;
		  for (h = 0;h < i;h++)
		  {
		  if (p[h][0] == j)
		  {
		  a = 1;
		  break;
		  }
		  }
		  if (a == 0)
		  {
		   for (h = 0;h < i;h++)
		   {
			if (p[h][1] == j)
			{
				b = b + 1;
			}
		   }
		   if (b == n - 1)
		   {
			   System.out.printf("%d\n",j);
			   c = c + 1;
		   }
		  }
		  else
		  {
			  continue;
		  }
	   }
	   if (c == 0)
	   {
		   System.out.print("NOT FOUND");
	   }
	}

}

