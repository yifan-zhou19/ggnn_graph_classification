package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int y(int x);
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		char m;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		int na;
		int nb;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
		}
		na = i;
		for (i = 0;b.charAt(i) != '\0';i++)
		{
		}
		nb = i;
		for (i = 0;i < na;i++)
		{
						 if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
						 {
						 a.charAt(i) += 32;
						 }
		}
		for (i = 0;i < nb;i++)
		{
						 if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
						 {
						 b.charAt(i) += 32;
						 }
		}
		if (strcmp(a,b) > 0)
		{
		m = '>';
		}
	   else if (strcmp(a,b) < 0)
	   {
		m = '<';
	   }
		else
		{
		m = '=';
		}

		System.out.printf("%c",m);

	}

}
