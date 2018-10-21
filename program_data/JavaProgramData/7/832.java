package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[256]);
		String sub = new String(new char[256]);
		String rep = new String(new char[256]);
		String sz = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sub = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			rep = tempVar3.charAt(0);
		}
		int a;
		int b;
		int c;
		int tag;
		a = sub.length();
		c = str.length();
		int i;
		int j;
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			tag = 0;
			if (str.charAt(i) == sub.charAt(0))
			{
				for (j = 0;j < a;j++)
				{
					sz = tangible.StringFunctions.changeCharacter(sz, j, str.charAt(i + j));
				}
				sz = tangible.StringFunctions.changeCharacter(sz, a, '\0');
			}
			if (strcmp(sz,sub) == 0)
			{
				b = i;
				sub = rep;
				tag = 1;
				break;
			}
		}
		if (tag == 1)
		{
			for (i = 0;i < b;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.printf("%s",sub);
			for (i = b + a;i < c;i++)
			{
				 System.out.printf("%c",str.charAt(i));
			}
		}
		else
		{
			System.out.printf("%s",str);
		}
		return 0;
	}

}

