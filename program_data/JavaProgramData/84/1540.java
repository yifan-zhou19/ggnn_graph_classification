package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 100;
		int a;
		int b;
		int i;
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
		if (b > a)
		{
			int p;
			p = b;
			b = a;
			a = p;
		}
		for (i = 3;i < n;i++)
		{
			int c;
			int m;
			int k;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c = Integer.parseInt(tempVar3);
			}
			if (c > b && c < a)
			{
				m = a;
				k = c;
				a = m;
				b = k;
			}
			else if (c > a)
			{
				m = c;
				k = a;
				a = m;
				b = k;
			}
		}
		System.out.printf("%d\n%d\n",a,b);
		return 0;
	}


}

