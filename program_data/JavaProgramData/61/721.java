package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10];
		int n;
		int c = 0;
		int b = 1;
		int f = 1;
		int i;
		int d;
		int e;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
		if (a[i] == 1 || a[i] == 2)
		{
			System.out.print("1");
		}
		else
		{
		for (p = 2;p < a[i];p++)
		{
			c = f + b;
			e = c;
			d = b;
			b = e;
			f = d;
		}
		System.out.printf("\n%d\n",c);
		c = 0;
		b = 1;
		f = 1;
		}
		}
		return 0;
	}
}

