package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int f1;
		int m1;
		int x2;
		int f2;
		int m2;
		int i;
		for (i = 0;i < 100;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
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
			x2 = Integer.parseInt(tempVar4);
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
		x2 = x2 + 12;
		if (x1 == 0 && x2 == 12)
		{
			break;
		}
		System.out.printf("%d\n",3600 * (x2 - x1) + 60 * (f2 - f1) + (m2 - m1));

		}



		return 0;
	}
}

