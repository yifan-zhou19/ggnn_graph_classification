package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int m;
		int d;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		w = w + 12;
		if (w > 7)
		{
			w = w % 7;
		}
		if (w == 5)
		{
			System.out.print("1\n");
		}
		for (m = 2;m <= 12;m++)
		{
			w = w + a[m - 2];
			if (w > 7)
			{
				w = w % 7;
			}
			if (w == 5)
			{
				System.out.printf("%d\n",m);
			}
		}
		return 0;
	}
}

