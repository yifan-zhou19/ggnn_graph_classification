package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		int i;
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) != ' ' || s.charAt(i) == ' ' && s.charAt(i - 1) != ' ')
			{
			System.out.printf("%c",s.charAt(i));
			}
			else
			{

			continue;
			}
		}
	}


}
