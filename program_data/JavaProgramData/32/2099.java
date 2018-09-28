package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int n;
		int la;
		int lb;
		int i;
		String a = new String(new char[101]);
		String b = new String(new char[101]);




		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			la = a.length();
			lb = b.length();
			for (i = 0;i < lb;i++)
			{
				if (a.charAt(la - 1 - i) >= b.charAt(lb - 1 - i))
				{
					a = tangible.StringFunctions.changeCharacter(a, la - 1 - i, a.charAt(la - 1 - i) - b.charAt(lb - 1 - i) + '0');
				}
				else if (a.charAt(la - 1 - i) < b.charAt(lb - 1 - i))
				{
					a = tangible.StringFunctions.changeCharacter(a, la - 1 - i, a.charAt(la - 1 - i) + 10 - b.charAt(lb - 1 - i) + '0');
					a = tangible.StringFunctions.changeCharacter(a, la - 2 - i, a.charAt(la - 2 - i) - 1);
				}

			}
		System.out.printf("%s\n",a);
		}
	}

}

