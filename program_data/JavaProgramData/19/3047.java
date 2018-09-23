package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[101]);
	public static String a = new String(new char[101]);
	public static String b = new String(new char[101]);
	public static String temp = new String(new char[101]);
	public static void judge()
	{
		if (strcmp(temp,a) == 0)
		{
			System.out.printf("%s",b);
		}
		else
		{
			System.out.printf("%s",temp);
		}
	}
	public static void check()
	{
		int i;
		int n = s.length();
		int p = 0;
		int j;
		for (i = 0;i < n;i++)
		{
			if (s.charAt(i) != ' ')
			{
				temp = tangible.StringFunctions.changeCharacter(temp, p, s.charAt(i));
				p++;
			}
			else
			{
				temp = tangible.StringFunctions.changeCharacter(temp, p + 1, '\0');
				judge();
				System.out.print(" ");
				for (j = 0;j < p + 2;j++)
				{
					temp = temp.substring(0, j);
				}
				p = 0;
			}
		}
		temp = tangible.StringFunctions.changeCharacter(temp, p + 1, '\0');
		judge();
	}
	public static int Main()
	{
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		check();
		System.out.print("\n");
		return 0;
	}
}

