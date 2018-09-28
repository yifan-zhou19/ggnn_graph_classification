package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str = new String(new char[100]);

	str = new Scanner(System.in).nextLine();
	int maxlen = 0;
	int minlen = 9999;
	String maxstr = null;
	String minstr = null;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *p=strtok(str," ");
	char p = tangible.StringFunctions.strTok(str," ");
	while (p != null)
	{
	int len = p.length();
	if (len > maxlen)
	{
	maxlen = len;
	maxstr = p;
	}
	if (len < minlen)
	{
	minlen = len;
	minstr = p;
	}
	p = tangible.StringFunctions.strTok(0," ");
	}
	System.out.printf("%s\n",maxstr);
	System.out.printf("%s\n",minstr);
	return 0;
	}
}

