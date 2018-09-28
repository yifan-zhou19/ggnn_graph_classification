package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
	i = 0;
	k = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] w = new int[n];
	while (i <= n - 1)
	{
		i = n - 1 - i;
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 (w[i]) = Integer.parseInt(tempVar2);
	 }
	 i = n - 1 - i;
	 i = i + 1;
	}
	 while (k <= n - 1)
	 {
		if (k == n - 1)
		{
		System.out.printf("%d",(w[k]));
		}
	else
	{
	System.out.printf("%d ",(w[k]));
	}
	k = k + 1;
	 }
	return 0;
	}


}

