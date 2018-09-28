package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[13];
		a[1] = 12;
		a[2] = 43;
		a[3] = 71;
		a[4] = 102;
		a[5] = 132;
		a[6] = 163;
		a[7] = 193;
		a[8] = 224;
		a[9] = 255;
		a[10] = 285;
		a[11] = 316;
		a[12] = 346;
		int w;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
			if ((a[i] + w) % 7 == 5)
			{
				System.out.printf("%d\n",i);
			}
		}
		return 0;
	}
}

