package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_b = new int[301];
	public static void Main()
	{
		int i;
		int x = 0;
		String a = new String(new char[301]);
		char d;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int b[301];
		a = new Scanner(System.in).nextLine();
		for (i = 0;i <= a.length();i = i + 1)
		{
			if (a.charAt(i) >= 97 && a.charAt(i) <= 122)
			{
				Main_b[a.charAt(i) - 97] = Main_b[a.charAt(i) - 97] + 1;
			}
		}
		for (i = 0;i <= 25;i = i + 1)
		{
			x = x + Main_b[i];
		}
		if (x == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i <= 25;i = i + 1)
			{
				d = i + 97;
				if (Main_b[i] != 0)
				{
					System.out.printf("%c=%d\n",d,Main_b[i]);
				}
			}
		}
	}

}
