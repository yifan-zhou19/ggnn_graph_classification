package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int k;
		int n;
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
		b = n - 1;
		a = n - 1;
		for (i = 1;i <= n - 1;i++)
		{
			if ((a * n / (n - 1) + k) % (n - 1) != 0)
			{
				a = b + n - 1;
				b = b + n - 1;
				i = 0;
			}
			else
			{
				a = a * n / (n - 1) + k;
			}
		}
		System.out.printf("%d",a * n / (n - 1) + k);
	}
}

