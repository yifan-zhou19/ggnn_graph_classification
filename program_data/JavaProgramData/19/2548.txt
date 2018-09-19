package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int flag;
		String s = new String(new char[101]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		flag = 0;
		do
		{
			for (i = flag;i < s.length();i++)
			{
				if (s.charAt(i + 1) == ' ' || s.charAt(i + 1) == '\0')
				{
					if (i - flag + 1 != a.length())
					{
						for (j = flag;j <= i;j++)
						{
							System.out.printf("%c",s.charAt(j));
						}
					}
					else
					{
						for (j = flag;j <= i;j++)
						{
							if (a.charAt(j - flag) != s.charAt(j))
							{
								break;
							}
						}
						if (j == i + 1)
						{
							System.out.printf("%s",b);
						}
						else
						{
							for (j = flag;j <= i;j++)
							{
								System.out.printf("%c",s.charAt(j));
							}
						}
					}
					flag = i + 2;
					if (s.charAt(i + 1) == ' ')
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("\n");
					}
					break;
				}
			}
		}while (i < s.length());
		return 0;
	}
}
