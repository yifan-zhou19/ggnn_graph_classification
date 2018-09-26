package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] od = new int[n];
		int i;
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(od[i]) = Integer.parseInt(tempVar2);
			}
		}
		int[] abod = new int[n];
		int j;
		int k;
		for (j = 0; j < n; j++)
		{
			abod[j] = od[n - j - 1];
		}
		for (k = 0; k < n - 1; k++)
		{
			System.out.printf("%d ", abod[k]);
		}
		System.out.printf("%d", abod[n - 1]);
	}

}

