package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int r;
	int n;
	int k;
	int[] sz = new int[1000];
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
	for (int i = 1;i <= n;i++)
	{
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   sz[i] = Integer.parseInt(tempVar3);
	   }
	}
	for (r = 1;r < n;r++)
	{
	 for (a = r + 1;a <= n;a++)
	 {
		if (sz[a] + sz[r] == k)
		{
		System.out.print("yes");
		break;
		}
	 }
	   if (a <= n)
	   {
	   break;
	   }
	}
		if (r >= n)
		{
		System.out.print("no");
		}
	return 0;
	}


}

