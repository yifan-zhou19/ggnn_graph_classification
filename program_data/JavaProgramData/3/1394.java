package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	int k;
	int a;
	int b;
	int c = 0;
	int[] sz1 = new int[1000];
	int[] sz2 = new int[1000];

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
				a = Integer.parseInt(tempVar3);
			}
			sz1[i] = a;
			sz2[i] = a;
		}

		for (i = 1;i <= n;i++)
		{
			b = sz1[i];
			for (j = 1;j <= n;j++)
			{
				if (j != i && b + sz2[j] == k)
				{
					c = 1;
					break;
				}
			}
		}
		if (c == 1)
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

