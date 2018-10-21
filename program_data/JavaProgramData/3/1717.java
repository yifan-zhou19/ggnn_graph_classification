package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int k;
		  int a;
		  int b;
		  int c;
		  c = 0;
		  int[] sz = new int[1000];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  k = Integer.parseInt(tempVar2);
		  }
		  for (a = 0;a < n;a++)
		  {
					  String tempVar3 = ConsoleInput.scanfRead();
					  if (tempVar3 != null)
					  {
						  sz[a] = Integer.parseInt(tempVar3);
					  }
		  }
		  for (a = 0;a < (n - 1);a++)
		  {
					 for (b = (a + 1);b < n;b++)
					 {
						  if (sz[a] + sz[b] == k)
						  {
								   System.out.print("yes");
								   return 0;
						  }
						  if (sz[a] + sz[b] != k)
						  {
								   c++;
						  }
					 }
		  }
		   if (c == n * (n - 1) / 2)
		   {
					 System.out.print("no");
					 return 0;
		   }
	}

}

