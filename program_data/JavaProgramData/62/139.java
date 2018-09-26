package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		a = new Scanner(System.in).nextLine();
		int s = a.length();
		for (int i = 0;i < s - 1;i++)
		{
			if (a.charAt(i) != ' ')
			{
				System.out.printf("%c",a.charAt(i));
				if (a.charAt(i + 1) == ' ')
				{
					System.out.print(" ");
				}
			}
		}
		System.out.printf("%c",a.charAt(s - 1));
	}
}
