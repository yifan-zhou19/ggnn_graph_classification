package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
		int i;
		int j;
		int n = 0;
		int lena;
		int lenb;
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
			if (b.charAt(0) == a.charAt(i))
			{
				for (j = 0;j < lenb;j++)
				{
					if (b.charAt(j) == a.charAt(i + j))
					{
						n++;
					}
				}
			}
			if (n == lenb)
			{
				break;
			}
			else
			{
				n = 0;
			}
		}
		if (i < lena)
		{
			for (j = 0;j < lenb;j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i + j, c.charAt(j));
			}
		}
		System.out.printf("%s",a);
	}

}

