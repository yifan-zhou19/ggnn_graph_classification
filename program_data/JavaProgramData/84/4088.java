package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a;
		int max;
		int sec;
		int i;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		max = x;
		sec = x;
		for (i = 2;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x = Integer.parseInt(tempVar3);
			}
			if (x >= max)
			{
				max = x;
			}
			if ((x < max) && (x >= sec))
			{
				sec = x;
			}
		}
		System.out.printf("%d\n",max);
		System.out.printf("%d\n",sec);
	}
}

