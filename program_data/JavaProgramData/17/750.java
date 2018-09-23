package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s = "";
		char a;
		int i;
		int j;
		int k;
		int count;
		int cleft;
		int cright;
		i = j = 0;
		while ((a = System.in.read()) != EOF) //????? ??????????
		{
			if (a != '\n')
			{
				s.charAt(i)[j] = a;
				j++;
			}
			else if (a == '\n')
			{
				i++;
				j = 0;
			}
		}
		count = i; //???????
		cleft = cright = 0; //????????????
		for (i = 0;i < count;i++)
		{
				System.out.print(s.charAt(i));
				System.out.print("\n");
			for (j = 0;j < String.valueOf(s.charAt(i)).length();j++) //????????
			{
				if (s.charAt(i)[j] == '(')
				{
					cleft += 1;
				}
				else if (s.charAt(i)[j] == ')')
				{
					cright += 1;
				}
				if (cright > cleft)
				{
						s.charAt(i)[j] = '?';
					cright -= 1; //??????cright?1????????????
				}

			}
			cleft = cright = 0; //?????????????
			for (j = String.valueOf(s.charAt(i)).length() - 1;j >= 0;j--)
			{
				if (s.charAt(i)[j] == '(')
				{
					cleft += 1;
				}
				else if (s.charAt(i)[j] == ')')
				{
					cright += 1;
				}
				if (cright < cleft)
				{
						s.charAt(i)[j] = '$';
					cleft -= 1; //??????cleft?1????????????
				}
			}
			for (j = 0;j < String.valueOf(s.charAt(i)).length();j++)
			{
				if (s.charAt(i)[j] != '?' && s.charAt(i)[j] != '$')
				{
					s.charAt(i)[j] = ' ';
				}
			}
			if (i == count - 1)
			{
			System.out.print(s.charAt(i));
			}
			else
			{
				System.out.print(s.charAt(i));
				System.out.print("\n");
			}
		}

	return 0;

	}


}
