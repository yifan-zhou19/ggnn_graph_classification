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
		for (i = 0;i <= 79;i++)
		{
			if (65 <= str1.charAt(i) && str1.charAt(i) <= 90)
			{
				str1.charAt(i) += 32;
			}
			if (65 <= str2.charAt(i) && str2.charAt(i) <= 90)
			{
				str2.charAt(i) += 32;
			}
		}
		if (strcmp(str1,str2) == 0)
		{
			System.out.print("=");
		}
		else if (strcmp(str1,str2) > 0)
		{
			System.out.print(">");
		}
		else if (strcmp(str1,str2) < 0)
		{
			System.out.print("<");
		}
		return 0;
	}
}
