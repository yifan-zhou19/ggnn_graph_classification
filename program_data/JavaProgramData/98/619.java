package <missing>;

public class GlobalMembers
{
	public static void compose_word(String[] word, int number)
	{
		int count = 0; //count????????????????len?????????,first?????????
		int len = 0;
		int first = 0;
		int i = 0;
		len = word[0].length();
		for (i = 0; i < number;)
		{
			while (len + count < 80)
			{
				if (first != 0)
				{
					System.out.print(' ');
					count++;
				}
				else
				{
					first = 1;
				}
				System.out.print(word[i]);
				count += len;
				i++;
				if (i >= number)
				{
					break;
				}
				len = word[i].length();
			}
			System.out.print("\n");
			count = 0;
			first = 0;
			if (i >= number)
			{
				break;
			}
		}
	}
	public static int Main()
	{
		int number = 0; //number????????
		int i;
		number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		final String word = "";
		for (i = 0; i < number; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				word = tangible.StringFunctions.changeCharacter(word, i, tempVar);
			}
		}
		compose_word(word, number); //????
		return 0;
	}
}

