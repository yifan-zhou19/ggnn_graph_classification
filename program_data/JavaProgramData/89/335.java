package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[5000000];
	public static int[] b = new int[5000000];
	public static int n = 0;
	public static int l = 0;
	public static int r = 0;
	public static int Main()
	{
		//freopen("zozo.in","r",stdin);
		//freopen("zozo.out","w",stdout);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1; i <= n; i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			r = Integer.parseInt(tempVar3);
		}
		while (!(l == 0 && r == 0))
		{
		  l++;
		  r++;
		  b[r]++;
		  a[l] = 1;
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  l = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead();
		  if (tempVar5 != null)
		  {
			  r = Integer.parseInt(tempVar5);
		  }
		}
		int flag = 0;
		for (int i = 1; i <= n; i++)
		{
			if (a[i] == 0 && b[i] == n - 1)
			{
			  flag = 1;
			  System.out.printf("%d\n",i - 1);
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND\n");
		}
		return 0;
	}

}

