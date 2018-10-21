package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int a;
	   int b;
	   int c;
	   int d;
	   int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (a < b)
		{
			c = a;
			b = a;
			a = c;
		}
		for (i = 3;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				d = Integer.parseInt(tempVar4);
			}
			if (d >= a)
			{
				b = a;
				a = d;
			}
			else if (d >= b)
			{
				b = d;
			}
		}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		d = Integer.parseInt(tempVar5);
	}
			if (d >= a)
			{
				b = a;
				a = d;
			}
			else if (d >= b)
			{
				b = d;
			}
		System.out.printf("%d\n%d\n",a,b);
	   return 0;
	}
}

