package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int i;
		int j;
		int[] a = new int[5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		i = 0;
		while (x >= 10)
		{
			a[i] = x % 10;
			x = x / 10;
			i = i + 1;
		}
		a[i] = x;
		for (j = 0;j <= i;j++)
		{
			System.out.printf("%d",a[j]);
		}
		System.out.print("\n");

	}
}

