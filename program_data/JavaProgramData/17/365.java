package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  while (!cin.eof())
	  {
		String str = new String(new char[MAX]);
		String ans = new String(new char[MAX]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ans,0,(Character.SIZE / Byte.SIZE));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);

		for (int i = 0;i < str.length();i++)
		{
			ans = tangible.StringFunctions.changeCharacter(ans, i, ' ');
		}

		int sign = 0;
		for (int i = 0;i < str.length();i++)
		{
		  if (str.charAt(i) == '(')
		  {

		sign++;
		ans = tangible.StringFunctions.changeCharacter(ans, i, sign + '0');
		  }
		  else if (str.charAt(i) == ')')
		  {
		if (sign > 0)
		{
		  ans = tangible.StringFunctions.changeCharacter(ans, i, sign + '0');
		  sign--;
		}
		else
		{
			ans = tangible.StringFunctions.changeCharacter(ans, i, '?');
		}
		  }
		}
		for (int i = 0;i < str.length();i++)
		{
		  if (ans.charAt(i) != ' ' && str.charAt(i) == '(')
		  {
		int ok = 0;
		int j;
		for (j = i + 1;j < str.length();j++)
		{
		  if (ans.charAt(j) == ans.charAt(i))
		  {
			ok = 1;
			break;
		  }
		}
		if (ok == 0)
		{
			ans = tangible.StringFunctions.changeCharacter(ans, i, '$');
		}
		else
		{
			ans = tangible.StringFunctions.changeCharacter(ans, i, ans[j] = ' ');
		}
		  }
		}
		ans = tangible.StringFunctions.changeCharacter(ans, str.length(), '\0');
		System.out.print(str);
		System.out.print("\n");
		System.out.print(ans);
		System.out.print("\n");
	  }
	  return 0;
	}

}

