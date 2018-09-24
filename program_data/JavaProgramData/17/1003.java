package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String a = new String(new char[101]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			System.out.printf("%s\n",a);
			for (i = a.length() - 2;i >= 0;i--)
			{
				if (a.charAt(i) == '(')
				{
					for (j = i + 1;j < a.length();j++)
					{
						if (a.charAt(j) == ')')
						{
							a = tangible.StringFunctions.changeCharacter(a, i, ' ');
							a = tangible.StringFunctions.changeCharacter(a, j, ' ');
	break;
						}
					}
				}

			}
			for (i = 0;i < a.length();i++)
			{
				if (a.charAt(i) == '(')
				{
					System.out.print('$');
				}
				else if (a.charAt(i) == ')')
				{
					System.out.print('?');
				}
				else
				{
					System.out.print(' ');
				}
			}
			System.out.print('\n');

		}
		return 0;
	}
}

