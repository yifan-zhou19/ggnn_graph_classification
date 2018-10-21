package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] N = new int[100];
		int i;
		int e;
		for (i = 0;i < n;scanf("%d", N[i++]))
		{
			;
		}
		for (i = 0; i < n / 2; e = N[i], N[i] = N[n - i - 1], N[n - i - 1] = e, i++)
		{
			;
		}
		for (i = 0;i < n - 1;System.out.printf("%d ",N[i++]))
		{
			;
		}
	System.out.printf("%d",N[n - 1]);
	return 0;
	}
}

