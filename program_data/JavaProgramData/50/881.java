package <missing>;

public class GlobalMembers
{
	public static int[] Month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int Main()
	{
		int D;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			D = Integer.parseInt(tempVar);
		}
		D--;
		for (int i = 0; i < 12; i++)
		{
			for (int j = 1; j <= Month[i]; j++)
			{
				D++;
				if (D % 7 == 5 && j == 13)
				{
					System.out.printf("%d\n", i + 1);
				}
			}
		}
		return 0;
	}

}

