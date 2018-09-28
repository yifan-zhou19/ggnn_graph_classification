package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[50]);
		String S = new String(new char[50]);
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			for (j = 0;s.charAt(j) != '\0';j++)
			{
				if ((s.charAt(j) == 'e' && s.charAt(j + 1) == 'r' && s.charAt(j + 2) == '\0') || (s.charAt(j) == 'l' && s.charAt(j + 1) == 'y' && s.charAt(j + 2) == '\0') || (s.charAt(j) == 'i' && s.charAt(j + 1) == 'n' && s.charAt(j + 2) == 'g' && s.charAt(j + 3) == '\0'))
				{
					S = tangible.StringFunctions.changeCharacter(S, j, '\0');
				}
				else
				{
					S = tangible.StringFunctions.changeCharacter(S, j, s.charAt(j));
				}
			}
			System.out.printf("%s\n",S);
		}


	}
}

