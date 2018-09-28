package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int count;
		String buf;
		String[] words;
		int line_word_count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			count = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		words = (String)malloc(count * sizeof(String));
		for (i = 0; i < count; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			buf = (String)malloc(41 * (Character.SIZE / Byte.SIZE));
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				buf = tempVar2.charAt(0);
			}
			words[i] = buf;
		}
		for (i = 0; i < count; i++)
		{
			if (i != count - 1 && line_word_count + String.valueOf(words[i]).length() + 1 > 80)
			{
				System.out.print("\n");
				line_word_count = 0;
			}
			if (line_word_count != 0)
			{
				line_word_count += 1;
				System.out.print(" ");
			}
			line_word_count += String.valueOf(words[i]).length();
			System.out.printf("%s", words[i]);
		}
		return 0;
	}
}

