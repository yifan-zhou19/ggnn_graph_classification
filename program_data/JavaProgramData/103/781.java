package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char currChar;
		char lastChar;
		int lastCount = 1;
		lastChar = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (lastChar <= 'z' && lastChar >= 'a')
		{
			lastChar += 'A' - 'a';
		}
		while ((currChar = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			if (currChar <= 'z' && currChar >= 'a')
			{
				currChar += 'A' - 'a';
			}
			if (currChar != lastChar)
			{
				System.out.print('(');
				System.out.print(lastChar);
				System.out.print(',');
				System.out.print(lastCount);
				System.out.print(')');
				lastCount = 1;
				lastChar = currChar;
			}
			else
			{
				lastCount++;
			}
		}
		System.out.print('(');
		System.out.print(lastChar);
		System.out.print(',');
		System.out.print(lastCount);
		System.out.print(')');
		return 0;
	}
}

