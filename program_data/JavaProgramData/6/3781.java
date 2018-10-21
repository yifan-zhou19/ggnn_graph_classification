package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int n;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  k = Integer.parseInt(tempVar);
	  }
	  int i;
	  for (i = 0;i < k;i++)
	  {
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
	  char[][] a = new char[100][100];
	  int j;
	  int l;

	  for (j = 0;j < m;j++)
	  {
		 for (l = 0;l < n;l++)
		 {
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   a[j][l] = tempVar4.charAt(0);
		   }
		 }
	  }
	  int sum = 0;
	  if (m == 1)
	  {
		  for (l = 0;l < n;l++)
		  {
	  sum = sum + a[0][l];
		  }
	  }
		 else
		 {
			 for (l = 0;l < n;l++)
			 {
		 sum = sum + a[0][l] + a[m - 1][l];
			 }
		 }
		 if (n == 1)
		 {
			 for (j = 1;j < m - 1;j++)
			 {
		 sum = sum + a[j][0];
			 }
		 }
		 else
		 {
	  for (j = 1;j < m - 1;j++)
	  {
		  sum = sum + a[j][0] + a[j][n - 1];
	  }
		 }
	  System.out.printf("%d\n",sum);
	  }
	}
}

