package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int[][] a = new int[100][100];
	   int i;
	   int j;
	   int n;
	   int t1;
	   int t2;
	   int m1;
	   int m2;
	   int s;
	   int num;
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
			   if (a[i][j] == 0 && a[i][j - 1] == 255 && a[i - 1][j] == 255 && a[i][j + 1] == 0)
			   {
				   t1 = i,m1 = j;
			   }
			   if (a[i][j] == 0 && a[i][j - 1] == 0 && a[i][j + 1] == 255 && a[i + 1][j] == 255)
			   {
				   t2 = i,m2 = j;
			   }
		   }
		}

		 s = (t2 - t1 + 1) * (m2 - m1 + 1);
	   num = s - 2 * (t2 + m2 - t1 - m1);
	   System.out.printf("%d",num);
	}
}

