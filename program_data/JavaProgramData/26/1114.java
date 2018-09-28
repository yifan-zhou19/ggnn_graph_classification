package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		for (int i = 0;i < a.length() - 1;i++)
		{
			if (a.charAt(i) != ' ' || a.charAt(i + 1) != ' ')
			{
			System.out.printf("%c",a.charAt(i));
			}
		}
		System.out.printf("%c",a.charAt(a.length() - 1));
	}
}
