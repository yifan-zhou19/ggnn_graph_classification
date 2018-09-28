package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100000];
		int i;
		int b;
		int c;
		int d;
		for (i = 0;i < 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			b = a[0];
		}
		for (i = 1;i < 2;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			c = a[i];
			if (c >= b)
			{
				d = b;
				b = c;

			}
			else
			{
				d = c;
			}
		}
		for (i = 2;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}
			c = a[i];
			if (c >= b)
			{
				d = b;
				b = c;
			}
			else if (c < b && c >= d)
			{
				d = c;
			}
			else
			{
				b = b;
				d = d;
			}

		}
		System.out.printf("%d\n%d",b,d);
		return 0;
	}
}

