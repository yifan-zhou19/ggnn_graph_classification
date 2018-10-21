package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = new int[12];
		int i;
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		w = w + 12;
		for (i = 0;i < 12;i++)
		{
			b[i] = a[i] % 7;
		}
		if (w % 7 == 5)
		{
			System.out.print("1\n");
		}
		for (i = 0;i < 11;i++)
		{
			w = w + a[i];
			if (w % 7 == 5)
			{
				System.out.printf("%d\n",i + 2);
			}
		}
		return 0;
	}

}

