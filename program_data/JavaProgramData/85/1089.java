package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int panduan = new int(char * s,int len);
		String shuru = new String(new char[30]);
		String s;
		int i;
		int n;
		int len;
		shuru = new Scanner(System.in).nextLine();
		n = Integer.parseInt(shuru);
		for (i = 0;i < n;i++)
		{
			shuru = new Scanner(System.in).nextLine();
			len = shuru.length();
			s = shuru;
		tangible.RefObject<String> tempRef_s = new tangible.RefObject<String>(s);
			if (panduan(tempRef_s, len) != 0)
			{
				s = tempRef_s.argValue;
				System.out.print("yes\n");
			}
			else
			{
				s = tempRef_s.argValue;
				System.out.print("no\n");
			}
		}
		return 0;
	}
	public static int panduan(tangible.RefObject<String> s, int len)
	{
		int i;
		for (i = 0;i < len;i++)
		{
			if (s.argValue != '_' && (s.argValue < 'a' || s.argValue>'z') && (s.argValue < 'A' || s.argValue>'Z'))
			{
				return 0;
			}
			if (*(s.argValue.Substring(i)) != '_' && (*(s.argValue.Substring(i)) < 'a' || *(s.argValue.Substring(i))>'z') && (*(s.argValue.Substring(i)) < 'A' || *(s.argValue.Substring(i))>'Z') && (*(s.argValue.Substring(i)) > '9' || *(s.argValue.Substring(i)) < '0'))
			{
				return 0;
			}
		}
		return 1;
	}
}

