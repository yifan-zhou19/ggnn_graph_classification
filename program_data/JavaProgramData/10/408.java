package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int[] a = new int[26];
		int[] len = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;++i)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < k;++i)
		{
			len[i] = 1;
		}
		for (i = 1;i < k;++i)
		{
			for (j = 0;j < i;++j)
			{
				if (a[i] <= a[j])
				{
					len[i] = len[j] + 1;
					break;
				}
			}
			for (l = j + 1;l < i;++l)
			{
				if (len[l] >= len[i] != 0 && a[i] <= a[l])
				{
					len[i] = len[l] + 1;
					continue;
				}
			}

		}
		for (i = 0;i < k;++i)
		{
			if (len[i] > len[0])
			{
				len[0] = len[i];
			}
		}
		System.out.printf("%d",len[0]);
	}

}

