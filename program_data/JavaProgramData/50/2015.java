package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int w;
		int[] b = {13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
			b[i] = a[i - 1] + b[i - 1];
		}
		for (i = 1;i <= 12;i++)
		{
			if (((b[i] % 7 + w - 1) == 5) || ((b[i] % 7 + w - 1) == 12))
			{
				System.out.printf("%d\n",i);
			}
		}
		return 0;
	}

}

