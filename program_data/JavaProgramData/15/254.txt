package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		int x;
		int i;
		int j;
		int n;
		int a1;
		int a2;
		int b1;
		int b2;
		a1 = 0;
		a2 = 0;
		b1 = 0;
		b2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i < (n + 1);i++)
		{
			for (j = 1;j < (n + 1);j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					x = Integer.parseInt(tempVar2);
				}
				if ((x == 0) && (a1 == 0))
				{
					a1 = i;
					a2 = j;
				}
				if (x == 0)
				{
					b1 = i;
					b2 = j;
				}
			}
		}
		s = (b1 - a1 - 1) * (b2 - a2 - 1);
		System.out.printf("%d\n",s);
		return 0;

	}
}

