package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		int n;
		int i;
		int j;
		int l;
		int k = 0;
		String c = new String(new char[101]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			int left = 0;
			int right = 0;
			int[] e = new int[101];
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = str.length();
			for (j = 0;j < l;j++)
			{
				if (str.charAt(j) == '(')
				{
					left++;
					e[j] = 1;
					c = tangible.StringFunctions.changeCharacter(c, left, j);
				}
				if (str.charAt(j) == ')')
				{
					if (left == 0)
					{
						e[j] = 2;
					}
					else
					{
						e[c.charAt(left)] = 0;
						left--;
					}
				}
				else
				{
					continue;
				}
			}
			System.out.print(str);
			System.out.print("\n");
			for (j = 0;j < l;j++)
			{
				if (e[j] == 1)
				{
					System.out.print("$");
				}
				else if (e[j] == 2)
				{
					System.out.print("?");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

