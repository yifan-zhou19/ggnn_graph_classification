package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int[][] a = new int[1000000][2];
	 int i;
	 int j;
	 int[] sum = new int[1000000];
	 int t;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 a[0][0] = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 a[0][1] = Integer.parseInt(tempVar3);
	 }
	 for (i = 1;a[i - 1][0] != 0 || a[i - 1][1] != 0;i++)
	 {
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   a[i][0] = Integer.parseInt(tempVar4);
	   }
	   String tempVar5 = ConsoleInput.scanfRead(" ");
	   if (tempVar5 != null)
	   {
		   a[i][1] = Integer.parseInt(tempVar5);
	   }
	 }
	 for (j = 0;j < n;j++)
	 {
		 sum[j] = 0;
	  for (i = 0;a[i][0] != 0 || a[i][1] != 0;i++)
	  {
		  if (a[i][0] == j)
		  {
	   break;
		  }
	  else
	  {
	   if (a[i][1] == j)
	   {
		sum[j]++;
	   }
	  }
	  }
		if (sum[j] == n - 1)
		{
			 t = 1;
		  System.out.printf("%d",j);
		 break;
		}
	 }


	 if (t == 0)
	 {
	  System.out.print("NOT FOUND");
	 }

	}

}

