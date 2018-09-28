package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		String word = new String(new char[40]);
		final String Max_word = "";
		final String Min_word = "afwefjaklwejfioajwe";
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				word = tempVar.charAt(0);
			}
			if (word.length() > Max_word.length())
			{
				Max_word = word;
			}
			if (word.length() < Min_word.length())
			{
				Min_word = word;
			}
		} while (System.in.read() != '\n');
		System.out.println(Max_word);
		System.out.println(Min_word);
	}
}

