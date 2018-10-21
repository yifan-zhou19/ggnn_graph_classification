package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		int i = 0;
		int[] sz = {13, 44, 72, 103, 133, 164, 194, 225, 256, 286, 317, 347};
		while (i < 12)
		{
			if ((sz[i] + w) % 7 == 6)
			{
				System.out.printf("%d\n",i + 1);
			}
				i++;
		}
		return 0;
	}
}

