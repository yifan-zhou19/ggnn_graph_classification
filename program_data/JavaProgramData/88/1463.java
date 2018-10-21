package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[35]);
	public static int Main()
	{
		a = new Scanner(System.in).nextLine();
		for (int i = 0;i < a.length();i++)
		{
			if (Character.isDigit(a.charAt(i)) != 0)
			{
				if (Character.isDigit(a.charAt(i + 1)) != 0)
				{
					System.out.print(a.charAt(i));
				}
				else
				{
					System.out.print(a.charAt(i));
					System.out.print("\n");
				}
			}
		}


	}
}
