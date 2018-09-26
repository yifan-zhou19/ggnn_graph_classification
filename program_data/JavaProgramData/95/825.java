package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		char c;
		int i;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;i < 80;i++)
		{
			if (str1.charAt(i) > 64 && str1.charAt(i) < 91)
			{
				str1.charAt(i) += 32;
			}
			if (str2.charAt(i) > 64 && str2.charAt(i) < 91)
			{
				str2.charAt(i) += 32;
			}
		}
		if (strcmp(str1,str2) > 0)
		{
			System.out.print(">");
		}
		else if (strcmp(str1,str2) == 0)
		{
			System.out.print("=");
		}
		else
		{
			System.out.print("<");
		}

		return 0;
	}

}
