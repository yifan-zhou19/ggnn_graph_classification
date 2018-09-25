package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //b?? c??
		int b;
		int c;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		int[] a = new int[100];
		for (i = 3;i <= n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}
			if (a[i] >= b)
			{
				c = b;
				b = a[i];
			}
			else if (a[i] >= c)
			{
				c = a[i];
			}
		}
		System.out.printf("%d\n%d\n", b, c);
		return 0;
	}
}

