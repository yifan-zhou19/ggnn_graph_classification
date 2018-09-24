package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String ys = new String(new char[1000]);
		String hc = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ys = tempVar2.charAt(0);
			}
			for (j = 0;j < 1000;j++)
			{
				if (ys.charAt(j) == '\0')
				{
					hc = tangible.StringFunctions.changeCharacter(hc, j, '\0');
				}
				switch (ys.charAt(j))
				{
					case 'G':
					hc = tangible.StringFunctions.changeCharacter(hc, j, 'C');
					break;
					case 'C':
					hc = tangible.StringFunctions.changeCharacter(hc, j, 'G');
					break;
					case 'A':
					hc = tangible.StringFunctions.changeCharacter(hc, j, 'T');
					break;
					case 'T':
					hc = tangible.StringFunctions.changeCharacter(hc, j, 'A');
					break;
				}
			}
			System.out.println(hc);
		}
		return 0;
	}
}

