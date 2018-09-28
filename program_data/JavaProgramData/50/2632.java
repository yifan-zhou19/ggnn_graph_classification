package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int[] b = new int[13];
		int i;
		int j;
		int k;
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		k = (w + 5) % 7;
		b[1] = k;
		for (i = 2;i <= 12;i++)
		{
			b[i] = (b[i - 1] + a[i - 1]) % 7;
		}
		for (i = 1;i <= 12;i++)
		{
			if (b[i] == 5)
			{
				System.out.printf("%d\n",i);
			}
		}
		return 0;
	}
}

