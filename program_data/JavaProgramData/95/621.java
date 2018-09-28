package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void strlw(char s[]);
		int i;
		int len;
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				a.charAt(i) += 32;
			}
		}
		len = b.length();
		for (i = 0;i < len;i++)
		{
			if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
			{
				b.charAt(i) += 32;
			}
		}
		for (i = 0;(a.charAt(i) != '\0') || (b.charAt(i) != '\0');i++)
		{
			if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">");
				break;
			}
			else if (a.charAt(i) < b.charAt(i))
			{
				System.out.print("<");
				break;
			}
		}
		if ((a.charAt(i) == '\0') && (b.charAt(i) == '\0'))
		{
			System.out.print("=");
		}
	}




}
