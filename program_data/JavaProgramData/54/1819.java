package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		int m;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (a = 1;a < 10000000000;a++)
		{
			i = a;
			for (j = 0,b = 0;j < n;j++)
			{
				if ((i - k) % n != 0 || i <= 0)
				{
					break;
				}
				if ((i - k) % n == 0)
				{
					i = (i - k) * (n - 1) / n;
				}
				if (j == n - 1 && i > 0)
				{
					b = 1;
					break;
				}
			}
			if (b == 1)
			{
				break;
			}
		}
		System.out.printf("%d",a);
		return 0;
	}
}

