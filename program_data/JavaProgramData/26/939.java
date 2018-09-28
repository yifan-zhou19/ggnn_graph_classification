package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int i;
	int a;
	int j = 0;
	String s = new String(new char[100]);
	String x = new String(new char[100]);

	s = new Scanner(System.in).nextLine();

	a = s.length();

	for (i = 0;i < a;i++)
	{
					 if (s.charAt(i) != ' ')
					 {
						 x = tangible.StringFunctions.changeCharacter(x, j, s.charAt(i));
								j++;
					 }
					 else if ((s.charAt(i) == ' ') && (s.charAt(i - 1) != ' '))
					 {
						 x = tangible.StringFunctions.changeCharacter(x, j, s.charAt(i));
								j++;
					 }
	}
	for (i = 0;i < j;i++)
	{
	System.out.printf("%c",x.charAt(i));
	}
	return 0;
	}

}

