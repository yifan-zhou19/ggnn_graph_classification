package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[6];
		int i;
		int[] b = {100, 50, 20, 10, 5, 1};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 6;i++)
		{
			a[i] = n / b[i];
			n = n - a[i] * b[i];
			System.out.printf("%d\n",a[i]);
		}
	return 0;
	}
}

