package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch1 = new String(new char[100]);
		String ch2 = new String(new char[100]);
		ch1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		ch2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int j;
		int len1 = ch1.length();
		int len2 = ch2.length();
		int len = len1;
		int[] judge = new int[len - 1];
		int ijudge = 1;
		int ij = 0;
		if (len1 != len2)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			for (i = 0;i < len;i++)
			{
				ij = 0;
				for (j = 0;j < len;j++)
				{
					if (ch1.charAt(i) == ch2.charAt(j))
					{
						ij = 1;
						judge[i] = 1;
						ch1 = tangible.StringFunctions.changeCharacter(ch1, i, '&');
						ch2 = tangible.StringFunctions.changeCharacter(ch2, j, '&');
					}
				}
				if (ij == 0)
				{
					judge[i] = 0;
				}
			}
			for (i = 0;i < len;i++)
			{
				if (judge[i] == 0)
				{
					ijudge = 0;
					break;
				}
			}
			if (ijudge == 1)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}

		return 0;
	}

}

