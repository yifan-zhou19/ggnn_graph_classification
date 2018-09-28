package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int j;
		int[] day = {13, 44, 72, 103, 133, 164, 194, 225, 256, 286, 317, 347};
		int[] first = new int[60];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		if (w <= 5)
		{
			first[0] = 6 - w;
		}
		else
		{
			first[0] = 13 - w;
		}
		for (j = 1;j <= 59;j++)
		{
			first[j] = first[0] + 7 * j;
		}
		for (i = 0;i <= 11;i++)
		{
			for (j = 0;j <= 59;j++)
			{
				if (first[j] == day[i])
				{
					System.out.printf("%d\n",i + 1);
				}
			}
		}
		return 0;
	}
}

