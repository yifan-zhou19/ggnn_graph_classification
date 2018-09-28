package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[6];
		int[] b = {100, 50, 20, 10, 5, 1};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int c = n;
		a[0] = n / b[0];
		for (int i = 1;i < 6;i++)
		{
			c = c - a[i - 1] * b[i - 1];
			a[i] = c / b[i];
		}
		for (int j = 0;j < 6;j++)
		{
			System.out.printf("%d\n",a[j]);
		}
		return 0;
	}

}

