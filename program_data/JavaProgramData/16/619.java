package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[5];
		int i = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n >= 10)
		{
			while (n >= 10)
			{
				a[i] = n % 10;
				n = (n - a[i]) / 10;
				i++;
			}
			for (j = 0; j <= i - 1; j++)
			{
				System.out.printf("%d", a[j]);
			}
		}
		else
		{
			;
		}
		System.out.printf("%d", n);
	}
}

