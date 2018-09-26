package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int kMaxSeconds = 60;

		for (int i = 0; i < n; ++i)
		{
			int interuptCount; // ??????
			int interuptNum; // ???????????
			interuptCount = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			// lostNum: ???????????
			int lostNum = 0;
			for (int j = 0; j < interuptCount; ++j)
			{
				interuptNum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				int sec = interuptNum + lostNum;
				// ???????????
				//     ??????60???????
				//     ??????60?

				if (sec < kMaxSeconds)
				{
					if ((kMaxSeconds - sec) > 3)
					{
						lostNum += 3;
					}
					else
					{
						lostNum += kMaxSeconds - sec;
					}
				}
			}
			System.out.print(kMaxSeconds - lostNum);
			System.out.print("\n");
		}
		 return 0;
	}
}

