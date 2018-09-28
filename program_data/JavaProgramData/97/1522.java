package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = n / 100;
		a[1] = n % 100 / 50;
		a[2] = n % 100 % 50 / 20;
		a[3] = n % 100 % 50 % 20 / 10;
		a[4] = n % 100 % 50 % 20 % 10 / 5;
		a[5] = n % 100 % 50 % 20 % 10 % 5;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",a[0],a[1],a[2],a[3],a[4],a[5]);
		return 0;
	}

}

