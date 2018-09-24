package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int[] a = new int[4];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		a[0] = t / 10000;
		a[1] = (t - a[0] * 10000) / 1000;
		a[2] = (t - a[0] * 10000 - a[1] * 1000) / 100;
		a[3] = (t - a[0] * 10000 - a[1] * 1000 - a[2] * 100) / 10;
		a[4] = t - a[0] * 10000 - a[1] * 1000 - a[2] * 100 - a[3] * 10;
		for (i = 4;a[i] != 0 && i >= 0;i--)
		{
		System.out.printf("%d",a[i]);
		}
	}

}

