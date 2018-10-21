package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int LEN;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String zf = new String(new char[33]);
		String jg = new String(new char[33]);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zf = tempVar2.charAt(0);
			}
			LEN = zf.length();
			for (j = 0;j < LEN;j++)
			{
				if (j == LEN - 3 && zf.charAt(j + 2) == 'g')
				{
					zf = zf.substring(0, j);
					zf = zf.substring(0, j + 1);
					zf = zf.substring(0, j + 2);
					break;
				}
				else if ((j == LEN - 2 && zf.charAt(j + 1) == 'y') || (j == LEN - 2 && zf.charAt(j + 1) == 'r'))
				{
					zf = zf.substring(0, j);
					zf = zf.substring(0, j + 1);
					break;
				}
			}
			LEN = zf.length();
			for (j = 0;j < LEN;j++)
			{
				if (zf.charAt(j) != 0)
				{
					jg = tangible.StringFunctions.changeCharacter(jg, j, zf.charAt(j));
				}
			}
			jg = tangible.StringFunctions.changeCharacter(jg, j, '\0');
			System.out.printf("%s\n",jg);
			for (j = 0;j < LEN;j++)
			{
				jg = jg.substring(0, j);
			}
		}
		return 0;
	}
}

