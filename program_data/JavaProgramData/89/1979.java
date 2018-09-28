package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[][] a = new int[100000][2];
	int i;
	int m;
	int t = 0;
	int j;
	int k = 0;
	int[] c = new int[1000];
	int[] d = new int[100000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;;i++)
	{
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 a[i][0] = Integer.parseInt(tempVar2);
				 }
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 a[i][1] = Integer.parseInt(tempVar3);
				 }
				 if (a[i][0] == 0 && a[i][1] == 0)
				 {
				 break;
				 }
	}
	 m = i - 1;
	 for (i = 0;i < n;i++)
	 {
	   for (j = 0;j <= m;j++)
	   {
		 if (i == a[j][0])
		 {
		 break;
		 }
		 else if (j == m)
		 {
			 t++;
		 c[t] = i;
		 }
	   }
	 }
	if (t == 1)
	{
	 for (j = 0;j <= m;j++)
	 {
	  if (c[1] == a[j][1])
	  {
		  d[k] = a[j][0];
	  k++;
	  }
	 }
	 t = 0;
	 for (i = 0;i < n;i++)
	 {
	   for (j = 0;j < k;j++)
	   {
		 if (i == d[j])
		 {
		 break;
		 }
		 else if (j == k - 1)
		 {
			 t++;
		 }
	   }
	 }
	 if (t == 1)
	 {
	 System.out.printf("%d",c[1]);
	 }
	 else
	 {
		 System.out.print("NOT FOUND");
	 }
	}
	else
	{
		System.out.print("N0T FOUND");
	}
	}

}

