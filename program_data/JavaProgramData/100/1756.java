package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_t = new int[305];
	public static int Main()
	{
		String a = new String(new char[305]);
		char ch;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int t[305];
		int i;
		int j;
		int l;
		int count = 0;
		int y = 0;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		i = 0;
		j = 0;
		while (a.charAt(i) != '\0')
		{
			if (a.charAt(i) < 65 || (a.charAt(i)>90 && a.charAt(i) < 97) || a.charAt(i)>122)
			{
				count++;
			}
			else
			{
				Main_t[a.charAt(i)]++;
			}
			i++;
		}
		if (count == l)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 0;i < 123;i++)
			{
				if (Main_t[i] != 0)
				{
					System.out.printf("%c=%d\n",i,Main_t[i]);
				}
			}

		}

	}
}
