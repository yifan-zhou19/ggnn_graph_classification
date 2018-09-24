package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[257]);
		String sub = new String(new char[257]);
		String rep = new String(new char[257]);
		int i;
		int r1;
		int r2;
		int r3;
		int j;
		int q;
		int h = 0;
		int result = 0;
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
		r1 = str.length();
		r2 = sub.length();
		r3 = rep.length();
		for (i = 0;i < r1;i++)
		{
			if (str.charAt(i) == sub.charAt(0))
			{
				for (j = 0;j < r2;j++)
				{
					if (str.charAt(i + j) != sub.charAt(j))
					{
						break;
					}
				}
				if (j == r2)
				{
					result = 1;
					for (q = i;q < i + r3;q++)
					{
						str = tangible.StringFunctions.changeCharacter(str, q + r3, str.charAt(q + r2));
						str = tangible.StringFunctions.changeCharacter(str, q, rep.charAt(h));
						h++;
					}
					System.out.printf("%s",str);
					break;
				}
			}

		}
		if (result == 0)
		{
			System.out.printf("%s",str);
		}
		return 0;
	}
}

