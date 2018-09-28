package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[42]);
		int chars_left;
		int word_length;
		int word_num;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			word_num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			word = tempVar2.charAt(0);
		}
		System.out.printf("%s",word);
		word_num--;
		word_length = word.length();
		chars_left = 80 - word_length;
		while (word_num != 0)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				word = tempVar3.charAt(0);
			}
			word_length = word.length();
			if (chars_left < word_length + 1)
			{
				System.out.printf("\n%s",word);
				chars_left = 80 - word_length;
			}
			else
			{
				System.out.printf(" %s",word);
				chars_left = chars_left - word_length - 1;
			}
			word_num--;
		}
		return 0;
	}

}

