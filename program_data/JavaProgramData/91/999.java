package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int l;
	String s = new String(new char[1000]);
	String s1 = new String(new char[1000]);
	char c;
	s = new Scanner(System.in).nextLine();
	l = s.length();
	*(s.Substring(l)) = *s;
	for (i = 0;i < l;i++)
	{
		*(s1.Substring(i)) = *(s.Substring(i)) + *(s.Substring(1) + i);
	}
	*(s1.Substring(l)) = '\0';
	System.out.printf("%s",s1);
	}


}
