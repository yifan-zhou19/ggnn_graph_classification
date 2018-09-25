package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char p;
		String a = new String(new char[100005]);
		String b = new String(new char[100005]);
		int count = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			p = tempVar.charAt(0);
		}
		while (p != '\n')
		{
			a = tangible.StringFunctions.changeCharacter(a, count, p);
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				p = tempVar2.charAt(0);
			}
			count++;
		}
		for (i = 1;i <= count - 1;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i - 1, a.charAt(i - 1) + a.charAt(i));
		}
		b = tangible.StringFunctions.changeCharacter(b, count - 1, a.charAt(count - 1) + a.charAt(0));
		System.out.printf("%s",b);
	}
}

