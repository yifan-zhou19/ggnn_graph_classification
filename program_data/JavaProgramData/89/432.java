package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int[] b = new int[100000];
		int i;
		int j;
		int[] c = new int[100000];
		int k;
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
				  a[i] = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  b[i] = Integer.parseInt(tempVar3);
			  }
		  if (a[i] == 0 && b[i] == 0)
		  {
		  break;
		  }
		   }
		   k = i - 1;
		   for (j = 0;j <= (n - 1);j++)
		   {
			  for (i = 0;i <= k;i++)
			  {
			  if (b[i] == j)
			  {
		   c[j] = c[j] + 1;
			  }
			  }
		   }
			i = 0;
		   for (j = 0;j <= n - 1;j++)
		   {
			  if (c[j] == n - 1)
			  {
			  for (i = 0;i <= k;i++)
			  {
		  if (j == a[i])
		  {
			 break;
		  }
			  }
			  }
		   if (i > k)
		   {
			  System.out.printf("%d",j);

			break;
		   }
		   }
		  if (j == n)
		  {
		  System.out.print("NOT FOUND");
		  }

	}

}

