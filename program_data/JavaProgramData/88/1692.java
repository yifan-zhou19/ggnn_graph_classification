package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str = new String(new char[1000]);
	while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
	{
		for (int i = 0;i < str.length();i++)
		{
	if ((str.charAt(i) >= '0') && (str.charAt(i) <= '9'))
	{
		System.out.print(str.charAt(i));
	}
	else
	{
		System.out.print("\n");
	}
		}
	}
	return 0;
	}


}

