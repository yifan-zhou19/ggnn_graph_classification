package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int[] b = new int[12];
		b[0] = w + 12;
		if (b[0] % 7 == 5)
		{
			System.out.print("1\n");
		}
		for (i = 1;i < 12;i++)
		{
			b[i] = b[i - 1] + a[i - 1];
			if (b[i] % 7 == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
	}
}

