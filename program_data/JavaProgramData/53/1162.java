package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int b = 0;
		int[] sz = new int[300];
		int[] arr = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(arr[i]) = Integer.parseInt(tempVar2);
			}
		}

	for (i = 0;i < n - 1;i++)
	{
	for (j = i + 1;j < n;j++)
	{
		if (arr[j] == arr[i])
		{
			arr[j] = 0x00;
		}
	}
	}
	for (i = 0;i < n;i++)
	{
		if (arr[i] != 0)
		{
			sz[b] = arr[i];
			b++;
		}
	}
	for (i = 0;i < b - 1;i++)
	{
		System.out.printf("%d,",sz[i]);
	}
	System.out.printf("%d",sz[b - 1]);
	return 0;
	}


}

