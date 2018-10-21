package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			String a = new String(new char[101]);
			int i;
			a = new Scanner(System.in).nextLine();

			for (i = 0;i < a.length();i++)
			{
					if (a.charAt(i) != ' ')
					{
							System.out.printf("%c",a.charAt(i));
					}
					else if (a.charAt(i) == ' ')
					{
							if (a.charAt(i + 1) == ' ')
							{
									do
									{
											++i;
									} while (a.charAt(i) == ' ');
									System.out.print(" ");


									System.out.printf("%c",a.charAt(i));
							}
							else
							{
								System.out.print(" ");
							}
					}

			}

			return 0;
	}


}
