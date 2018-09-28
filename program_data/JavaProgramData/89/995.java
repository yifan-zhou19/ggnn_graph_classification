package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j;
		int n;
		int judge = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] peo1 = new int[n];
		int[] peo2 = new int[n];
		int[] countNum = new int[n];
		for (i = 0;i < n;i++)
		{
			countNum[i] = 0;
		}
		while (true)
		{
			peo1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			peo2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (peo1[i] == 0 && peo2[i] == 0)
			{
				break;
			}
			else
			{
				countNum[peo2[i]]++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (countNum[i] == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				judge = 1;
			}
		}
		if (judge == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}

}

