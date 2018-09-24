package <missing>;

public class GlobalMembers
{
	public static void append()
	{
		String str = new String(new char[50]);
		str = new Scanner(System.in).nextLine();
		if (str.charAt(0) != 'e')
		{
			append();
			System.out.println(str);
		}
	}
	public static void Main()
	{
		append();
	}

}
