package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int[] a = new int[12];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		a[0] = 12;
		a[1] = a[0] + 31;
		a[2] = a[1] + 28;
		a[3] = a[2] + 31;
		a[4] = a[3] + 30;
		a[5] = a[4] + 31;
		a[6] = a[5] + 30;
		a[7] = a[6] + 31;
		a[8] = a[7] + 31;
		a[9] = a[8] + 30;
		a[10] = a[9] + 31;
		a[11] = a[10] + 30;
		for (i = 0;i < 11;i++)
		{
			if ((w + a[i]) % 7 == 5)
			{
			System.out.printf("%d\n",i + 1);
			}
		}
		if ((w + a[11]) % 7 == 5)
		{
		System.out.printf("%d",12);
		}
	}
}

