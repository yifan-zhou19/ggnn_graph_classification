package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int len;
			int j;
			final String line = "";
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				line = tempVar2.charAt(0);
			}
			len = line.length();
			for (j = 0;j < len;j++)
			{
				switch (line.charAt(j))
				{
				case 'A':
					line = tangible.StringFunctions.changeCharacter(line, j, 'T');
					continue;
				case 'T':
					line = tangible.StringFunctions.changeCharacter(line, j, 'A');
					continue;
				case 'C':
					line = tangible.StringFunctions.changeCharacter(line, j, 'G');
					continue;
				case 'G':
					line = tangible.StringFunctions.changeCharacter(line, j, 'C');
					continue;
				}
			}
			System.out.printf("%s\n",line);
		}
	}
}

