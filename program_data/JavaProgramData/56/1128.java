package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[5];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = n % 10;
		a[1] = (int)(n % 100) / 10;
		a[2] = (int)(n % 1000) / 100;
		a[3] = (int)(n % 10000) / 1000;
		a[4] = (int)(n % 100000) / 10000;
		for (i = 0;i < 5;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%d",a[i]);
			}
		}
		return 0;
	}
}

