package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] a = new int[5];
		int i = 0;
		int j;
		double N = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n % 10 != 0)
		{
			a[i] = n % 10;
			n = n / 10;
			i++;
		}
		for (j = 0;j < i;j++)
		{
			N += a[j] * Math.pow(10, (i - j - 1));
		}
		System.out.printf("%.0lf",N);
	}
}

