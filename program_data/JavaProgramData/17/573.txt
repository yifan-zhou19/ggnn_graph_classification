package <missing>;

public class GlobalMembers
{
	public static int find(String s, int pos)
	{
		int i;
		int p = 0;
		int q = 0;
		if (pos < 0)
		{
			return 0; //?????
		}
		if (s[pos].equals(')'))
		{
			for (i = pos - 1; i >= 0; i--)
			{
				if (s[i].equals('('))
				{
					p++;
				}
				if (s[i].equals(')'))
				{
					q++; //??????????????
				}
				if ((s[i].equals('(')) && (p - q == 1))
				{
					s[i] = ' ';
					s[pos] = ' ';
					break; //?????????????
				}
			}
		}
		find(s, pos - 1); //??????
		return 0;
	}
	public static int Main()
	{
		String s = new String(new char[101]);
		String ss = new String(new char[101]);
		String ans = new String(new char[101]);
		int i;
		int n;
		while (true)
		{
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (!cin)
			{
				break;
			}
			ss = s;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(ans,' ',(Character.SIZE / Byte.SIZE));
			n = s.length() - 1; //??????
			find(s, n); //???????
			for (i = 0; i <= n; i++)
			{
				if (s.charAt(i) == '(')
				{
					ans = tangible.StringFunctions.changeCharacter(ans, i, '$');
				}
				if (s.charAt(i) == ')')
				{
					ans = tangible.StringFunctions.changeCharacter(ans, i, '?'); //????????????
				}
			}
			ans = tangible.StringFunctions.changeCharacter(ans, n + 1, '\0');
			System.out.print(ss);
			System.out.print("\n");
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0; //main???????0
	}
}

