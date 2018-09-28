package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String jj = new String(new char[256]);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				jj = tempVar2.charAt(0);
			}
			l = jj.length();
			for (k = 0;k < l;k++)
			{
				if (jj.charAt(k) == 'A')
				{
					jj = tangible.StringFunctions.changeCharacter(jj, k, 'T');
					continue;
				}
				if (jj.charAt(k) == 'T')
				{
					jj = tangible.StringFunctions.changeCharacter(jj, k, 'A');
					continue;
				}
				if (jj.charAt(k) == 'C')
				{
					jj = tangible.StringFunctions.changeCharacter(jj, k, 'G');
					continue;
				}
				if (jj.charAt(k) == 'G')
				{
					jj = tangible.StringFunctions.changeCharacter(jj, k, 'C');
					continue;
				}
			}
			System.out.printf("%s\n",jj);
		}


	return 0;
	}



}

