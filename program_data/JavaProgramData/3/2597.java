package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int[] sz = new int[1000];
	int a;
	int b;
	int c = 0;
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
	for (int i = 0;i < n;i++)
	{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
	}
	for (int p = 0;p < n;p++)
	{
			for (int i = 1;i <= n;i++)
			{
					a = sz[p];
					b = sz[i];
					if (a + b == k)
					{
						c += 1;
					}
			}
	}
	if (c == 0)
	{
		System.out.print("no");
	}
	else
	{
		System.out.print("yes");
	}
	return 0;
	}

}

