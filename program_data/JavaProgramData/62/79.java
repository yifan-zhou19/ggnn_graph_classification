package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[3000]);
		char i;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < (int)a.length();i++)
		{
			System.out.printf("%c",a.charAt(i));
			if (a.charAt(i) == ' ')
			{
			for (;i < (int)a.length();i++)
			{
				if (a.charAt(i + 1) != ' ')
				{
					break;
				}
			}
			}
		}

	}
}
