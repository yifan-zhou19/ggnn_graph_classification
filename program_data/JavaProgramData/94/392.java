package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] sz = new int[500];
	int[] szz = new int[500];
	int n;
	int e;
	int s = 0;
	int i;
	int j;
	int k;
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
		sz[i] = Integer.parseInt(tempVar2);
	}
		if (sz[i] % 2 != 0)
		{
		s = s + 1;
		}
	}
	j = 0;
	for (i = 0;i < n;i++)
	{
	if (sz[i] % 2 != 0)
	{
	szz[j] = sz[i];
	j++;
	}
	}
	for (k = 1;k <= s;k++)
	{
		for (j = 0;j < s - k;j++)
		{
			if (szz[j] > szz[j + 1])
			{
			e = szz[j + 1];
			szz[j + 1] = szz[j];
			szz[j] = e;
			}
		}
	}
	for (j = 0;j < s - 1;j++)
	{
	System.out.printf("%d,",szz[j]);
	}
	if (j == s - 1)
	{
	System.out.printf("%d",szz[j]);
	}
	return 0;
	}
}

