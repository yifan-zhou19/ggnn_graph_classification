package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		int[] a = {0, 100, 50, 20, 10, 5, 1};
		int[] b = new int[7];
		int i;
		for (i = 1;i < 7;i++)
		{
			x = x - a[i - 1] * b[i - 1];
			b[i] = x / a[i];
		}
		for (i = 1;i < 7;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;
	}
}

