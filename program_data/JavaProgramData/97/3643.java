package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int ans;
		int[] a = {100, 50, 20, 10, 5, 1};
		double x;
		double jie;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < 6 ;i++)
		{
			System.out.printf("%d\n", n / a[i]);
			n = n - n / a[i] * a[i];
		}
		return 0;
	}
}

