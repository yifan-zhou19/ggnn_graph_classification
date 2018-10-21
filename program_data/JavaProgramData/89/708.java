package <missing>;

public class GlobalMembers
{
	public static int[] to = new int[10005];
	public static int[] from = new int[10005];
	public static int n;
	public static int Main()
	{
		int k1;
		int k2;
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			to[i] = 0;
			from[i] = 0;
		}
		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				k2 = Integer.parseInt(tempVar3);
			}
			if (k1 == 0 && k2 == 0)
			{
				break;
			}
			to[k2]++;
			from[k1]++;
		}
		int t = -1;
		for (i = 0;i < n;i++)
		{
			if (to[i] == n - 1 && from[i] == 0)
			{
				System.out.printf("%d\n",i);
				t = i;
			}
		}
		if (t < 0)
		{
			System.out.print("NOT FOUND\n");
		}
		return 0;
	}

}

