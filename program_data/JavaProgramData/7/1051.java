package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
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
		int lenth1;
		int lenth2;
		int i;
		int j;
		int t;
		lenth1 = a.length();
		lenth2 = b.length();
		for (i = 0;i <= lenth1 - 1;i++)
		{
			t = i;
			for (j = 0;j <= lenth2 - 1;)
			{

				if (a.charAt(t) == b.charAt(j))
				{
					t = t + 1;
					j = j + 1;

				}
				else
				{
					break;
				}

			}
			if (j == lenth2)
			{
				break;
			}
		}
		for (j = 0;j < lenth2;j++,i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, c.charAt(j));
		}
		for (i = 0;i < lenth1;i++)
		{
		System.out.printf("%c",a.charAt(i));
		}
	}
}

