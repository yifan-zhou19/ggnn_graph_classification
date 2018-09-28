package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int n;
		int i;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != ' ')
			{
				System.out.printf("%c",a.charAt(i));
			}
			else
			{
				do
				{
					i += 1;
				} while (a.charAt(i) == ' ');
				i = i - 1;
				System.out.print(" ");
			}
		}
	return 0;
	}

}
