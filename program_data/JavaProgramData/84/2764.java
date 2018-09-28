package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int b = 0;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] >= b)
			{
				b = a[i];
			}
		}
		System.out.printf("%d\n",b);
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] == b)
			{
				b = b + 1;
			}
			else if (a[i] >= c != 0 && a[i] < b)
			{
				c = a[i];
			}
		}
		System.out.printf("%d",c);
	}
}

