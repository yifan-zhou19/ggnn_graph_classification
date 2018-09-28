package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int w;
		int i;
		int[] a = {0, 13, 44, 72, 103, 133, 164, 194, 225, 256, 286, 317, 347};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i < 13;i++)
		{
			a[i] = a[i] % 7;
			a[i] = a[i] + w - 1;
			if ((a[i] % 7) == 5)
			{
				System.out.printf("%d\n",i);
			}
		}
	}
}

