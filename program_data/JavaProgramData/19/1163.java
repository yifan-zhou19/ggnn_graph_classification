package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String s = new String(new char[101]);
	String a = new String(new char[101]);
	String b = new String(new char[101]);
	String word = new String(new char[101]);
	int i = 0;
	int j;
	int flag;
	int n = 0;
	s = new Scanner(System.in).nextLine();
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	while (s.charAt(i - 1) != 0 || i == 0)
	{
	while (s.charAt(i) != ' ' && s.charAt(i) != 0)
	{
	word = tangible.StringFunctions.changeCharacter(word, i - n, s.charAt(i));
	i++;
	}
	word = word.substring(0, i - n);
	flag = 1;
	for (j = 0;j <= a.length();j++)
	{
	if (a.charAt(j) != word.charAt(j))
	{
	flag = 0;
	}
	}
	if (flag != 0)
	{
	System.out.printf("%s",b);
	}
	else
	{
		System.out.printf("%s",word);
	}
	if (s.charAt(i) != 0)
	{
		System.out.printf("%c",s.charAt(i));
	}
	i++;
	n = i;
	}
	}
}

