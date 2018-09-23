package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[200]);
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			System.out.printf("%s\n", a);
			int j;
			for (j = 0;j < a.length();j++)
			{
				if (a.charAt(j) == ')')
				{
					int s;
					for (s = j - 1;s >= 0;s--)
					{
						if (a.charAt(s) == '(')
						{
							a = tangible.StringFunctions.changeCharacter(a, s, ' ');
							a = tangible.StringFunctions.changeCharacter(a, j, ' ');
							break;
						}
					}
				}
			}
			for (j = 0;j < a.length();j++)
			{
				if (a.charAt(j) == ')')
				{
					System.out.print("?");
				}
				else if (a.charAt(j) == '(')
				{
					System.out.print("$");
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

