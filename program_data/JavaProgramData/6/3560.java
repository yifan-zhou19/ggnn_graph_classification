package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int s;
	 int y;
	 int i;
	 int j;
	 int k;
	 int n;
	 int m;
	 int t;
	 int q;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 t = Integer.parseInt(tempVar);
	 }

	 //printf("%d\n",t); 
	 for (q = 0;q < t;q++)
	 {
		 s = 0;
	 y = 0;
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 m = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 n = Integer.parseInt(tempVar3);
	 }
	 int[][] a = new int[m][n];
		for (i = 0;i < m;i++)
		{
		for (j = 0;j < n;j++)
		{
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 a[i][j] = Integer.parseInt(tempVar4);
		 }
		}
		}
	  for (i = 0;i < n;i++)
	  {
	   s = a[0][i] + a[m - 1][i] + s; //printf("%d\n",s);
	  }
	  for (i = 1;i < m - 1;i++)
	  {
	   y = a[i][0] + a[i][n - 1] + y; //printf("%d\n",y);
	  }
	  //k=s+y;
	   System.out.printf("%d\n",(s + y));
	 }
	 System.in.read();
	 System.in.read();
	 System.in.read();
	   System.in.read();
	 System.in.read();
	 System.in.read();
	}
}

