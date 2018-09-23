package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[200]);
		int i;
		int j;
		int k;
		int m;
		int n;
		int flag = 0;
		int[] left = new int[100];
		int l = 1;
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			System.out.print(str);
			System.out.print("\n");
			flag = 0;
			l = 1;
			for (n = 1;n < 100;n++)
			{
				left[n] = 0;
			}
			for (i = 0;str.charAt(i) != '\0';i++)
			{
				if (str.charAt(i) == '(')
				{
					left[l] = i;
					l++;
				}
				if (str.charAt(i) != '(' && str.charAt(i) != ')')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, ' ');
				}
			}
			for (j = l - 1;j >= 1;j--)
			{
				flag = 0;
				for (k = left[j] + 1;str.charAt(k) != '\0';k++)
				{
					if (str.charAt(k) == ')')
					{
						str = tangible.StringFunctions.changeCharacter(str, left[j], ' ');
						str = tangible.StringFunctions.changeCharacter(str, k, ' ');
						flag = 1;
						break;
					}
				}
				if (flag == 0)
				{
					str = tangible.StringFunctions.changeCharacter(str, left[j], '$');
				}
			}
			for (m = 0;str.charAt(m) != '\0';m++)
			{
				if (str.charAt(m) == ')')
				{
					str = tangible.StringFunctions.changeCharacter(str, m, '?');
				}
			}
			System.out.print(str);
			System.out.print("\n");
		}
		return 0;
	}
}

