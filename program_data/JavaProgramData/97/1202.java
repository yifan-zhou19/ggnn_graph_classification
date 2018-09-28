package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[6];
		int[] b = {100, 50, 20, 10, 5, 1};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = n / b[0];
		System.out.printf("%d\n",a[0]);
		for (i = 0;i < 5;i++)
		{
			n -= a[i] * b[i];
			a[i + 1] = n / b[i + 1];
			System.out.printf("%d\n",a[i + 1]);
		}
		return 0;
	}

}

