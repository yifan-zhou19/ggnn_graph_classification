package <missing>;

public class GlobalMembers
{
	// ???len[i]??a[i]??????????
	// ??????: len[i] = max{h[j]},0 <= j < i,
	// h[j] = len[j]+1, ??a[i] > a[j]
	// h[j] = 1, ??a[i] <= a[j]
	public static int Main()
	{
		int[] a = new int[M];
		int[] len = new int[M];
		int n;
		int i;
		int j;
		int max;
		int longest;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		longest = 1;
		for (i = 0; i < n; i++)
		{
			max = 1;
			len[i] = 1;
			for (j = 0; j < i; j++)
			{
				if (a[i] <= a[j])
				{
					max = len[j] + 1;
				}
				if (len[i] < max)
				{
					len[i] = max;
				}
			}
			if (len[i] > longest)
			{
				longest = len[i];
			}
		}
		System.out.printf("%d\n", longest);

		return 0;
	}

}

