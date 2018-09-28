package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] a = new int[1000];
		int[] b = new int[10000];
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
		for (i = 1;i <= n;i++)
		{
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   a[i] = Integer.parseInt(tempVar3);
			   }
			b[a[i]] = 1;
		}
		for (i = 1;i <= n;i++)
		{
		   if (b[k - a[i]] == 1 && k - a[i] > 0)
		   {
		   System.out.print("yes");
		   return 0;
		   }
		}
		System.out.print("no");
		return 0;
	}
}

