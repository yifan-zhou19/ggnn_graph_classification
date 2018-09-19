package <missing>;

public class GlobalMembers
{
	public static int[][] e = new int[1000][1000];
	public static int Main()
	{
	   int i;
	   int j;
	   int n;
	   int a;
	   int b;
	   int c = 0;
	   int d = 0;
	   int t;
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
				   e[i][j] = Integer.parseInt(tempVar2);
			   }
		   }
	   }
		   for (i = 0;i < n;i++)
		   {
			   for (j = 0;j < n;j++)
			   {
				   if (e[i][j] == 0)
				   {
					   a = i;
					   b = j;
				   }
			   }
		   }
		   for (j = b;j >= 0;j--)
		   {
			   if (e[a][j] == 0)
			   {
				   c++;
			   }
			   else
			   {
			   break;
			   }
		   }
		   for (i = a;i >= 0;i--)
		   {
			   if (e[i][b] == 0)
			   {
				   d++;
			   }
			   else
			   {
			   break;
			   }
		   }
		t = (c - 2) * (d - 2);
		   System.out.printf("%d",t);
		return 0;
	}


}

