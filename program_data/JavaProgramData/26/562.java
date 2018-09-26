package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		int i;
		int j;
		int n;
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) != ' ')
			{
			System.out.printf("%c",s.charAt(i));
			}
			else
			{
		if (s.charAt(i - 1) == ' ')
		{
			continue;
		}
			else
			{
				System.out.printf("%c",s.charAt(i));
			}
			}
		}
	}



}
