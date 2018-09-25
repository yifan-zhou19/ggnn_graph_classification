package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int MAX1;
		int MAX2;
		int a;
		int b;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		MAX1 = a;
		MAX2 = b;
		int x;
		int y;
		if (b > a)
		{
			x = MAX1;
			y = MAX2;
			MAX1 = y;
			MAX2 = x;
		}
		int i;
		for (i = 2;i < n;i++)
		{
			int j;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				j = Integer.parseInt(tempVar4);
			}
			if (j > MAX1)
			{
				MAX2 = MAX1;
				MAX1 = j;
			}
			else if (j > MAX2)
			{
				MAX2 = j;
			}
		}
		System.out.printf("%d\n%d",MAX1,MAX2);
		return 0;
	}

}

