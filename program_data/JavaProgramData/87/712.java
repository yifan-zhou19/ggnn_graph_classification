package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h1;
		int m1;
		int s1;
		int h2;
		int m2;
		int s2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			h2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			s2 = Integer.parseInt(tempVar6);
		}
		int s;
		while (h1 != 0 || m1 != 0 || s1 != 0 || h2 != 0 || m2 != 0 || s2 != 0)
		{
			h2 = h2 + 12;
			s = (h2 - h1) * 3600 - m1 * 60 - s1 + m2 * 60 + s2;
			System.out.printf("%d\n",s);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				h1 = Integer.parseInt(tempVar7);
			}
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				m1 = Integer.parseInt(tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead();
			if (tempVar9 != null)
			{
				s1 = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead();
			if (tempVar10 != null)
			{
				h2 = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead();
			if (tempVar11 != null)
			{
				m2 = Integer.parseInt(tempVar11);
			}
			String tempVar12 = ConsoleInput.scanfRead();
			if (tempVar12 != null)
			{
				s2 = Integer.parseInt(tempVar12);
			}
		}
		return 0;
	}
}

