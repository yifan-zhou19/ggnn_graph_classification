package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String line = new String(new char[101]);
		int[] left = new int[100]; //left?right???????????????
		int[] right = new int[100];
		while ((line = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			int i;
			int k1 = 0;
			int k2 = 0;
			for (i = 0;i < line.length();i++)
			{
				if (line.charAt(i) == '(')
				{
					left[k1] = i;
					k1++;
				} //????????
				if (line.charAt(i) == ')')
				{
					if (k1 != 0)
					{
						left[k1 - 1] = 0;
						k1--;
					} //????????????????????
					else
					{
						right[k2] = i;
						k2++;
					}
				}
			}
			String ans = new String(new char[101]);
			for (i = 0;i < line.length();i++)
			{
				ans = tangible.StringFunctions.changeCharacter(ans, i, ' ');
			}
			ans = tangible.StringFunctions.changeCharacter(ans, line.length(), '\0'); //?????????????????
			for (i = 0;i < k1;i++)
			{
				ans = tangible.StringFunctions.changeCharacter(ans, left[i], '$');
			}
			for (i = 0;i < k2;i++)
			{
				ans = tangible.StringFunctions.changeCharacter(ans, right[i], '?');
			} //??????????
			System.out.print(line);
			System.out.print("\n");
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}
}

