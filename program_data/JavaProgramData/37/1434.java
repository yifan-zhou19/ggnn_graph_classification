package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int len;
		int flag;
		int mark;
		int judge;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String str = new String(new char[100000]);
		char outcome;
		for (i = 0; i < n; i++)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = str.length();
			flag = 0;
			for (j = 0; j < len - 1; j++)
			{
				if (str.charAt(j) != '\0')
				{
					for (k = j + 1; k < len; k++)
					{
						if (str.charAt(j) == str.charAt(k))
						{
							str = tangible.StringFunctions.changeCharacter(str, j, '\0');
							str = tangible.StringFunctions.changeCharacter(str, k, '\0');
							break;
						} // end if
					} // end for
				} // end if
			} // end for
			for (k = 0; k < len; k++)
			{
				if (str.charAt(k) != '\0')
				{
					outcome = str.charAt(k);
					break;
				}
				if (k == len - 1)
				{
					flag = 1;
				}
			}
			if (flag == 0)
			{
				System.out.print(outcome);
				System.out.print("\n");
			}
			else
			{
				System.out.print("no");
			}
			if (i != n - 1)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}

}

