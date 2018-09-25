package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int length;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		int i;
		String a = new String(new char[500]);
		for (i = 1;i <= n;i++)
		{
			a = new Scanner(System.in).nextLine();
			System.out.println(a);
			length = a.length();
			int j;
			for (j = length - 1;j >= 0;j--)
			{
				int judge = 0;
				if (a.charAt(j) != '(' && a.charAt(j) != ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, ' ');
				}
				else if (a.charAt(j) == '(')
				{
					for (k = j + 1;k < length;k++)
					{
						if (a.charAt(k) == ')')
						{
							a = tangible.StringFunctions.changeCharacter(a, k, ' ');
							a = tangible.StringFunctions.changeCharacter(a, j, ' ');
							judge = 1;
							break;
						}
					}
					if (judge == 0)
					{
						a = tangible.StringFunctions.changeCharacter(a, j, '$');
					}
				}
			}
			for (j = 0;j < length;j++)
			{
				if (a.charAt(j) == ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, '?');
				}
			}
			System.out.println(a);
		}
	}

}

