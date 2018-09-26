package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int t;
		int w;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i < 12;i++)
		{
			a[i] = a[i - 1] + a[i];
		}
		x = 13 - w;
		if (13 - x == 7)
		{
			System.out.print("1\n");
		}
		for (i = 1;i < 12;i++)
		{
				if ((a[i - 1] + 13 - x) % 7 == 0)
				{
				System.out.printf("%d\n",i + 1);
				}
		}

	}

}

