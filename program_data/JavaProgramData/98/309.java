package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		char[] word = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		word = ConsoleInput.readToWhiteSpace(true).charAt(0);
		sum += word.length();
		System.out.print(word);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(word,0,(Character.SIZE / Byte.SIZE));
		for (int i = 1;i < n;i++)
		{
			word = ConsoleInput.readToWhiteSpace(true).charAt(0);
			sum += word.length() + 1;
			if (sum > 80)
			{
				System.out.print("\n");
				System.out.print(word);
				sum = word.length();
			}
			else
			{
				System.out.print(' ');
				System.out.print(word);
			}
		}
		return 0;
	}



}

