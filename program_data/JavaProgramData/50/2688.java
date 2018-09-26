package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
		int i;
		int j;
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= 11;i++)
		{
			if ((a[i] + 13 - 1 + w) % 7 == 5)
			{
			System.out.printf("%d\n",i + 1);
			}
		}
		return 0;
	}

}

