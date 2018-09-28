package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int t;
		int i;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		t = 0;
		c = 0;
		i = 1;
		while (i <= n - 1)
		{
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
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
			{
				t++;
				if (c < t)
				{
					c = t;
				}
			}
			else
			{
				t = 0;
			}
			i++;
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b = Integer.parseInt(tempVar5);
		}
		if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
		{
				t++;
				if (c < t)
				{
					c = t;
				}
		}
		System.out.printf("%d",c);
	   return 0;
	}
}

