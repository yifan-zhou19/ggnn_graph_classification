package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] x = new int[5];
		int i = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			x[i] = n % 10;
			n = n / 10;
			i++;
		}
		n = 0;
		for (j = 0;j < i;j++)
		{
			n += x[j];
			n = n * 10;
		}
		n = n / 10;
		System.out.printf("%d\n", n);
		return 0;
	}
}

