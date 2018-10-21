package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int k;
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
	int[] sz = new int[1000];
	for (i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz[i] = Integer.parseInt(tempVar3);
		}
	}
	int j;
	for (i = 0;i < n;i++)
	{

		for (j = 0;j < n;j++)
		{
			if ((sz[i] + sz[j]) == k)
			{
			System.out.print("yes");

		break;
			}


		}

			if ((sz[i] + sz[j]) == k)
			{
			break;
			}

	}

	int a = i;
	int b = j;
	if ((a == n) && (b == n) && (sz[n - 1] + sz[n - 1] != k))
	{
	System.out.print("no");
	}


		return 0;
	}

}

