package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int b;
		int c;
		int q;
		int ist;
		int sec;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		i = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		if (b > c)
		{
			ist = b,sec = c;
		}
		else
		{
			ist = c,sec = b;
		}
		while (i < a - 2)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				q = Integer.parseInt(tempVar4);
			}
			if (q > ist)
			{
				sec = ist;
				ist = q;
			}
			if (q > sec && q < ist)
			{
				sec = q;
			}
			i++;
		}
		System.out.printf("%d\n%d",ist,sec);
		return 0;
	}


}

