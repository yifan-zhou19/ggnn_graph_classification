package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int n;
		int k;
		int i;
	i = 0;
		int[] sz = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (a = 0;a < n;a++)
		{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  (sz[a]) = Integer.parseInt(tempVar3);
		  }
		}
		for (a = 0;a < n;a++)
		{
		  for (b = n - 1;b > a;b--)
		  {
			c = sz[a] + sz[b];
			if (c == k)
			{
			i = n * n * n;
			break;
			}
			else
			{
			 i++;
			}
		  }
		  if (i == n * (n - 1) / 2)
		  {
			System.out.print("no");
			break;
		  }
		 else if (i == n * n * n)
		 {
			 System.out.print("yes");
			 break;
		 }
		}
	return 0;
	}
}

