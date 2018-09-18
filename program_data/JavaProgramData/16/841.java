package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = n / 10000;
		a[1] = (n - a[0] * 10000) / 1000;
		a[2] = (n - a[0] * 10000 - a[1] * 1000) / 100;
		a[3] = (n - a[0] * 10000 - a[1] * 1000 - a[2] * 100) / 10;
		a[4] = n - a[0] * 10000 - a[1] * 1000 - a[2] * 100 - a[3] * 10;
		for (i = 0;i <= 4;i++)
		{
			if (a[i] != 0)
			{
				for (j = 4;j >= i;j--)
				{
					System.out.printf("%d",a[j]);
				}
				break;
			}
		}
		if (a[0] + a[1] + a[2] + a[3] + a[4] == 0)
		{
			System.out.print("0");
		}
		return 0;
	}
}

