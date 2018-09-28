package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'str', so pointers on this parameter are left unchanged:
	public static int isLegal(char * str)
	{
		if (!Character.isLetter(*str) && *str != '_')
		{
			return 0;
		}
		for (str++; * str;str++)
		{
			if (!Character.isLetter(*str) && !Character.isDigit(*str) && *str != '_')
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		String str = new String(new char[100]);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		str = new Scanner(System.in).nextLine();
		while (n-- != 0)
		{
			  str = new Scanner(System.in).nextLine();
			  System.out.printf("%d\n", isLegal(str));
		}
		return 0;
	}

}

