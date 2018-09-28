package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		int i;
		int b;

		a = new Scanner(System.in).nextLine();
		b = a.length();


		for (i = 0;i < b;i++)
		{
			if (a.charAt(i) != ' ')
			{
				System.out.printf("%c",a.charAt(i));
			}
			else if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				continue;
			}
			else
			{
				System.out.print(" ");
			}
		}


		return 0;
	}

}
