package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int tmp1;
		int tmp2 = 1;
		do
		{
				String s = new String(new char[101]);
			String st = new String(new char[101]);
			String r1 = new String(new char[101]);
			int[] r2 = new int[101];
			int d;
			int f = 0;
			int pi = 0;
			if (scanf("%s",s) != EOF)
			{
				f = 1;
			d = s.length();
			st = s;
			for (j = 0;j < d;j++)
			{
				if (pi == 0 && (s.charAt(j) == '(' || s.charAt(j) == ')'))
				{
						r1 = tangible.StringFunctions.changeCharacter(r1, 0, s.charAt(j));
						r2[0] = j;
						pi += 1;
				}
				else if ((s.charAt(j) == '(' || s.charAt(j) == ')'))
				{
					if (r1.charAt(pi - 1) == '(' && s.charAt(j) == ')')
					{
							s = tangible.StringFunctions.changeCharacter(s, r2[pi - 1], ' ');
							s = tangible.StringFunctions.changeCharacter(s, j, ' ');
							pi -= 1;
					}
					else
					{
						r1 = tangible.StringFunctions.changeCharacter(r1, pi, s.charAt(j));
						r2[pi] = j;
						pi += 1;
					}
				}
				else
				{
					s = tangible.StringFunctions.changeCharacter(s, j, ' ');
				}


			}
			for (j = 0;j < pi;j++)
			{
					if (r1.charAt(j) == '(')
					{
					s = tangible.StringFunctions.changeCharacter(s, r2[j], '$');
					}
					else
					{
						s = tangible.StringFunctions.changeCharacter(s, r2[j], '?');
					}
			}
			System.out.printf("%s\n%s\n",st,s);
			}
			else
			{
				break;
			}
		}while (tmp2 != 0);



		return 0;
	}
}

