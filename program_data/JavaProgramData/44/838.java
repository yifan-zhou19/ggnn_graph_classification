package <missing>;

public class GlobalMembers
{
	public static void f(String s)
	{
		int i;
		int j;
		int a;
		a = s.length();
		if (s[0].equals('0') || (s[0].equals('-') && s[1].equals('0')))
		{
			System.out.print("0\n");
		}
		else if (s[0].equals('-'))
		{
			System.out.print("-");
			for (i = a - 1;i >= 1;i--)
			{
				if (!s[i].equals('0'))
				{
					break;
				}
			}
			for (j = i;j >= 1;j--)
			{
				System.out.printf("%c",s[j]);
			}
			System.out.print("\n");
		}
		else
		{
			for (i = a - 1;i >= 0;i--)
			{
				if (!s[i].equals('0'))
				{
					break;
				}
			}
			for (j = i;j >= 0;j--)
			{
				System.out.printf("%c",s[j]);
			}
			System.out.print("\n");
		}
	}
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void f(String s);
	public static int Main()
	{
		int i;
		String s = new String(new char[10]);
		for (i = 1;i <= 6;i++)
		{
			s = new Scanner(System.in).nextLine();
			f(s);
		}
		return 0;
	}
}
