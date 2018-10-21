package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] count = new int[26];
		String str = new String(new char[100001]);

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(count, 0, (Integer.SIZE / Byte.SIZE));
			int i;
			for (i = 0; str.charAt(i) != '\0'; i++)
			{
				count[str.charAt(i) - 'a']++;
			}

			for (i = 0; str.charAt(i) != '\0'; i++)
			{
				if (count[str.charAt(i) - 'a'] == 1)
				{
					System.out.print(str.charAt(i));
					System.out.print("\n");
					break;
				}
			}
			if (str.charAt(i) == '\0')
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

