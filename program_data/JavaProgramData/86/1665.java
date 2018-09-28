package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int nCases;
		int n;
		int t;
		int wasteTime;

		nCases = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (nCases-- != 0)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			wasteTime = 0;
			for (int i = 0; i < n; i++)
			{
				t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				t += i * 3;
				if (t + 3 <= 60)
				{
					wasteTime += 3;
				}
				else if (t < 60 && t + 3 > 60)
				{
					wasteTime += (60 - t);
				}
			}

			System.out.print(60 - wasteTime);
			System.out.print("\n");
		}
		return 0;
	}
}

