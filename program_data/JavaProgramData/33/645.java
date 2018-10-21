package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int l;
		String yuan = new String(new char[256]);
		String bu = new String(new char[256]);
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
				yuan = tempVar2.charAt(0);
			}
			l = yuan.length();
			for (j = 0;j <= l;j++)
			{
				if (yuan.charAt(j) == 'A')
				{
				   bu = tangible.StringFunctions.changeCharacter(bu, j, 'T');
				}
				else if (yuan.charAt(j) == 'T')
				{
				   bu = tangible.StringFunctions.changeCharacter(bu, j, 'A');
				}
				else if (yuan.charAt(j) == 'C')
				{
				   bu = tangible.StringFunctions.changeCharacter(bu, j, 'G');
				}
				else if (yuan.charAt(j) == 'G')
				{
				   bu = tangible.StringFunctions.changeCharacter(bu, j, 'C');
				}
				else
				{
					bu = tangible.StringFunctions.changeCharacter(bu, j, yuan.charAt(j));
				}
			}
			System.out.println(bu);
		}
		return 0;
	}
}

