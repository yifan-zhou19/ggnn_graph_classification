package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {100, 50, 20, 10, 5, 1};
		int[] b = new int[6];
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 6;i++)
		{
			if (n > 0)
			{
				b[i] = n / a[i];
				n = n - b[i] * a[i];
			}
			else
			{
				break;
			}
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;

	}
}

