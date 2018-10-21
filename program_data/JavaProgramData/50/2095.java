package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int[] m = {13, 44, 72, 103, 133, 164, 194, 225, 256, 286, 317, 347};

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 0; i < 12; i++)
		{
			if (w == 1)
			{
				if ((m[i] - 5) % 7 == 0)
				{
					System.out.printf("%d\n",i + 1);
				}

			}
			else
			{
			if ((m[i] - 5) % 7 == (8 - w))
			{
				System.out.printf("%d\n",i + 1);
			}
			}
		}

	}

}

