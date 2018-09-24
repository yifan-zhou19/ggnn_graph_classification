package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] month = {13, 44, 72, 103, 133, 164, 194, 225, 256, 286, 317, 347};
		int i;
		int[] s = new int[12];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 12;i++)
		{
			s[i] = month[i] % 7;
			if (n <= 5)
			{
				if (s[i] == 6 - n)
				{
					System.out.printf("%d\n",i + 1);
				}
			}
			else if (n == 6)
			{
				if (s[i] == 0)
				{
					System.out.printf("%d\n",i + 1);
				}
			}
			else
			{
				if (s[i] == 6)
				{
					System.out.printf("%d\n",i + 1);
				}
			}
		}

		return 0;
	}


}

