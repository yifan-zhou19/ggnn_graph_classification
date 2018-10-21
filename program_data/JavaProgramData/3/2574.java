package <missing>;

public class GlobalMembers
{
	public static int ex(tangible.RefObject<Integer> x, tangible.RefObject<Integer> y)
	{
		int tmp = 0;
		tmp = x.argValue;
		x.argValue = y.argValue;
		y.argValue = tmp;
	}
	public static int Main()
	{
		int n;
		int k;
		int s = 0;
		int[] sz = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (int a = 0;a < n;a++)
		{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(sz[a]) = Integer.parseInt(tempVar3);
				}
		}
		for (int b = 0;b < n;b++)
		{
				for (int c = b + 1;c < n;c++)
				{
						if ((sz[c]) + (sz[b]) == k)
						{
											s++;
						}
				}
		}
		if (s == 0)
		{
				 System.out.print("no");
		}
				 else
				 {
		System.out.print("yes");
				 }

		return 0;
	}
}

