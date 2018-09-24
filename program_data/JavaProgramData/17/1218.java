package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int left = 0;
		int right = 0;
		int times = 0;
		int i;
		String s = new String(new char[101]);
		String c = new String(new char[101]);
		String fakes = new String(new char[101]);

		for (times = 0; times == 0;i = 0,left = 0,right = 0)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s = tempVar.charAt(0);
			}
			if (strcmp(fakes, s) == 0 && fakes.length() == s.length())
			{
				break;
			}
			for (i = 0; s.charAt(i) != '\0'; i++)
			{
				if (s.charAt(i) == '(')
				{
					left++;
				}
				if (s.charAt(i) == ')' && left > 0)
				{
					left--;
				}
				else
				{
				if (s.charAt(i) == ')' && left == 0)
				{
					c = tangible.StringFunctions.changeCharacter(c, i, '?');
				}
				}
			}
			for (; i >= 0; i--)
			{
				if (s.charAt(i) == ')')
				{
					right++;
				}
				if (s.charAt(i) == '(' && right > 0)
				{
					right--;
				}
				else
				{
				if (s.charAt(i) == '(' && right == 0)
				{
					c = tangible.StringFunctions.changeCharacter(c, i, '$');
				}
				}
			}
			System.out.println(s);
			System.out.print("\n");
			for (i = 0; s.charAt(i) != '\0'; i++)
			{
				if (c.charAt(i) == '?' || c.charAt(i) == '$')
				{
					System.out.printf("%c",c.charAt(i));
					c = c.substring(0, i);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
			fakes = s;
		}
		return 0;
	}

}

