package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[n + 1];
		  for (int i = 0;i <= n - 1;i++)
		  {
				  a[i] = 0;
		  }
		  int x = 1;
		  int y = 1;
		  while (x != 0 || y != 0)
		  {
						   String tempVar2 = ConsoleInput.scanfRead();
						   if (tempVar2 != null)
						   {
							   x = Integer.parseInt(tempVar2);
						   }
						   String tempVar3 = ConsoleInput.scanfRead(" ");
						   if (tempVar3 != null)
						   {
							   y = Integer.parseInt(tempVar3);
						   }
						   a[x]--;
						   a[y]++;
		  }
		  for (int i = 0;i <= n - 1;i++)
		  {
				  if (a[i] == n - 1)
				  {
				  System.out.printf("%d",i);
				  }
		  }
	}

}

