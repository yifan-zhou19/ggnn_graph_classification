package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int b;
		int c;
		int x;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		c = b;

		for (i = 1;i <= x - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i - 1] = Integer.parseInt(tempVar3);
			}
			if (a[i - 1] >= b)
			{
				b = a[i - 1];
			}
		}
		for (i = 1;i <= x - 1;i++)
		{
			if (a[i - 1] >= c != 0 && a[i - 1] < b)
			{
				c = a[i - 1];
			}
		}
		System.out.printf("%d\n%d",b,c);
		return 0;
	}

}

