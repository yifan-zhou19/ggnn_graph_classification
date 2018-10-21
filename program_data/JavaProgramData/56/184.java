package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m = 0;
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[5];
		int i = 0;
		while (n >= 1)
		{
			a[i] = n % 10;
			n = (int)(n / 10);
			i++;
		}
		int k = 0;
		int j = 0;
		for (j = i; j > 0; j--, k++)
		{
			m = 10 * m + a[k];
		}
		System.out.printf("%d", m);
	}

}

