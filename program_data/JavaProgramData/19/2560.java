package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[100]);
	String a = new String(new char[100]);
	String b = new String(new char[100]);
	int i;
	int j;
	int len;
	s = new Scanner(System.in).nextLine();
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	len = s.length();
	int n = 0;
	int word = 0;
	for (i = 0;i < len;i++)
	{
	if (s.charAt(i) == ' ')
	{
	word = 0;
	}
	else if (word == 0)
	{
	word = 1;
	n++;
	}
	}
	int A = 0;
	int l = 0;
	int k;
	String x = new String(new char[100]);
	for (j = 0;j < n;j++)
	{
	for (i = A,k = 0;i < len;i++,k++)
	{
	if (s.charAt(i) != ' ')
	{
	x = tangible.StringFunctions.changeCharacter(x, k, s.charAt(i));
	}
	if (s.charAt(i) == ' ')
	{
	x = tangible.StringFunctions.changeCharacter(x, k, '\0');
	A = i + 1;
	break;
	}
	}
	if (i == len)
	{
		x = tangible.StringFunctions.changeCharacter(x, k, '\0');
	}
	if (strcmp(x,a) == 0)
	{
	x = b;
	}
	System.out.printf("%s",x);
	l++;
	if (l != n)
	{
	System.out.print(" ");
	}
	}

	return 0;
	}


}

