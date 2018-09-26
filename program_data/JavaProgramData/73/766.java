package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] a = new int[5][5];
	   int i;
	   int j;
	   int k;
	   int s;
	   int h;
	   for (i = 0;i < 5;i++)
	   {
		   for (j = 0;j < 5;j++)
		   {
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   a[i][j] = Integer.parseInt(tempVar);
			   }
		   }
	   }
	   for (i = 0;i < 5;i++)
	   {
		   for (j = 0;j < 5;j++)
		   {
			   for (k = 0;k < 5;k++)
			   {
				   if (a[i][j] < a[i][k])
				   {
				   break;
				   }
			   }
			   if (k == 5)
			   {
				   for (s = 0;s < 5;s++)
				   {
					   if (a[i][j] > a[s][j])
					   {
					   break;
					   }
				   }
				   if (s == 5)
				   {
					   System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
					   h = 1;
				   }
			   }
		   }
	   }
	   if (h != 1)
	   {
	   System.out.print("not found");
	   }
	   System.in.read();
	   System.in.read();
		return 0;
	}

}

