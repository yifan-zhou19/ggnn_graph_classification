package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int i;
		int j;
		int c;
		int d;
		int t;
		c = a.length();
		d = b.length();
		for (i = c - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (a.charAt(j) > a.charAt(j + 1))
				{
					t = a.charAt(j);
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
					a = tangible.StringFunctions.changeCharacter(a, j + 1, t);
				}
			}
		}
		for (i = d - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (b.charAt(j) > b.charAt(j + 1))
				{
					t = b.charAt(j);
					b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
					b = tangible.StringFunctions.changeCharacter(b, j + 1, t);
				}
			}
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}




	}


}

