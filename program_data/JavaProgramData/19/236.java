package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[150]);
		String from = new String(new char[150]);
		String to = new String(new char[150]);
		String a = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
		int i;
		str = new Scanner(System.in).nextLine();
		from = new Scanner(System.in).nextLine();
		to = new Scanner(System.in).nextLine();


		while (*p != null)
		{
		for (i = 0; * p != ' ' && *p != '\0';p++, i++)
		{
		   a = tangible.StringFunctions.changeCharacter(a, i, *p);
		}
		a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		if (strcmp(a,from) == 0)
		{
			System.out.printf("%s",to);
		}
		else
		{
			System.out.printf("%s",a);
		}
		if (*p != null)
		{
			System.out.print(" ");
			p++;
		}
		}



		return 0;
	}
}

