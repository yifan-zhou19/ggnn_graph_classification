package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int a;
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
	int[] sz = new int[max];
	for (int i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz[i] = Integer.parseInt(tempVar3);
		}
	}
	for (int i = 0;i < n;i++)
	{
		for (int j = 0;j < n;j++)
		{
			if (sz[i] + sz[j] == k && (i != j))
			{
				a = 1;

			}
		}
	}
	switch (a)
	{
		case 1:
			System.out.print("yes");
			break;
		default:
			System.out.print("no");
	}
	return 0;
	}
}

