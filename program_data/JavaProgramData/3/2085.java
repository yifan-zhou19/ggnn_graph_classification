package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[2000];
		int n;
		int k;
		int s;
		int b;
		b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (int i = 0;i < n;i++)
		{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i] = Integer.parseInt(tempVar3);
				}
				if (i >= 1 && i < n)
				{
				for (int a = 0;a < i;a++)
				{
						s = sz[i] + sz[a];
						if (s == k)
						{
						b++;
						}
				}
				}
		}
		if (b != 0)
		{
		System.out.print("yes");
		}
		else if (b == 0)
		{
		System.out.print("no");
		}
	return 0;
	}

}

