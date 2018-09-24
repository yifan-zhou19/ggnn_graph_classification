package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		int n;
		int i;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n - 1;i++)
		{
			if (s.charAt(i) != ' ')
			{
				System.out.printf("%c",s.charAt(i));
			}
			else
			{
				if (s.charAt(i + 1) == ' ')
				{
					continue;
				}
				else
				{
					System.out.print(" ");
				}
			}
		}
		System.out.printf("%c",s.charAt(n - 1));
		return 0;
	}


}
