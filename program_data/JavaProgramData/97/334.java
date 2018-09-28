package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 1;
		int[] a = new int[6];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (j != 0)
		{
			a[0] = n / 100;
			j = n % 100;
			a[1] = j / 50;
			j = j % 50;
			a[2] = j / 20;
			j = j % 20;
			a[3] = j / 10;
			j = j % 10;
			a[4] = j / 5;
			j = j % 5;
			a[5] = j / 1;
			j = 0;
		}
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",a[0],a[1],a[2],a[3],a[4],a[5]);









		return 0;

	}
}

