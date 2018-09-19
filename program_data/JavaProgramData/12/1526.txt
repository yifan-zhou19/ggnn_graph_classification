package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[100];
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Integer.parseInt(tempVar);
		}
		while (p > 0)
		{
			for (i = 0;i < 100;i = i + 1)
			{
				a[i] = 0;
			}
			for (;p > 0;)
			{
				a[p] = 1;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p = Integer.parseInt(tempVar2);
				}
			}
			n = 0;
		for (i = 1;i < 50;i = i + 1)
		{
			if (a[i] != 0 && a[2 * i] != 0)
			{
				n = n + 1;
			}
		}
			System.out.printf("%d\n",n);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p = Integer.parseInt(tempVar3);
			}
		}

		return 0;
	}
}

