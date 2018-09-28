package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int b;
		int n;
		int b1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i - 1] = Integer.parseInt(tempVar2);
			}
		}
		b = a[0];
		b1 = a[0];
		for (i = 2;i <= n;i++)
		{
			if (b < a[i - 1])
			{
				b1 = b;
				b = a[i - 1];
			}
			else if (b1 < a[i - 1])
			{
				b1 = a[i - 1];
			}
		}
		System.out.printf("%d\n%d\n",b,b1);
	}
}

