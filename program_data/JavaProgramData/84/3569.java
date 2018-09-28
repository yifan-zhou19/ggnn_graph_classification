package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int j;
	 int n;
	 int[][] a = new int[100][1];
	 int[] cha = new int[100];
	 int x;
	 int max1;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
	  for (j = 0;j < 1;j++)
	  {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[i][j] = Integer.parseInt(tempVar2);
	   }
	  }
	 }
	 max1 = a[0][0];
	 for (i = 0;i < n;i++)
	 {
	  for (j = 0;j < 1;j++)
	  {
	  if (a[i][j] > max1)
	  {
		  max1 = a[i][j];
	  }
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  for (j = 0;j < 1;j++)
	  {
	  cha[i] = max1 - a[i][j];
	  }
	 }
	  x = cha[0];
	 for (i = 0;i < n;i++)
	 {
	  if (cha[i] < x && cha[i] != 0)
	  {
		  x = cha[i];
	  }
	 }
	 System.out.printf("%d\n%d",max1,max1 - x);
	}
}

