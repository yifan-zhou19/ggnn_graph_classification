package <missing>;

public class GlobalMembers
{
	public static void change(String words)
	{
		int len = words.length();
		int i = 0;
		int d = 'A' - 'a';
		for (i = 0; i < len; i++)
		{
			if (words[i].compareTo('z') <= 0 && words[i].compareTo('a') >= 0)
			{
				words[i] = words[i].Substring(d);
			}
		}
	}
	public static int Main()
	{
		String words = new String(new char[100]);
		words = ConsoleInput.readToWhiteSpace(true).charAt(0);
		change(words);
		char mark = words.charAt(0);
		int sum = 0;
		int len = words.length();
		for (int i = 0; i < len; i++)
		{
			if (words.charAt(i) == mark)
			{
				sum++;
			}
			else
			{
				System.out.print("(");
				System.out.print(mark);
				System.out.print(",");
				System.out.print(sum);
				System.out.print(")");
				mark = words.charAt(i);
				sum = 1;
			}
		}
		System.out.print("(");
		System.out.print(mark);
		System.out.print(",");
		System.out.print(sum);
		System.out.print(")");
		return 0;
	}
}

