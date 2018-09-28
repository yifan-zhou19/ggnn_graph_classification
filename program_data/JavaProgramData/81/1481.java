package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int zhh = new int(int n,int m);
	 int[][] a = new int[5][5];
	 int i;
	 int j;
	 int m;
	 int n;
	 int c;
	 for (i = 0;i <= 4;i++)
	 {
	  for (j = 0;j <= 4;j++)
	  {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a[i][j] = Integer.parseInt(tempVar);
	   }
	  }
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 m = Integer.parseInt(tempVar3);
	 }
	 if (zhh(n, m) == 0)
	 {
	  System.out.print("error");
	 }
	 else
	 {
		 for (i = 0;i <= 4;i++)
		 {
	   if (i == m)
	   {
		   i = n;
	   }
	  else if (i == n)
	  {
		  i = m;
	  }
	  for (j = 0;j <= 4;j++)
	  {
		  if (j < 4)
		  {
	  System.out.printf("%d ",a[i][j]);
		  }
		  else
		  {
			  System.out.printf("%d",a[i][j]);
		  }
	  if (j == 4)
	  {
		  System.out.print("\n");
	  }
	  }
	  if (i == n)
	  {
		  i = m;
	  }
	  else if (i == m)
	  {
		  i = n;
	  }
		 }
	 }
	}


	public static int zhh(int n,int m)
	{
	 if (n > 4 || m > 4)
	 {
	  return (0);
	 }
	 else
	 {
	  return (1);
	 }
	}

}

