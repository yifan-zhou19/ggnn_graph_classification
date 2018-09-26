package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int big1;
		int big2;
		int big;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		int[] b = new int[100];
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[0] = Integer.parseInt(tempVar2);
		}
		big1 = b[0];
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[1] = Integer.parseInt(tempVar3);
		}
		big2 = b[1];
		if (big2 > big1)
		{
			big = big1;
			big1 = big2;
			big2 = big;
		}
		for (int i = 2;i <= a - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
			if (b[i] > big2)
			{
				big2 = b[i];
				if (big2 > big1)
				{
				big = big1;
				big1 = big2;
				big2 = big;
				}
			}
		}
		System.out.printf("%d\n%d\n",big1,big2);
		return 0;
	}

}

