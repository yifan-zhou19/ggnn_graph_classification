package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] sz = new int[500];
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int i;
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[i] = Integer.parseInt(tempVar2);
		}
	}
	int j = 0;
	int[] s = new int[500];
	for (i = 0;i < n;i++)
	{
		if (sz[i] % 2 != 0)
		{
	s[j] = sz[i];
		j++;
		}
	}
	int b;
	b = j;
	int e;
	for (int k = 1;k < b;k++)
	{
		for (j = 0; j < (b - k); j++)
		{
				if (s[j] > s[j + 1])
				{
						e = s[j + 1];
						s[j + 1] = s[j];
						s[j] = e;
				}
		}
	}
	for (j = 0;j < (b - 1);j++)
	{
	System.out.printf("%d,",s[j]);
	}
	System.out.printf("%d",s[b - 1]);
	return 0;
	}
}

