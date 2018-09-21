package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[101]);
		int i;
		int l;
		int j;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = l - 1;i >= 0;i--)
		{
			if (s.charAt(i) == ' ')
			{
				for (j = i + 1;;j++)
				{
					if (j >= l != 0 || s.charAt(j) == ' ')
					{
						break;
					}
					System.out.printf("%c",s.charAt(j));
				}
				System.out.print(" ");
			}
			else if (i == 0)
			{
				for (j = 0;;j++)
				{
						if (j >= l != 0 || s.charAt(j) == ' ')
						{
							break;
						}
						System.out.printf("%c",s.charAt(j));
				}
			}
		}
		System.out.print("\n");
	}
}
