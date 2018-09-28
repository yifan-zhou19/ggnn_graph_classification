package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
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
		d = (b >= c)?b:c;
		e = (b <= c)?b:c;
		for (i = 3;i <= a;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				f = Integer.parseInt(tempVar4);
			}
			if (d <= f)
			{
				e = d;
				d = f;
			}
			else
			{
				e = (e >= f)?e:f;
			}
		}
		System.out.printf("%d\n%d",d,e);
		return 0;
	}
}

