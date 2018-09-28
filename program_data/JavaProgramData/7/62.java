package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int b;
		int a;
		String s = new String(new char[1000]);
		String s1 = new String(new char[1000]);
		String s2 = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps1 = s1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps2 = s2;
		s2 = new Scanner(System.in).nextLine();
		s1 = new Scanner(System.in).nextLine();
		s = new Scanner(System.in).nextLine();
		int l1 = s1.length();
		int l2 = s2.length();
		for (a = 0, b = 0;a < l2 && b == 0;a = i + 1)
		{
			for (i = a, ps1 = s1, ps2 = s2.Substring(a); * ps1 != *ps2 && *ps1 != '\0' && *ps2 != '\0';ps2++, i++)
			{
				;
			}
			for (j = 0, b = 1; * ps1 != '\0' && *ps2 != '\0';ps1++, ps2++, j++)
			{
				if (*ps1 != *ps2 && j < l1)
				{
					b = 0;
					break;
				}
			}

		}
		if (i == l2)
		{
			System.out.printf("%s",s2);
		}
		else
		{
			n = i;
			s2 = tangible.StringFunctions.changeCharacter(s2, n, '\0');
			System.out.printf("%s",s2);
			System.out.printf("%s",s);
			ps2 = s2.Substring(n) + l1;
			System.out.printf("%s",ps2);
		}
		return 0;
	}

}

