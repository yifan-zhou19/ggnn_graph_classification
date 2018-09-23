package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[26];
		int[] d = new int[26];
		int i;
		int j;
		int k;
		int n;
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
				s + i = tempVar2;
			}
			d[i] = 0;
		}
		for (i = n - 1;i > -1;i--)
		{
			k = 0;
			for (j = i + 1;j < n;j++)
			{
				if (k < d[j] && s[i] >= s[j])
				{
					k = d[j];
				}
			}
			k++;
			d[i] = k;
		}
	k = 0;
	for (i = 0;i < n;i++)
	{
	if (d[i] > k)
	{
		k = d[i];
	}
	}
	System.out.printf("%d", k);
		return 0;
	}



}

