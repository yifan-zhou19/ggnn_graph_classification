package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String times = new String(new char[26]);
		String flag = new String(new char[100000]);
		String code = new String(new char[100000]);
		int i;
		int tell;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (; n > 0; n--)
		{
			tell = 1;
			code = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (i = 0; i < 26; i++)
			{
				times = times.substring(0, i);
			}
			for (i = 0; code.charAt(i) != '\0'; i++)
			{
				times.charAt(code.charAt(i) - 'a')++;
				if (times.charAt(code.charAt(i) - 'a') == 1)
				{
					flag = tangible.StringFunctions.changeCharacter(flag, i, 1);
				}
				else
				{
					flag = flag.substring(0, i);
				}
			}
			for (i = 0; i < 100000; i++)
			{
				if (flag.charAt(i) == 1 && times.charAt(code.charAt(i) - 'a') == 1)
				{
					System.out.print((char) code.charAt(i));
					System.out.print("\n");
					tell = 0;
					break;
				}
			}
			if (tell != 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

