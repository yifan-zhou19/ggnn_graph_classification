package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		char[] yy = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '\0'};

	String stri = new String(new char[1001]);
	char s;
	stri = ConsoleInput.readToWhiteSpace(true).charAt(0);
	int len;
	int i = 0;
	int sum = 0;
	len = stri.length();
	while (i < len)
	{
	s = stri.charAt(i);
	while (stri.charAt(i) - 'a' == s - 'a' || stri.charAt(i) - 'a' == s - 'A' || stri.charAt(i) - 'A' == s - 'a' || stri.charAt(i) - 'A' == s - 'A')
	{
		sum++;
	i++;
	}
	if ((s - 'A') >= 0 && (s - 'A') <= 26)
	{
	System.out.print("(");
	System.out.print(yy[s - 'A']);
	System.out.print(",");
	System.out.print(sum);
	System.out.print(")");
	}
	else
	{
	System.out.print("(");
	System.out.print(yy[s - 'a']);
	System.out.print(",");
	System.out.print(sum);
	System.out.print(")");
	}

	 sum = 0;
	}

	return 0;
	}

}

