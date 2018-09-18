package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[200]);
		while (scanf("%s",str) != EOF)
		{
			int n;
			int i;
			int j;
			int k;
			System.out.printf("%s\n",str);
			n = str.length();
			for (i = 0,k = 0;i < n;i++)
			{
				if (str.charAt(i) == '(')
				{
					k = i;
				}
				if (str.charAt(i) == ')' && str.charAt(k) == '(')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, ' ');
					str = tangible.StringFunctions.changeCharacter(str, k, ' ');
					i = -1;
					k = 0;
				}
			}
			for (i = 0;i < n;i++)
			{
				if (str.charAt(i) != '(' && str.charAt(i) != ')')
				{
					System.out.print(" ");
				}
				else
				{
					if (str.charAt(i) == '(')
					{
						System.out.print("$");
					}
					else
					{
						System.out.print("?");
					}
				}
			}
			System.out.print("\n");
		}
	}



}

