package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h1 = 1;
		int m1;
		int s1;
		int h2;
		int m2;
		int s2;
		int s = 0;
		while (!(h1 == 0 && h2 == 12 && m1 == 0 && m2 == 0 && s1 == 0 && s2 == 0))
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			s1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			h2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			s2 = Integer.parseInt(tempVar6);
		}
		h2 = h2 + 12;
		s = (h2 - h1) * 60 * 60;
		s = s - (m1 - m2) * 60 - (s1 - s2);
		if (!(h1 == 0 && h2 == 12 && m1 == 0 && m2 == 0 && s1 == 0 && s2 == 0))
		{
			System.out.printf("%d\n",s);
		}
		s = 0;

		}
		return 0;
	}
}

