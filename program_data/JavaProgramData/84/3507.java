package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int[] c = new int[100];
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (b = 0;b < a;b++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[b] = Integer.parseInt(tempVar2);
			}
		}
		d = c[0];
		for (b = 0;b < a - 1;b++)
		{
			if (d >= c[b + 1])
			{
				d = d;
			}
			else
			{
				d = c[b + 1];
			}
		}
		e = c[0];
		for (b = 0;b < a - 1;b++)
		{
			if (e >= c[b + 1] != 0 || c[b + 1] == d)
			{
				e = e;
			}
			else
			{
				e = c[b + 1];
			}
		}
		System.out.printf("%d\n%d",d,e);
	}

}

