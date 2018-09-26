package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] a = new int[5];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = n / 10000;
		a[1] = (n % 10000) / 1000;
		a[2] = (n % 1000) / 100;
		a[3] = (n % 100) / 10;
		a[4] = (n % 10);
		for (i = 4;i >= 0;i--)
		{
			if (a[i] == 0)
			{
				continue;
			}
				System.out.printf("%d",a[i]);

		}
	}
}

