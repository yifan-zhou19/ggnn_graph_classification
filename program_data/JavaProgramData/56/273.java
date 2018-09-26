package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[4];
		int i;
		int[] b = new int[4];
		for (i = 0;i <= 3;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		}
		for (i = 0;i <= 3;i++)
		{
		 while (a[i] > 9)
		 {
		 b[i] = (b[i] + a[i] - a[i] / 10 * 10) * 10;
			  a[i] /= 10;
		 }
		b[i] += a[i];
		System.out.printf("%d\n",b[i]);
		}
		return 0;
	}

}

