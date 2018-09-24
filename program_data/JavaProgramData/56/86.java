package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {11, 11, 11, 11, 11};
		int i = 0;
		int b;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		while (b > 0)
		{
			a[i] = b % 10;
			i++;
			b = b / 10;
		}
		for (j = 0;j < 5;j++)
		{
			if (a[j] < 10)
			{
				System.out.printf("%d",a[j]);
			}
		}
		System.out.print("\n");
		return 0;
	}

}

