package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] s = new int[1000][1000];
	   int n;
	   int i;
	   int j;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int a = 0;
	   int b = 0;
	   int c = 0;
	   int d = 0;
	   int m;
	   for (i = 0;i < n;i++)
	   {
		   for (j = 0;j < n;j++)
		   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   s[i][j] = Integer.parseInt(tempVar2);
			   }
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   for (j = 0;j < n;j++)
		   {
			   if (s[i][j] == 0)
			   {
				   a = i;
				   b = j;
				   break;
			   }

		   }
		   if (a != 0 && b != 0)
		   {
			   break;
		   }

	   }
	   for (i = n - 1;i >= 0;i--)
	   {
		   for (j = n - 1;j >= 0;j--)
		   {
			   if (s[i][j] == 0)
			   {
				   c = i;
				   d = j;
				   break;
			   }

		   }
		   if (c != 0 && d != 0)
		   {
			   break;
		   }


	   }
	   m = (d - b - 1) * (c - a - 1);
	   System.out.printf("%d",m);
	   return 0;
	}





}

