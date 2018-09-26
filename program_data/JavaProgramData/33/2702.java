package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		String line = new String(new char[257]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				line = tempVar2.charAt(0);
			}
			l = line.length();
			for (j = 0;j < l;j++)
			{
				if (line.charAt(j) == 'A')
				{
					line = tangible.StringFunctions.changeCharacter(line, j, 'T');
				}
				else if (line.charAt(j) == 'T')
				{
					line = tangible.StringFunctions.changeCharacter(line, j, 'A');
				}
				else if (line.charAt(j) == 'G')
				{
					line = tangible.StringFunctions.changeCharacter(line, j, 'C');
				}
				else if (line.charAt(j) == 'C')
				{
					line = tangible.StringFunctions.changeCharacter(line, j, 'G');
				}
			}
			System.out.printf("%s\n",line);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			line = tempVar3.charAt(0);
		}
		l = line.length();
		for (j = 0;j < l;j++)
		{
			if (line.charAt(j) == 'A')
			{
				line = tangible.StringFunctions.changeCharacter(line, j, 'T');
			}
			else if (line.charAt(j) == 'T')
			{
				line = tangible.StringFunctions.changeCharacter(line, j, 'A');
			}
			else if (line.charAt(j) == 'G')
			{
				line = tangible.StringFunctions.changeCharacter(line, j, 'C');
			}
			else if (line.charAt(j) == 'C')
			{
				line = tangible.StringFunctions.changeCharacter(line, j, 'G');
			}
		}
		System.out.printf("%s",line);

		return 0;
	}
}

