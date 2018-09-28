package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		int i;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0; i < 80; i++)
		{
			if (str1.charAt(i) > 96)
			{
				str1.charAt(i) -= 32;
			}
			else
			{
				str1.charAt(i) -= 0;
			}
			if (str2.charAt(i) > 96)
			{
				str2.charAt(i) -= 32;
			}
			else
			{
				str2.charAt(i) -= 0;
			}
		}
		if (strcmp(str1, str2) < 0)
		{
			System.out.print("<");
		}
		else if (strcmp(str1, str2) > 0)
		{
			System.out.print(">");
		}
		else
		{
			System.out.print("=");
		}
	}
}
