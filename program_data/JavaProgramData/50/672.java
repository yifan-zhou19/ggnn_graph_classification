package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = new int[12];
		int w;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		w += 12;
		for (int j = 0;j < 12;j++)
		{
			if (w % 7 == 5)
			{
				System.out.printf("%d\n",j + 1);
			}
			w += a[j];
		}

		return 0;
	}


}

