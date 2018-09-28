package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100]);
	public static char[][] sub = new char[1000][100];
	public static int l;
	public static int sublen;
	public static int cnt = 0;
	public static void jud(String t)
	{
		int i;
		int j;
		int k;
		String s1 = new String(new char[50]);
		String s2 = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(s1,'\0',(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(s2,'\0',(Character.SIZE / Byte.SIZE));
		if (t.length() % 2 == 1)
		{
			for (i = t.length() / 2 - 1;i >= 0;i--)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, t.length() / 2 - 1 - i, t[i]);
			}
			for (i = t.length() / 2 + 1;i < t.length();i++)
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i - t.length() / 2 - 1, t[i]);
			}
		}
		else
		{
			for (i = t.length() / 2 - 1;i >= 0;i--)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, t.length() / 2 - 1 - i, t[i]);
			}
			for (i = t.length() / 2;i < t.length();i++)
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i - t.length() / 2, t[i]);
			}
		}
		for (i = 1;i <= cnt;i++)
		{
			if (strcmp(sub[i],t) == 0 || t.length() == 1)
			{
				break;
			}
			else
			{
				if (strcmp(s1,s2) == 0)
				{
					System.out.print(t);
					System.out.print("\n");
				}
				break;
			}
		}
	}
	public static void fen(int sl)
	{
		int i;
		int j;
		for (i = 0;i <= l - sl;i++)
		{
			cnt++;
			for (j = 0;j < sl;j++)
			{
				sub[cnt][j] = a.charAt(i + j);
			}
		}
	}
	public static void d()
	{
		int i;
		l = a.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(sub,'\0',(Character.SIZE / Byte.SIZE));
		for (sublen = 2;sublen <= l;sublen++)
		{
			fen(sublen);
		}
		for (i = 1;i <= cnt;i++)
		{
			jud(sub[i]);
		}
	}
	public static int Main()
	{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		d();
		return 0;
	}
}

