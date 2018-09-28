package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int t;
	int z = 1;
	int[] sa = new int[50000];
	int[] sb = new int[50000];
	int[] sz = new int[10000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < 10000;i++)
	{
	  sz[i] = 0;
	}
	for (i = 0;i < n;i++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 (sa[i]) = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 (sb[i]) = Integer.parseInt(tempVar3);
	 }
	 for (j = sa[i];j < sb[i];j++)
	 {
	   sz[j] = 1;
	 }
	}
	for (i = 0;i < n - 1;i++)
	{
		for (j = 0;j < n - i - 1;j++)
		{
			if (sa[j] > sa[j + 1])
			{
				t = sa[j];
				sa[j] = sa[j + 1];
				sa[j + 1] = t;
			}
	if (sb[j] > sb[j + 1])
	{
				t = sb[j];
				sb[j] = sb[j + 1];
				sb[j + 1] = t;
	}
		}
	}
	for (i = sa[0];i < sb[n - 1];i++)
	{
		if (sz[i] == 0)
		{
		  z = 0;
		}
	}
	if (z != 0)
	{
	System.out.printf("%d %d",sa[0],sb[n - 1]);
	}
	else
	{
	System.out.print("no");
	}
	return 0;
	}
}

