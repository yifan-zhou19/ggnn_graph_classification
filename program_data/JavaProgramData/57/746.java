package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		int p;
		int q;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String A = new String(new char[20]);
		final String a = "er";
		final String b = "ly";
		final String c = "ing";
		String d = new String(new char[3]);
		String e = new String(new char[4]);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A = tempVar2.charAt(0);
			}
			m = A.length();
			d = tangible.StringFunctions.changeCharacter(d, 0, A.charAt(m - 2));
			d = tangible.StringFunctions.changeCharacter(d, 1, A.charAt(m - 1));
			d = tangible.StringFunctions.changeCharacter(d, 2, '\0');
			e = tangible.StringFunctions.changeCharacter(e, 0, A.charAt(m - 3));
			e = tangible.StringFunctions.changeCharacter(e, 1, A.charAt(m - 2));
			e = tangible.StringFunctions.changeCharacter(e, 2, A.charAt(m - 1));
			e = tangible.StringFunctions.changeCharacter(e, 3, '\0');
			p = strcmp(d,a);
			q = strcmp(d,b);
			t = strcmp(e,c);
			if (p == 0 || q == 0)
			{
				A = tangible.StringFunctions.changeCharacter(A, m - 2, '\0');
				System.out.printf("%s\n",A);
			}
			 else if (t == 0)
			 {
				 A = tangible.StringFunctions.changeCharacter(A, m - 3, '\0');
				System.out.printf("%s\n",A);
			 }
			else
			{
				System.out.printf("%s\n",A);
			}
			for (j = 0;j < 20;j++)
			{
				A = A.substring(0, j);
			}


		}
		return 0;

	}

}

