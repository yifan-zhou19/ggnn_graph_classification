package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int l;
		int k;
		int day = 0;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 12;i++)
		{
			if (((day + 13) % 7) == ((5 - n + 8) % 7))
			{
				System.out.printf("%d",i + 1);
				if (i != 11)
				{
				System.out.print("\n");
				}
			}
			day = day + a[i];
		}

		return 0;
	}
}

