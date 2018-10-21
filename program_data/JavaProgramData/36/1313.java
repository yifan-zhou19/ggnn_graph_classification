package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int ans;
		int e;
		int lena;
		int lenb;
		int k;
		int i;
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
		lena = a.length();
		lenb = b.length();
		if (lena != lenb)
		{
			System.out.print("NO");
		}
		else
		{
			for (k = 1;k < lena;k++)
			{
				for (i = 0;i < lena - k;i++)
				{
					if (a.charAt(i) > a.charAt(i + 1))
					{
						e = a.charAt(i + 1);
						a = tangible.StringFunctions.changeCharacter(a, i + 1, a.charAt(i));
						a = tangible.StringFunctions.changeCharacter(a, i, e);
					}
				}
			}
			for (k = 1;k < lenb;k++)
			{
				for (i = 0;i < lenb - k;i++)
				{
					if (b.charAt(i) > b.charAt(i + 1))
					{
						e = b.charAt(i + 1);
						b = tangible.StringFunctions.changeCharacter(b, i + 1, b.charAt(i));
						b = tangible.StringFunctions.changeCharacter(b, i, e);
					}
				}
			}
			ans = strcmp(a,b);
			if (ans == 0)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
	}

}

