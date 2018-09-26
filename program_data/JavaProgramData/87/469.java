package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int h1;
		int m1;
		int s1;
		int h2;
		int m2;
		int s2;
		int s;
		for (;;)
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
		if (h1 == 0 && m1 == 0 && s1 == 0)
		{
			break;
		}
		s = (h2 + 12 - h1) * 3600 + (m2 - m1) * 60 + s2 - s1;
		System.out.printf("%d\n",s);
		}
	}

}

