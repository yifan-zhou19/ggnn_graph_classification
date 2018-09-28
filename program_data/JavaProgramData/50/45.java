package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int w;
		int[] a = new int[12];
		a[0] = 12;
		a[1] = 12 + 31;
		a[2] = 12 + 31 + 28;
		a[3] = 12 + 31 + 28 + 31;
		a[4] = 12 + 31 + 28 + 31 + 30;
		a[5] = 12 + 31 + 28 + 31 + 30 + 31;
		a[6] = 12 + 31 + 28 + 31 + 30 + 31 + 30;
		a[7] = 12 + 31 + 28 + 31 + 30 + 31 + 30 + 31;
		a[8] = 12 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
		a[9] = 12 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
		a[10] = 12 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
		a[11] = 12 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 12;i++)
		{
			if ((w + a[i]) % 7 == 5)
			{
				System.out.printf("%d\n",i + 1);
			}

		}
		return 0;


	}
}

