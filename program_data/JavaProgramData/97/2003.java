package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = {0, 100, 50, 20, 10, 5, 1};
		int n;
		int i;
		int[] b = new int[7];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 6;i++)
		{
			b[i] = (n - (n % a[i])) / a[i];
			n = n - a[i] * b[i];
		}
		for (i = 1;i <= 6;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
	}
}

