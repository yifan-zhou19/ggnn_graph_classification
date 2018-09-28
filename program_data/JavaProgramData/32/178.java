package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int n;
		int al;
		int bl;
		int i;
		int j;
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
			al = a.length();
			bl = b.length();
			for (i = 0;i < bl;i++)
			{
				if (a.charAt(al - 1 - i) < b.charAt(bl - 1 - i))
				{
					a = tangible.StringFunctions.changeCharacter(a, al - 1 - i, a.charAt(al - 1 - i) + 10 - b.charAt(bl - 1 - i));
					a = tangible.StringFunctions.changeCharacter(a, al - 2 - i, a.charAt(al - 2 - i) - 1);
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, al - 1 - i, a.charAt(al - 1 - i) - b.charAt(bl - 1 - i));
				}
			}
			for (i = 0;i < al - bl;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			for (i = al - bl;i < al;i++)
			{
				System.out.printf("%d",a.charAt(i));
			}
			System.out.print("\n\n");
		}
	}
}

