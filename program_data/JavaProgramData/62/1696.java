package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		s = new Scanner(System.in).nextLine();
		int i;
		int l;
		int flag = 1;
		l = s.length();
		for (i = 0; i < l; i++)
		{
			if (s.charAt(i) != ' ')
			{
				System.out.printf("%c", s.charAt(i));
				flag = 1;
			}
			else if (s.charAt(i) == ' ')
			{
				if (flag == 0)
				{
					continue;
				}
				else
				{
					System.out.printf("%c", s.charAt(i));
					flag = 0;
				}
			}
		}
		System.out.print('\n');
		return 0;
	}
}
