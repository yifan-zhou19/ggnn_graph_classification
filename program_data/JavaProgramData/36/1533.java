package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char c;
		int n1;
		int n2;
		int i;
		int j;
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
		n1 = a.length();
		n2 = b.length();
		if (n1 != n2)
		{
			System.out.print("NO");
		}
		else
		{
		for (i = 0;i < n1 - 1;i++)
		{
			if (b.charAt(i) != a.charAt(i))
			{
			for (j = i + 1;j < n1;j++)
			{
				if (b.charAt(j) == a.charAt(i))
				{
					c = b.charAt(i);
					b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
					b = tangible.StringFunctions.changeCharacter(b, j, c);
					break;
				}
			}
			}
		}
		if (b.charAt(n1 - 1) == a.charAt(n1 - 1))
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		}
		return 0;
	}
}

