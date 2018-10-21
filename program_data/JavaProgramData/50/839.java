package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = new int[13];
		int d;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			d = Integer.parseInt(tempVar);
		}
		d = d - 1;
		b[0] = 13;
		for (i = 1;i <= 12;i++)
		{
			b[i] = b[i - 1] + a[i - 1];
			if ((b[i] + d) % 7 == 5)
			{
				System.out.printf("%d\n",i);
			}
		}
		return 0;
	}
}

