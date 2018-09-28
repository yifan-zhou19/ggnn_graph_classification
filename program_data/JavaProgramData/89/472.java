package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int[][] a = new int[100000][2];
	 int i;
	 int j;
	 int q;
	 int[] b = new int[100000];
	 int[] c = new int[100000];
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

	 for (i = 1;a[i - 1][0] + a[i - 1][1] != 0;i++)
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
	 q = i - 1;

	 for (j = 0;j < n;j++)
	 {
	  for (i = 0;i < q;i++)
	  {
	   if (j == a[i][1])
	   {
	   b[j]++;
	   }
	  }
	 }

	 for (j = 0;j < n;j++)
	 {
	  for (i = 0;i < q;i++)
	  {
	   if (j == a[i][0])
	   {
		c[j]++;
		break;
	   }
	  }
	 }
	 for (j = 0;j < n;j++)
	 {
	  if (b[j] == n - 1 && c[j] == 0)
	  {
	  System.out.printf("%d",j);
	  }
	 }
	 System.in.read();
	 System.in.read();
	 return 0;
	}

}

