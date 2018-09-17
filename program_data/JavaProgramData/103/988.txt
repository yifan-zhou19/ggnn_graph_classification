package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[1000]);
		word = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int length = word.length();
		for (int i = 0 ; i < length ; i++)
		{
			if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
			{
				word.charAt(i) += ('A' - 'a'); // ???????
			}
		}
		char temp = word.charAt (0);
		int counts = 1;
		for (int i = 1 ; i < length ; i++)
		{
			if (word.charAt(i) != temp)
			{
				System.out.printf("(%c,%d)",temp,counts);
				temp = word.charAt(i);
				counts = 1;
			}
			else
			{
				counts++;
			}
		}
		System.out.printf("(%c,%d)",temp,counts);
		return 0;
	}

}

