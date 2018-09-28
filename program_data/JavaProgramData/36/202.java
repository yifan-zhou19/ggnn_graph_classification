package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int an;
		int bn;
		int i;
		int j;
		int r = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		an = a.length();
		bn = b.length();
		if (an != bn)
		{
			r = 1;
		}
		for (i = 0;i < bn;i++)
		{
			int is = 0;
			for (j = 0;j < an;j++)
			{
				if (b.charAt(i) == a.charAt(j) && (b.charAt(i) != 1 && a.charAt(j) != 1))
				{
				is = 1;
				b = tangible.StringFunctions.changeCharacter(b, i, 1);
				a = tangible.StringFunctions.changeCharacter(a, j, 1);
				}
			}
			if (is == 0)
			{
				r = 1;
			}
		}

		if (r == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}

}

