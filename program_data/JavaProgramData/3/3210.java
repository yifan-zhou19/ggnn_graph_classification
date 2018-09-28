package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int f;
		int[] zs = new int[N];
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(zs[i]) = Integer.parseInt(tempVar3);
			}
		}
			for (i = 0;i < n;i++)
			{
				f = 0;
				for (j = 0;j < n,j != i;j++)
				{
					if (zs[i] + zs[j] == k)
					{
						f = 1;
						break;
					}
				}
				if (f == 1)
				{
					break;
				}
			}
			if (f == 1)
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

