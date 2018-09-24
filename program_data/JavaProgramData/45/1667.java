package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String part = new String(new char[50]);
		String full = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			part = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			full = tempVar2.charAt(0);
		}
		int partlen = part.length();
		int fulllen = full.length();
		int which = 0;
		int end = fulllen - partlen;

		int i;
		int j;
		for (i = 0; i <= end; i++)
		{
			int yes = 1;
			for (j = 0; j < partlen; j++)
			{
				if (full.charAt(i + j) != part.charAt(j))
				{
					yes = 0;
				}
			}
			if (yes == 1)
			{
				which = i;
				break;
			}

		}

		System.out.printf("%d",which);

		return 0;
	}

}

