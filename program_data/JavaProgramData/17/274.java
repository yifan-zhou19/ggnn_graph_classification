package <missing>;

public class GlobalMembers
{
	public static void pro(tangible.RefObject<String> s)
	{
		String a = new String(new char[444]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int i;
		int j;
		int k;
		int t;
		i = -1;
		p = s.argValue;
		while (*p != '\0')
		{
			if (*p == '(')
			{
				i++;
				a = tangible.StringFunctions.changeCharacter(a, i, *p);
			}
			else if (*p == ')')
			{
			j = i;
			while ((j >= 0) && (a.charAt(j) != '('))
			{
				j--;
			}
			if (j == -1)
			{
				i++;
				a = tangible.StringFunctions.changeCharacter(a, i, *p);
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, j, ' ');
				i++;
				a = tangible.StringFunctions.changeCharacter(a, i, ' ');
			}
			}
			 else
			 {
				 i++;
				 a = tangible.StringFunctions.changeCharacter(a, i, ' ');
			 }
			p++;
		}

		a = tangible.StringFunctions.changeCharacter(a, i + 1, '\0');
		s.argValue = a;

	}

	public static void print(tangible.RefObject<String> s)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		p = s.argValue;
		while (*p != '\0')
		{
			if (*p == '(')
			{
				*p = '$';
			}
			else if (*p == ')')
			{
				*p = '?';
			}
		 p++;
		}
		 System.out.println(s.argValue);
	}
	public static int Main()
	{
		int l;
		String s = new String(new char[323]);
		//freopen("tt.in","r",stdin);
		//freopen("tt.out","w",stdout);
		s = new Scanner(System.in).nextLine();
		while (s.charAt(0) != '\0')
		{

			System.out.println(s);
		tangible.RefObject<String> tempRef_s = new tangible.RefObject<String>(s);
			pro(tempRef_s);
			s = tempRef_s.argValue;
		tangible.RefObject<String> tempRef_s2 = new tangible.RefObject<String>(s);
			print(tempRef_s2);
			s = tempRef_s2.argValue;
			s = tangible.StringFunctions.changeCharacter(s, 0, '\0');
			s = new Scanner(System.in).nextLine();
		}
		return 0;
	}
}

