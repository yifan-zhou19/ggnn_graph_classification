package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String letter = new String(new char[40]);
		int n;
		int i;
		int blank = 0;
		int num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(letter, '0', (Character.SIZE / Byte.SIZE));
			letter = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (letter.length() + blank + num > 80)
			{
				blank = 0;
				num = 0;
				System.out.print("\n");
			}
			if (blank != 0)
			{
				System.out.print(' ');
			}
			System.out.print(letter);
			num += letter.length() + blank;
			blank = 1;
		}
		return 0;
	}
}

