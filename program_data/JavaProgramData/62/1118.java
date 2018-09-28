package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] s = new char[100][100];
	String s1 = new String(new char[100]);
	int i;
	int t;
	int j = 0;
	int p = 0;
	s1 = new Scanner(System.in).nextLine();
	for (i = 0;i <= s1.length();i++)
	{
	if ((s1.charAt(i) == ' ' && s1.charAt(i + 1) == ' ') || (s1.charAt(i) == ' ' && s1.charAt(i + 1) != ' '))
	{
	continue;
	}
	s[j][p] = s1.charAt(i);
	p++;
	if (s1.charAt(i + 1) == ' ' && s1.charAt(i) != ' ')
	{
		j++;
	p = 0;
	}
	}
	for (t = 0;t <= j - 1;t++)
	{
	System.out.printf("%s ",s[t]);
	}
	System.out.printf("%s",s[j]);
	return 0;
	}

}
