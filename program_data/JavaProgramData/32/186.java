package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int l;
		int d;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
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
			m = a.length();
			l = b.length();
			d = l;
			for (j = m - 1;j > m - d - 1;j--)
			{
				if (a.charAt(j) >= b.charAt(l - 1))
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - b.charAt(l - 1) + 48);
					l--;
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) + 10 - b.charAt(l - 1) + 48);
					a = tangible.StringFunctions.changeCharacter(a, j - 1, a.charAt(j - 1) - 1);
					l--;
				}
			}
			j = 0;
			while (a.charAt(j) == 0)
			{
				j++;
			}
			for (;j < m;j++)
			{
				System.out.printf("%c",a.charAt(j));
			}
			 System.out.print("\n");
		}
		return 0;
	}
}

