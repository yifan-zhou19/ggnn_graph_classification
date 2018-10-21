package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ans = new String(new char[101]);
		String a = new String(new char[101]);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 0)
		{
			a = new Scanner(System.in).nextLine();
			int ll = a.length();
			int[] bb = new int[101];
			int be;
			be = -1;
			int i = 0;
			while (i < ll)
			{
				while (a.charAt(i) != '(' && a.charAt(i) != ')')
				{
					ans = tangible.StringFunctions.changeCharacter(ans, i, ' ');
					i++;
					if (i >= ll)
					{
						break;
					}
				}
				if (a.charAt(i) == '(')
				{
					bb[i + 1] = be;
					be = i + 1;
				}
				if (a.charAt(i) == ')')
				{
					if (be < 0)
					{
						ans = tangible.StringFunctions.changeCharacter(ans, i, '?');
					}
					else
					{
						int t;
						t = bb[be];
						bb[be] = 0;
						be = t;
						ans = tangible.StringFunctions.changeCharacter(ans, i, ' ');
					}
				}
				i++;
			}
			for (i = 0;i < ll;i++)
			{
				if (a.charAt(i) == '(')
				{
					if (bb[i + 1] == 0)
					{
						ans = tangible.StringFunctions.changeCharacter(ans, i, ' ');
					}
					else
					{
						ans = tangible.StringFunctions.changeCharacter(ans, i, '$');
					}
				}
			}
			for (i = 0;i < ll;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			System.out.print("\n");
			for (i = 0;i < ll;i++)
			{
				System.out.printf("%c",ans.charAt(i));
			}
			System.out.print("\n");
			n--;
		}
		return 0;
	}
}

