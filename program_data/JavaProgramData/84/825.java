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
		n = n - 2;
		if (b > a)
		{
			c = b;
			b = a;
			a = c;
		}
		do
		{
			n--;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				d = Integer.parseInt(tempVar4);
			}
			if (d > b)
			{
				c = d;
				d = b;
				b = c;
			}
			if (b > a)
			{
				c = b;
				b = a;
				a = c;
			}
		} while (n != 0);
		System.out.printf("%d\n%d",a,b);
		return 0;
	}
}

