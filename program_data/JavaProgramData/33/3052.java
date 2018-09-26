package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int i;
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int s4 = 0;
		String m = new String(new char[1000]);
		String t = new String(new char[1000]);
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
				m = tempVar2.charAt(0);
			}
			t = m;
			for (b = 0;b < (m.length());b++)
			{
				if (m.charAt(b) == 'A')
				{
					t = tangible.StringFunctions.changeCharacter(t, b, 'T');
				}
				if (m.charAt(b) == 'T')
				{
					t = tangible.StringFunctions.changeCharacter(t, b, 'A');
				}
				if (m.charAt(b) == 'C')
				{
					t = tangible.StringFunctions.changeCharacter(t, b, 'G');
				}
				if (m.charAt(b) == 'G')
				{
					t = tangible.StringFunctions.changeCharacter(t, b, 'C');
				}
			}
			System.out.printf("%s\n",t);
		}
		return 0;
	}


}

