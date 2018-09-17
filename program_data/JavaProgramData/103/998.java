package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String arr = new String(new char[1001]);
		arr = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int len;
		int temp = 0;
		len = arr.length();
		for (i = 0;i < len;i++)
		{
			if ((int)arr.charAt(i) > 92)
			{
				arr = tangible.StringFunctions.changeCharacter(arr, i, (char)((int)arr.charAt(i) - 32));
			}
		}
		for (i = 1;i < len;i++)
		{
			if (arr.charAt(i) != arr.charAt(i - 1))
			{
				System.out.print('(');
				System.out.print(arr.charAt(i - 1));
				System.out.print(',');
				System.out.print(i - temp);
				System.out.print(')');
				temp = i;
			}
		}
		System.out.print('(');
		System.out.print(arr.charAt(len - 1));
		System.out.print(',');
		System.out.print(len - temp);
		System.out.print(')');
		System.out.print("\n");
		return 0;
	}

}

