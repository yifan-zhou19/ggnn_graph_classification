package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String kid = new String(new char[101]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		kid = tempVar.charAt(0);
	}
	int[][] zuhe = new int[51][2];
	char sigb;
	int i;
	int j = 0;
	int p;
	sigb = kid.charAt(0);
	for (i = 0;i < kid.length();i++)
	{
		if (kid.charAt(i) != sigb)
		{
			zuhe[j][1] = i;
			j++;
		}
	}
	for (j = 0;j < kid.length() / 2;j++)
	{
		p = zuhe[j][1] - 1;
		while (kid.charAt(p) != sigb)
		{
				p--;
		}
		zuhe[j][0] = p;
		kid = tangible.StringFunctions.changeCharacter(kid, p, '0');
	}
	for (j = 0;j < kid.length() / 2;j++)
	{
		System.out.printf("%d %d\n",zuhe[j][0],zuhe[j][1]);
	}
	return 0;
	}
}

