package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String shuzu = new String(new char[300]);
		String tmp;
		String tmpa;
		String tmpt;
		String tmpc;
		String tmpg;
		int n;
		int i;
		int j;
		int pp;
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
				shuzu = tempVar2.charAt(0);
			}
			pp = shuzu.length();
			for (j = 0;j < pp;j++)
			{
						if (shuzu.charAt(j) == 'A')
						{
							shuzu = tangible.StringFunctions.changeCharacter(shuzu, j, 'T');
						}

						else if (shuzu.charAt(j) == 'T')
						{
							shuzu = tangible.StringFunctions.changeCharacter(shuzu, j, 'A');
						}
						   else if (shuzu.charAt(j) == 'C')
						   {
							   shuzu = tangible.StringFunctions.changeCharacter(shuzu, j, 'G');
						   }
						else if (shuzu.charAt(j) == 'G')
						{
							shuzu = tangible.StringFunctions.changeCharacter(shuzu, j, 'C');
						}
			}
			System.out.printf("%s\n",shuzu);
		}
		return 0;
	}

}

