package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int p;
	 int q;
	 int t;
	 int[][] a = new int[100000][3];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
		 for (j = 0;j < 3;j++)
		 {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[i][j] = Integer.parseInt(tempVar2);
	   }
		 }
	   a[i][1] = a[i][1] + a[i][2];
	 }
	 for (p = 0;p < 3;p++)
	 {
	  for (q = n - 2;q >= 0;q--)
	  {
	   if (a[q][1] < a[q + 1][1])
	   {
		for (i = 0;i < 2;i++)
		{
		t = a[q][i];
		a[q][i] = a[q + 1][i];
		a[q + 1][i] = t;
		}
	   }
	  }
	 }
		  for (i = 0;i < 3;i++)
		  {
	  System.out.printf("%d %d\n",a[i][0],a[i][1]);
		  }
	 return 0;
	}

}

