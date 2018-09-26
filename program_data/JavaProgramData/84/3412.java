package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int b;
		int c;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(a[i]) = Integer.parseInt(tempVar3);
			}
			if ((a[i - 1]) < (a[i]))
			{
				b = a[i];
			}

		}
		c = a[0];
		for (i = 0;i < n;i++)
		{
			if (c < a[i] && a[i] < b)
			{
				c = a[i];
			}

		}
		System.out.printf("%d\n",b);
		System.out.printf("%d\n",c);
		return 0;
	}

}

