package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 3;
		int n;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
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
		while (i <= n)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			if (a >= b != 0 && c >= b)
			{
				b = c;
			}
			else
			{
				if (b >= a != 0 && c >= a)
				{
					a = c;
				}
			}
			i++;
		}
		if (a < b)
		{
		 c = a;
		 a = b;
		 b = c;
		}
		System.out.printf("%d\n%d",a,b);
		return 0;
	}
}

