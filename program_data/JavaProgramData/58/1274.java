package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int case_num;
		int i;
		int length;
		int result;
		String identifier = new String(new char[90]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			case_num = Integer.parseInt(tempVar);
		}
		identifier = new Scanner(System.in).nextLine();
		while (case_num -- != 0)
		{
			identifier = new Scanner(System.in).nextLine();
			length = identifier.length();
			result = 1;
			if (length == 0 || !(identifier.charAt(0) == '_' || Character.isLetter((int)identifier.charAt(0))))
			{
				result = 0;
			}
			for (i = 1; i < length; i++)
			{
				if (!(identifier.charAt(i) == '_' || Character.isLetter((int)identifier.charAt(i)) || Character.isDigit((int)identifier.charAt(i))))
				{
					result = 0;
				}
			}
			System.out.printf("%d\n", result);
		}
		return 0;
	}

}

