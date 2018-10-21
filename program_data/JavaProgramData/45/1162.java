package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[MAX]);
		String word = new String(new char[MAX]);
		int i;
		int j;
		int Match;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			word = tempVar2.charAt(0);
		}
		for (i = 0; word.charAt(i) != '\0'; i++)
		{
			Match = 0;
			for (j = 0;zfc.charAt(j - 1) != '\0';j++)
			{
				if (zfc.charAt(j) == '\0')
				{
					Match = 1;
					break;
				}

				if (zfc.charAt(j) != word.charAt(i + j))
				{
					break;
				}
			}

			if (Match == 1)
			{
				System.out.printf("%d",i);
				break;
			}
		}
		return 0;
	}
}

