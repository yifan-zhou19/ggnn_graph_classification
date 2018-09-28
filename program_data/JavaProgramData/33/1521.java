package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int t;
		int c;
		char A;
		char T;
		char C;
		char G;
		String jj = new String(new char[500]);
		String pd = new String(new char[500]);
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
				jj = tempVar2.charAt(0);
			}
			t = jj.length();
			//printf("%d",t);
			for (c = 0;c < t;c++)
			{
				if (jj.charAt(c) == 'A')
				{
					pd = tangible.StringFunctions.changeCharacter(pd, c, 'T');
				}
				else if (jj.charAt(c) == 'T')
				{
					pd = tangible.StringFunctions.changeCharacter(pd, c, 'A');
				}
				else if (jj.charAt(c) == 'C')
				{
					pd = tangible.StringFunctions.changeCharacter(pd, c, 'G');
				}
				else if (jj.charAt(c) == 'G')
				{
					pd = tangible.StringFunctions.changeCharacter(pd, c, 'C');
				}
			}
			pd = tangible.StringFunctions.changeCharacter(pd, t, '\0');
			System.out.printf("%s\n",pd);
		}
		return 0;
	}


}

