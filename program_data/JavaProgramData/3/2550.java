package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static int m = 0;
	public static int i = 0;
	public static int t = 0;
	public static int w = 0;
	public static int e = 10000;
	public static int q = 0;
	public static int r = 0;
	public static int k = 0;
	public static int p = 0;
	public static int[] a = new int[10000];
	public static int[] b = new int[10000];
	public static int[] c = new int[10000];
	public static int[] d = new int[10000];
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			//printf("%d\n",a[i]);
		}
		for (i = 0;i < n;i++)
		{
			for (k = i;k < n;k++)
			{
				if (a[i] + a[k] == p)
				{
								 q = 1;
				}
			}
		}

	if (q == 1)
	{
	System.out.print("yes");
	}
	else
	{
	System.out.print("no");
	}

	return 0;

	}
}

