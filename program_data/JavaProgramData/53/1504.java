package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] Set = new int[300];
		int n = 0;
		int i = 0;
		int j = 0;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				Set[p] = Integer.parseInt(tempVar2);
			}
			for (j = 0; j < p; j++)
			{
				if (Set[j] == Set[p])
				{
					break;
				}
			}
			if (j == p)
			{
				p++;
			}
		}
		if (p != 0)
		{
			System.out.printf("%d", Set[0]);
		}
		for (i = 1; i < p; i++)
		{
			System.out.printf(",%d", Set[i]);
		}
		return 0;
	}
}

