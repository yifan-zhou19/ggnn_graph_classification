package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
		int m;
		int b = 1;
		int a;
		int[] sl = new int[LEN];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sl[i] = Integer.parseInt(tempVar3);
			}
		}
		if (a = b)
		{
			for (k = 0;k < n;k++)
			{
				for (i = k + 1;i < n;i++)
				{
				if (a = b)
				{
				if ((sl[i] + sl[k]) == m)
				{
					System.out.print("yes\n");
					b = 0;

				}
				}

				}
			}
		}
		if (b != 0)
		{
		for (k = 0;k < n;k++)
		{
			for (i = k + 1;i < n;i++)
			{
				if ((sl[i] + sl[k]) == m)
				{
				b = 0;
				}
			}
		}
		System.out.print("no\n");
		}
				return 0;
	}
}

