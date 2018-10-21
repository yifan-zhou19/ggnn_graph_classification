package <missing>;

public class GlobalMembers
{
	public static int f(String s, char c)
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i,count=0;
		int i;
		int count = 0;
		for (i = 0;i < s.length();i++)
		{
			if (s[i].equals(c))
			{
				count++;
			}
		}
		if (count != 0)
		{
			System.out.printf("%c=%d\n",c,count);

		}
		return 0;
	}

	public static int Main()
	{
		String s = new String(new char[300]);
		char b;
		int i;
		int len;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) <= 'z' && s.charAt(i) >= 'a')
			{
				count++;
				break;
			}
		}
		if (count == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			for (b = 'a';b <= 'z';b++)
			{
				f(s, b);
			}
		}
	}


}

