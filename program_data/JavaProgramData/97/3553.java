package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int[] a = new int[7];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[1] = n / 100;
		a[2] = (n % 100) / 50;
		a[3] = (n % 50) / 20;
		a[4] = ((n % 50) % 20) / 10;
		a[5] = (n % 10) / 5;
		a[6] = (n % 5) / 1;
		for (int i = 1;i <= 6;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
		return 0;
	}
}

