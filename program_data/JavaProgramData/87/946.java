package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a1 = 1;
		int b1 = 1;
		int c1 = 1;
		int a2 = 1;
		int b2 = 1;
		int c2 = 1;
		int s1 = 1;
		int s2 = 1;
		while (a1 + b1 + c1 + a2 + b2 + c2 > 0)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a1 = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				b1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				b2 = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				c2 = Integer.parseInt(tempVar6);
			}
			if (a1 + b1 + c1 + a2 + b2 + c2 == 0)
			{
				break;
			}
			s1 = a1 * 3600 + b1 * 60 + c1;
			s2 = (a2 + 12) * 3600 + b2 * 60 + c2;
			System.out.printf("%d\n",s2 - s1);
		}

		return 0;
	}

}

