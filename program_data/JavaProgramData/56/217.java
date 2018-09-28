package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[10];
		int[] b = new int[10];
		for (i = 0;i < 4;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 4;i++)
		{
		b[i] = 0;
		while (a[i] > 9)
		{
		  b[i] = (b[i] + a[i] - a[i] / 10 * 10) * 10;
		  a[i] = a[i] / 10;
		}
		b[i] = b[i] + a[i];
		System.out.printf("%d\n",b[i]);
		}
		return 0;
	}

}

