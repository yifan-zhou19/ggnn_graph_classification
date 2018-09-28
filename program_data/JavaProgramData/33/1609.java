package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
		String a = new String(new char[MAX + 1]);
		String b = new String(new char[MAX + 1]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
			for (j = 0;a.charAt(j);j++)
			{
			  switch (a.charAt(j))
			  {
					case'A':
					b = tangible.StringFunctions.changeCharacter(b, j, 'T');
					break;
					case'T':
					b = tangible.StringFunctions.changeCharacter(b, j, 'A');
					break;
					case'G':
					b = tangible.StringFunctions.changeCharacter(b, j, 'C');
					break;
					case'C':
					b = tangible.StringFunctions.changeCharacter(b, j, 'G');
					break;
					default:
						b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(j));
					break;
			  }
			}
		  b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(j));
		  System.out.printf("%s\n", b);
		}
		return 0;
	}



}

