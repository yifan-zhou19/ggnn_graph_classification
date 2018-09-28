package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int j;
		 int t;
		 int minL;
		 int maxR;
		 int m;

		 maxR = 0;
		 m = 0;
		 int[][] a = new int[10000][2];
		 int[] c = new int[10000];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < n;i++)
		 {
			  for (j = 0;j < 2;j++)
			  {
				   String tempVar2 = ConsoleInput.scanfRead();
				   if (tempVar2 != null)
				   {
					   a[i][j] = Integer.parseInt(tempVar2);
				   }
			  }
		 }
		 minL = a[0][0];
		 for (i = 0;i < 10000;i++)
		 {
		 c[i] = 0;
		 }
		 for (i = 0;i < n;i++)
		 {
			  if (minL > a[i][0])
			  {
				 minL = a[i][0];
			  }
			  if (maxR < a[i][1])
			  {
				 maxR = a[i][1];
			  }
			  for (t = a[i][0];t <= a[i][1] - 1;t++)
			  {
			  c[t] = 1;
			  }
		 }
		 for (t = minL;t <= maxR - 1;t++)
		 {
			  if (c[t] == 0)
			  {
				 System.out.print("no");
				 m = 1;
				 break;
			  }
		 }
		 if (m == 0)
		 {
			System.out.printf("%d %d",minL,maxR);
		 }
		 return 0;
	}

}

