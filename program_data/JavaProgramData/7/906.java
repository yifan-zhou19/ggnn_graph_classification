package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[300]);
		String sub = new String(new char[300]);
		String rep = new String(new char[300]);
		String tmp = new String(new char[300]);
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
		int i;
		int j;
		int l1 = str.length();
		int l2 = sub.length();
		int l3 = rep.length();
		int flag = 0;
		for (i = 0;i < l1;i++)
		{
			for (j = 0;j < l2;j++)
			{
				tmp = tangible.StringFunctions.changeCharacter(tmp, j, str.charAt(j + i));
			}
			tmp = tangible.StringFunctions.changeCharacter(tmp, l2, '\0');
			if (strcmp(tmp,sub) == 0 && flag == 0)
			{
				System.out.printf("%s",rep);
				flag = 1;
				i += l2 - 1;
			}
			else
			{
				System.out.printf("%c",str.charAt(i));
			}
		}
		System.out.print("\n");
	}
}

