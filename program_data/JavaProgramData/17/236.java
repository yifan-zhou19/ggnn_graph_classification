package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		while (gets(a))
		{
			System.out.printf("%s\n",a);
			int l = a.length();
			int i;
			int j;
			int flag = 1;
			while (flag == 1)
			{
			flag = 0;
			for (i = 0;i < l;i++)
			{
				if (a.charAt(i) == '(')
				{
					for (j = i + 1;j < l;j++)
					{
						if (a.charAt(j) == ')')
						{
							a = tangible.StringFunctions.changeCharacter(a, i, 'a');
							a = tangible.StringFunctions.changeCharacter(a, j, 'a');
							flag = 1;
							break;
						}
						if (a.charAt(j) == '(')
						{
							i = j;
						}
					}
					if (flag == 1)
					{
						break;
					}
				}
			}
			}
			for (i = 0;i < l;i++)
			{
				if (a.charAt(i) == '(')
				{
					System.out.print("$");
				}
				else if (a.charAt(i) == ')')
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
	}
}

