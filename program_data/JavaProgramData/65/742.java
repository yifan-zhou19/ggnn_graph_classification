package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[200];
		int[] sc = new int[200];
		int n;
		int i;
		int a = 0;
		int b = 0;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sc[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] == sc[i] - 1 || sz[i] == sc[i] + 2)
			{
				a++;
			}
			if (sc[i] == sz[i] - 1 || sc[i] == sz[i] + 2)
			{
				b++;
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		if (a < b)
		{
			System.out.print("B");
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

