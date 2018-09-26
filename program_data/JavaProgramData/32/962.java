package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int m;
		int p;
		int n;
		int i;
		int j;
		int q;
		int s;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (t = 0;t < m;t++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead("\n");
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			p = a.length();
			n = b.length();
			j = p - 1;
			for (q = n - 1;q >= 0;q--)
			{
				if (a.charAt(j) < b.charAt(q))
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) + 10 - b.charAt(q) + '0');
					a = tangible.StringFunctions.changeCharacter(a, j - 1, a.charAt(j - 1) - 1);
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - b.charAt(q) + '0');
				}
				j--;
			}
			s = 0;
			for (i = 0;i < p;i++)
			{
				if (a.charAt(i) != 0)
				{
					System.out.printf("%c",a.charAt(i));
					s = 1;
				}
				else if (s != 0)
				{
					System.out.printf("%c",a.charAt(i));
				}
			}
			System.out.print("\n");
		}
	}
}

