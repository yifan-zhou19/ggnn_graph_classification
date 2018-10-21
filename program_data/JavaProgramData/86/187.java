package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int num;
		int i;
		int j;

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
				num = Integer.parseInt(tempVar2);
			}
			for (j = 0; j < num; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
			}
			System.out.printf("%d\n", comp(a, num));
		}

		return 0;
	}

	public static int comp(int[] a, int num)
	{
		int i;
		int re = 0;
		for (i = 0; i < num; i++)
		{
			re = 3 * (i + 1) + a[i];
			if ((re > 60) && ((re-3) < 60)) // not jump in 60
			{
				return a[i];
			}
			else if (re > 60) // jumped in 60
			{
				return 60 - 3 * i;
			}
		}
		if (re <= 60)
		{
			return 60 - 3 * i;
		}
	}
}

