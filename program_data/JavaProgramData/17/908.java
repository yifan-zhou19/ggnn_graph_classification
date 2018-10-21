package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] left = new int[102];
		int len;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		String str = new String(new char[102]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			k = 0;
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			System.out.print(str);
			System.out.print("\n");
			len = str.length();
			p = str;
			for (; p < str.Substring(len); p++)
			{
				if (*p != '(' && *p != ')')
				{
					*p = ' ';
				}
			}
			for (j = 0; j < len; j++)
			{
				if (str.charAt(j) == '(')
				{
					k++;
					left[k] = j;
				}
				if (str.charAt(j) == ')')
				{
					if (k == 0)
					{
						str = tangible.StringFunctions.changeCharacter(str, j, '?');
					}
					else
					{
						left[k] = -1;
						k--;
					}
				}
			}
			if (k == 0)
			{
				for (j = 0; j < len; j++)
				{
					if (str.charAt(j) != '?')
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print(str.charAt(j));
					}
				}
				System.out.print("\n");
			}
			else
			{
				for (; k > 0; k--)
				{
					str = tangible.StringFunctions.changeCharacter(str, left[k], '$');
				}
				for (j = 0; j < len; j++)
				{
					if (str.charAt(j) != '?' && str.charAt(j) != '$')
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print(str.charAt(j));
					}
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}

