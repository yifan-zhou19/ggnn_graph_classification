package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int interuptCount;
	int currentNum;
	int sec;
	int lostTime;
	final int maxSeconds = 60;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0; i < n; ++i)
	{
		interuptCount = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	lostTime = 0;
	for (int j = 0; j < interuptCount; ++j)
	{
		currentNum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	sec = currentNum + lostTime;
	if (sec < maxSeconds)
	{
	if ((maxSeconds - sec) > 3)
	{
	lostTime += 3;
	}
	else
	{
	lostTime += maxSeconds - sec;
	}
	}
	}
	System.out.print(maxSeconds - lostTime);
	System.out.print("\n");
	}
		return 0;
	}





}

