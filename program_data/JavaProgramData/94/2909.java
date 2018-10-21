package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] sz = new int[500];
	int[] o = new int[500];
	int m;
	int n;
	int i;
	int j = 0;
	int b;
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
	}
	m = 0;
	for (i = 0;i < n;i++)
	{
	  if (sz[i] % 2 != 0)
	  {
	  o[j] = sz[i];
	j = j + 1;
	m = m + 1;
	  }
	}
	for (j = 1;j <= m;j++)
	{
	  for (i = 0;i < m - j;i++)
	  {
		 if (o[i] > o[i + 1])
		 {
		   b = o[i + 1];
		   o[i + 1] = o[i];
		   o[i] = b;
		 }
	  }
	}
	for (i = 0;i <= m - 1;i++)
	{
	if (i != m - 1)
	{
		System.out.printf("%d,",o[i]);
	}
	else if (i = m - 1)
	{
		System.out.printf("%d",o[m - 1]);
	}
	}
	return 0;
	}


}

