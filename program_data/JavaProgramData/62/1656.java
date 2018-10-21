package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		a = new Scanner(System.in).nextLine();
		int len;
		len = a.length();
		for (int i = 0;i < len;i++)
		{
			if (a.charAt(i) != ' ')
			{
				System.out.printf("%c", a.charAt(i));
			}
			else if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
			{
				System.out.print(" ");
			}
		}
		 return 0;
	}









}
