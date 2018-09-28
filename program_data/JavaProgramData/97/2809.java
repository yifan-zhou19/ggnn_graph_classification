package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int[] a = new int[6];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		a[0] = k / 100;
		k -= a[0] * 100;
		a[1] = k / 50;
		k -= a[1] * 50;
		a[2] = k / 20;
		k -= a[2] * 20;
		a[3] = k / 10;
		k -= a[3] * 10;
		a[4] = k / 5;
		k -= a[4] * 5;
		a[5] = k;
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
	}
}

