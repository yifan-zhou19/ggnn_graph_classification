package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] sz = new int[100][100];
	   int i;
	   int j;
	   int n;
	   int a1 = -1;
	   int a2 = -1;
	   int b1;
	   int b2;
	   int result;
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
				   sz[i][j] = Integer.parseInt(tempVar2);
			   }
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   for (j = 0;j < n;j++)
		   {
			   if (sz[i][j] == 0)
			   {
				  a1 = i;
				  b1 = j;
				  break;
			   }

		   }
		 if (a1 != -1)
		 {
			   break;
		 }
	   }
	   for (i = n - 1;i > -1;i--)
	   {
		   for (j = n - 1;j > -1;j--)
		   {
			   if (sz[i][j] == 0)
			   {
				  a2 = i;
				  b2 = j;
				  break;
			   }
		   }
		if (a2 != -1)
		{
			   break;
		}
	   }
	   result = (a2 - a1 - 1) * (b2 - b1 - 1);
	   System.out.printf("%d",result);
	   return 0;


	}
}

