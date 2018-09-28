package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		for (int i = 0 ; i < len ; i++)
		{
			if (str.charAt(i) == ' ')
			{
				System.out.print(str.charAt(i));
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
				while (str.charAt(++i) == ' ')
				{
					;
				}
			}
			System.out.print(str.charAt(i));
		}
		return 0;
	}
}
