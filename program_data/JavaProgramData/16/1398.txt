package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 1;
		if (n == 0)
		{
			System.out.print("0");
		}
		while (n > 0)
		{
			a[i] = n % 10;
			n = n / 10;
			i = i + 1;
		}
		for (j = 1;j < i;j++)
		{
			System.out.printf("%d",a[j]);
		}
		return 0;
	}
}

