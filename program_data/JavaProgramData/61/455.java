package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int a = 0;
		int i = 0;
		int tmp1 = 1;
		int tmp2 = 1;
		int tmp;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}

			if (a <= 2)
			{
				System.out.print("1\n");
			}
			else
			{
				for (i = 2; i < a; i++)
				{
					tmp = tmp2;
					tmp2 = tmp1 + tmp2;
					tmp1 = tmp;
				}
				System.out.printf("%d\n", tmp2);
			}
			tmp1 = 1;
			tmp2 = 1;
		}
		return 0;
	}
}

