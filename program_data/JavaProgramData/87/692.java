package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h1;
		int h2;
		int f1;
		int f2;
		int m1;
		int m2;
		int r = 0;
		while (true)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			f1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			h2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			f2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			m2 = Integer.parseInt(tempVar6);
		}
			if (h1 != 0 || h2 != 0 || f1 != 0 || f2 != 0 || m1 != 0 || m2 != 0)
			{
			h2 += 12;
			r += ((h2 - h1 - 1) * 3600);
			r = r + (3600 - f1 * 60 - m1);
			r = r + f2 * 60 + m2;
			System.out.printf("%d\n",r);
			r = 0;
			}
			else
			{
			break;
			}
		}
		return 0;
	}
}

