package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[13]);
		String substr = new String(new char[3]);
		char[][] out = new char[50][13];
		int maxasc = char a[13];
		int n;
		int i;
		int max;
		for (n = 0;;n++)
		{
			if (scanf("%s",str) == EOF)
			{
				break;
			}
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				substr = tempVar.charAt(0);
			}
			max = maxasc(str);
			for (i = str.length();i > max;i--)
			{
				str = tangible.StringFunctions.changeCharacter(str, i + 3, str.charAt(i));
			}
			str = tangible.StringFunctions.changeCharacter(str, max + 1, substr.charAt(0));
			str = tangible.StringFunctions.changeCharacter(str, max + 2, substr.charAt(1));
			str = tangible.StringFunctions.changeCharacter(str, max + 3, substr.charAt(2));
			out[n] = str;
		}
		for (i = 0;i < n;i++)
		{
			System.out.println(out[i]);
		}
	}
	public static int maxasc(String a)
	{
		int result;
		int i;
		for (i = 0,result = 0;i < a.length();i++)
		{
			if (a[i].compareTo(a[result]) > 0)
			{
				result = i;
			}
		}
		return result;
	}


}

