package <missing>;

public class GlobalMembers
{
	// ******************************
	// *** ??????.cpp       ***
	// *** ID:1000012895          ***
	// *** ???                 ***
	// *** 2010/12/11             ***
	// ******************************
	public static int Main()
	{
		int[] know = new int[11101];
		int cnt = 0;
		int n;
		int i;
		int p1;
		int p2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
				know[i] = 0;
		}
		while (true)
		{
			p1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (p1 == 0 && p2 == 0)
			{
				break;
			}
			know[p2]++;
			know[p1] = -1;
		}
		for (i = 0; i < n; i++)
		{
			if (know[i] == n - 1)
			{
				System.out.print(i);
				cnt++;
			}
		}
		if (cnt == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}

}

