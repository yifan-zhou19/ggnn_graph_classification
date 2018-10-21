package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		int i;
		int s = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) != ' ')
			{
			s = s + 1;
			}
			else if (a.charAt(i) != a.charAt(i - 1))
			{
				System.out.printf("%d",s);
				if (i + 1 < a.length())
				{
					System.out.print(",");
				}
				s = 0;
			}
		}
		System.out.printf("%d",s);

		return 0;
	}

}
