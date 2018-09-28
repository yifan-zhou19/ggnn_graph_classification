package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	 int i;
	 int j;
	 int m;
	 int n;
	 int[][] a = new int[6][6];
	 int t;
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
	 if (m >= 0 && m < 5 && n >= 0 && n < 5)
	 {
		   for (i = 0;i < 5;i++)
		   {
			t = a[m][i];
		 a[m][i] = a[n][i];
		 a[n][i] = t;
		   }
		for (i = 0;i < 5;i++)
		{
			System.out.printf("%d",a[i][0]);
		 for (j = 1;j < 5;j++)
		 {
		  System.out.printf(" %d",a[i][j]);
		 }
		 System.out.print("\n");
		}
	 }
	  else
	  {
		System.out.print("error\n");
	  }
	}
}

