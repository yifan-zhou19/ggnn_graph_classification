package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String temp = new String(new char[100]);
		int i;
		int j = 0;
		int k;
		int lena;
		int lenb;
		int mark = 0;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		lena = a.length();
		lenb = b.length();

		for (i = 0;i < lena;i++)
		{
			if (a.charAt(i) == b.charAt(0))
			{
				for (j = 1;j < lenb;j++)
				{
					if (a.charAt(i + j) == b.charAt(j))
					{
						mark = 1;
					}
					else
					{
						mark = 0;
						break;
					}
				}
			}
			if (mark == 1)
			{
				for (k = 0;k < lenb;k++)
				{
					a = tangible.StringFunctions.changeCharacter(a, i + k, c.charAt(k));
				}
				break;
			}
		}
		for (i = 0;i < lena;i++)
		{
			System.out.printf("%c",a.charAt(i));

		}
	}

}

