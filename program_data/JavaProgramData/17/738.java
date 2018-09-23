package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int left;
		final String s = "";
		final String t = "";
		int[] num = new int[102];
		while (scanf("%s",s) != EOF)
		{
			System.out.printf("%s\n",s);
			k = s.length();
			left = 0;
			for (i = 0;i <= k - 1;i++)
			{
				switch (s.charAt(i))
				{
				case 40:
				{
					left = left + 1;
					num[left] = i;
					t = tangible.StringFunctions.changeCharacter(t, i, '$');
					break;
				}
				case 41:
				{
					if (left != 0)
					{
						t = tangible.StringFunctions.changeCharacter(t, num[left], 32);
						t = tangible.StringFunctions.changeCharacter(t, i, 32);
						left = left - 1;
					}
					else
					{
						t = tangible.StringFunctions.changeCharacter(t, i, '?');
					}
					break;
				}
				default:
				{
					t = tangible.StringFunctions.changeCharacter(t, i, 32);
					break;
				}
				}
			}
			for (i = 0;i <= k - 1;i++)
			{
				System.out.printf("%c",t.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

