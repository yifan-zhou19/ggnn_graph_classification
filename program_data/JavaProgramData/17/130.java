package <missing>;

public class GlobalMembers
{
	public static String st = new String(new char[100]);
	public static String st2 = new String(new char[100]);
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(st,0,100);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(st2,0,100);
		while ((st = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			int left = 0;
			int right = 0;
			int len = st.length();
			for (int i = 0;i < len;i++)
			{
				if (st.charAt(i) == '(')
				{
					left++;
				}
				if (st.charAt(i) == ')')
				{
					right++;
				}
				if (left < right)
				{
					st2 = tangible.StringFunctions.changeCharacter(st2, i, '?');
					right--;
				}
			}
			left = 0;
			right = 0;
			for (int j = len - 1;j >= 0;j--)
			{
				if (st.charAt(j) == '(')
				{
					left++;
				}
				if (st.charAt(j) == ')')
				{
					right++;
				}
				if (left > right)
				{
					st2 = tangible.StringFunctions.changeCharacter(st2, j, '$');
					left--;
				}
			}
			for (int i = 0;i < len;i++)
			{
				if (st2.charAt(i) != '$' && st2.charAt(i) != '?')
				{
					st2 = tangible.StringFunctions.changeCharacter(st2, i, ' ');
				}
			}
			System.out.print(st);
			System.out.print("\n");
			System.out.print(st2);
			System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(st,0,100);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(st2,0,100);
		}
		return 0;
	}
}

