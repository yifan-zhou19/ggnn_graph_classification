package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[101]);
		String c = new String(new char[101]);
		char len;
		int i;
		int j = 0;
		int p;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = len - 1;i >= 0;i--)
		{
		if (*(s.Substring(i)) == ' ')
		{

			for (p = 1; * (s.Substring(i) + p) != ' ' && *(s.Substring(i) + p) != '\0';p++)
			{
				System.out.printf("%c",*(s.Substring(i) + p));
			}
			System.out.print(" ");
		}
		}
		for (p = 0; * (s.Substring(p)) != ' ' && *(s.Substring(p)) != '\0';p++)
		{
				System.out.printf("%c",*(s.Substring(p)));
		}
	}















}
