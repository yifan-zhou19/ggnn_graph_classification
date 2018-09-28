package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		int length1;
		int length2;
		length1 = str1.length();
		length2 = str2.length();
		int i;
		for (i = 0;i < length1;i++)
		{
			if (str1.charAt(i) <= 'z' && str1.charAt(i) >= 'a')
			{
			str1.charAt(i) -= 'a'-'A';
			}
		}
		for (i = 0;i < length2;i++)
		{
			if (str2.charAt(i) <= 'z' && str2.charAt(i) >= 'a')
			{
			str2.charAt(i) -= 'a'-'A';
			}
		}
		if (strcmp(str1,str2) > 0)
		{
			System.out.print(">\n");
		}
		if (strcmp(str1,str2) < 0)
		{
			System.out.print("<\n");
		}
		if (strcmp(str1,str2) == 0)
		{
			System.out.print("=\n");
		}
		return 0;
	}
}
