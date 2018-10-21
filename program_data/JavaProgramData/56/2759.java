package <missing>;

public class GlobalMembers
{
	public static void change(String s, int i)
	{
		if (i == 1)
		{
			System.out.print(s[0]);
		}
		else
		{
			System.out.printf("%c",s[i - 1]);
			change(s, i - 1);
		}
	}

	public static void Main()
	{
		String s = new String(new char[6]);
		int i;
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < 6;i++)
		{
		if (s.charAt(i) == '\0')
		{
			break;
		}
		}
		change(s, i);
	}
}
