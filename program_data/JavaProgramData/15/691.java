package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int n;
	   int[][] a = new int[1000][1000];
	   int x1 = 0;
	   int y1 = 0;
	   int x2 = 0;
	   int y2 = 0;
	   int area;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
		  for (j = 0;j < n;j++)
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
		  for (j = 0;j < n;j++)
		  {
			 if (a[i][j] == 0)
			 {
				x1 = i + 1;
				y1 = j + 1;
				break;
			 }
		  }
		  if (x1 != 0 || y1 != 0)
		  {
			  break;
		  }
	   }
	   for (i = n - 1;i >= 0;i--)
	   {
		  for (j = n - 1;j >= 0;j--)
		  {
			 if (a[i][j] == 0)
			 {
				x2 = i - 1;
				y2 = j - 1;
				break;
			 }
		  }
		  if (x2 != 0 || y2 != 0)
		  {
			  break;
		  }
	   }
	   area = (x2 - x1 + 1) * (y2 - y1 + 1);
	   System.out.printf("%d\n",area);
	  return 0;
	}

}

