package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[][] a = new int[50000][2];
	  int[] b = new int[50000];
	  int[] c = new int[50000];
	  int k = 0;
	  int t = 0;
	  for (int i = 0;i < 50000;i++)
	  {
		  b[i] = 0;
		  c[i] = 0;
	  }
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (int i = 0;;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i][0] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  a[i][1] = Integer.parseInt(tempVar3);
		  }
		  if (a[i][0] == a[i][1])
		  {
			  break;
		  }
		  else
		  {
			  k++;
		  }
	  }
	  for (int i = 0;i < k;i++)
	  {
		   for (int j = 0;j < n;j++)
		   {
				   if (a[i][1] == j)
				   {
					   b[j]++;
				   }
				   if (a[i][0] == j)
				   {
					   c[j]++;
				   }
		   }
	  }
	   for (int i = 0;i < n;i++)
	   {
			   if (b[i] == n - 1 && c[i] == 0)
			   {
				   System.out.printf("%d",i);
			   }
			   else
			   {
				   t++;
			   }
	   }
	   if (t == n)
	   {
		   System.out.print("NOT FOUND");
	   }
	}

}

