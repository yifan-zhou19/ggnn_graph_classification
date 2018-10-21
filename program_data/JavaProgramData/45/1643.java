package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String e = new String(new char[256]);
		String all = new String(new char[256]);
		String sub = new String(new char[256]);
		String rep = new String(new char[256]);
		int la;
		int ls;
		int lr;
		int i;
		int j;
		int n = 100;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sub = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			all = tempVar2.charAt(0);
		}
		la = all.length();
		ls = sub.length();
		lr = rep.length();
		for (i = 0;i < la - ls + 1;i++)
		{
			e = all;
			for (j = 0;j < ls;j++)
			{
				e = tangible.StringFunctions.changeCharacter(e, i + j, sub.charAt(j));
			}
			if (strcmp(e,all) == 0)
			{
				n = i;
				break;
			}
		}
		System.out.printf("%d",n);

		return 0;
	}
}

