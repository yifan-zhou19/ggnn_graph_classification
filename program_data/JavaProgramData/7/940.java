package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[256]);
		String wt = new String(new char[256]);
		String tar = new String(new char[256]);
		int i;
		int j;
		int tag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			wt = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			tar = tempVar3.charAt(0);
		}
		int n = zfc.length();
		int k = wt.length();
		for (i = 0;i < n - k + 1;i++)
		{
			tag = 0;
			for (j = i;j < i + k;j++)
			{
				if (zfc.charAt(j) != wt.charAt(j - i))
				{
					tag = 1;
					break;
				}
			}
			if (tag == 0)
			{
				for (j = i;j < i + k;j++)
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, j, tar.charAt(j - i));
				}
				break;
			}
		}
		System.out.println(zfc);

		return 0;
	}



}

