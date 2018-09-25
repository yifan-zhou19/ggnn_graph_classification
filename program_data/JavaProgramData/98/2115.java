package <missing>;

public class GlobalMembers
{
	public static int WordLen(tangible.RefObject<String> a)
	{
		int i;
		for (i = 0;a.argValue.charAt(i);i++)
		{
			;
		}
		return i;
	}
	public static int Main()
	{
		int i;
		int num;
		int space = 80;
		String word = new String(new char[41]);
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < num;i++)
		{
			word = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (space == 80)
			{
				System.out.print(word);
			tangible.RefObject<String> tempRef_word = new tangible.RefObject<String>(word);
				space -= WordLen(tempRef_word);
				word = tempRef_word.argValue;
			}
		else
		{
			tangible.RefObject<String> tempRef_word2 = new tangible.RefObject<String>(word);
				if (space >= WordLen(tempRef_word2) + 1)
				{
					word = tempRef_word2.argValue;
					System.out.print(' ');
					System.out.print(word);
				tangible.RefObject<String> tempRef_word3 = new tangible.RefObject<String>(word);
					space -= WordLen(tempRef_word3) + 1;
					word = tempRef_word3.argValue;
				}
				else
				{
					word = tempRef_word2.argValue;
					System.out.print("\n");
					System.out.print(word);
				tangible.RefObject<String> tempRef_word4 = new tangible.RefObject<String>(word);
					space = 80 - WordLen(tempRef_word4);
					word = tempRef_word4.argValue;
				}
		}
		}

	}


}

