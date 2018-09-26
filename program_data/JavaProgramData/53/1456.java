package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n];
		int[] ssz = new int[n];
		int count = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (sz[j] == sz[i])
				{
					sz[j] = 0;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] != 0)
			{
				ssz[count] = sz[i];
				count++;
			}
		}
		System.out.printf("%d",ssz[0]);
		for (i = 1;i < count;i++)
		{
			System.out.printf(",%d",ssz[i]);
		}
		return 0;
	}
}

