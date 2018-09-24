package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		cin.get(a, 101);
		for (int i = 0; i < a.length(); i++)
		{
			if (a.charAt(i) != ' ')
			{
				System.out.print(a.charAt(i));
			}
			if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
			{
				System.out.print(a.charAt(i));
				System.out.print(a.charAt(i + 1));
				i++;
			}
		}
		return 0;
	}
}
