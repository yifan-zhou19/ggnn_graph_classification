package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int t;
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
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			t = Integer.parseInt(tempVar4);
		}
		if (a > b)
		{
			a = a;
			b = b;
		}
		else
		{
			t = a;
			a = b;
			b = t;
		};

		for (i = 3;i <= n;i++)
		{
			int c;
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				c = Integer.parseInt(tempVar5);
			}
		if (c > a && c > b)
		{
			t = a;
			a = c;
			b = t;

		}
		else if (c < a && c> b)
		{
			a = a;
			b = c;
		}
		else
		{
			a = a;
			b = b;
		};
		};
			System.out.printf("%d\n",a);
			System.out.printf("%d",b);

		return 0;
	}

}

