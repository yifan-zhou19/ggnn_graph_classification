package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int[] b = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
		int i;
		int n;
		int D = 13;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 12;i++)
		{
			if ((b[i] + D + n - 1) % 7 == 5)
			{
				System.out.printf("%d\n",a[i]);
			}
		}
	}
}

