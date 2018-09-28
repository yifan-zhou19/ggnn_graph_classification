package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
	int i;
	s = new Scanner(System.in).nextLine();
	for (i = 0;;i++)
	{
	if (s.charAt(i + 1) != '\0')
	{
	(*(s1.Substring(i))) = (*(s.Substring(i))) + (*(s.Substring(1) + i));
	}
	else
	{
	(*(s1.Substring(i))) = (*(s.Substring(i))) + (*s);
	*(s1.Substring(i) + 1) = '\0';
	break;
	}
	}
	System.out.printf("%s",s1);
	return 0;

	}

}
