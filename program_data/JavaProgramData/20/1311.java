package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void f(char yl[],char cr[]);
	String a = new String(new char[11]);
	String b = new String(new char[4]);
	int i;
	for (i = 1;;)
	{
		if (scanf("%s%s",a,b) == EOF)
		{
			break;
		}
	else
	{
		f(a, b);
	}

	}
	}
	public static void f(String yl, String cr)
	{
		int i;
		int j;
		int l;
		int p = 0;
		String s = new String(new char[14]);
		l = yl.length();
	for (i = 0;i <= l - 1;i++)
	{
		p = 0;
		for (j = 0;j <= l - 1;j++)
		{
			if (yl[j].compareTo(yl[i]) > 0)
			{
				p++;
			}
		}
			if (p == 0)
			{
				p = i;
				break;
			}
	}
	for (i = 0;i <= p;i++)
	{
		s = tangible.StringFunctions.changeCharacter(s, i, yl[i]);
	}
	for (i = p + 1;i <= p + 3;i++)
	{
		s = tangible.StringFunctions.changeCharacter(s, i, cr[i - 1 - p]);
	}
	for (i = p + 4;i <= l + 2;i++)
	{
		s = tangible.StringFunctions.changeCharacter(s, i, yl[i - 3]);
	}
	s = tangible.StringFunctions.changeCharacter(s, l + 3, '\0');
	System.out.printf("%s\n",s);
	}

}

