package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int w;
		int[] a = {13, 44, 72, 103, 133, 164, 194, 225, 256, 286, 317, 347};
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 12;i++)
		{
			if (w == 7 && a[i] % 7 + w - 8 == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
			else if (w != 7 && a[i] % 7 + w - 1 == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
	}

}

