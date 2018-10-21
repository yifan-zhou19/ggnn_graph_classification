package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		char i;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) != ' ')
			{
			  System.out.printf("%c",a.charAt(i));
			  continue;
			}
			else
			{
				System.out.print(" ");
				while (a.charAt(i + 1) == ' ')
				{
					 i = i + 1;
				}
			}
		}
		return 0;
	}

}
