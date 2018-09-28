package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int l;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
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
			k = a.length();
			m = b.length();
			for (j = k - 1,l = m - 1;j >= k - m,l >= 0;j--,l--)
			{
				if (a.charAt(j) >= b.charAt(l))
				{
					c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(j) - b.charAt(l) + 48);
				}
				if (a.charAt(j) < b.charAt(l))
				{
					c = tangible.StringFunctions.changeCharacter(c, j, 10 + a.charAt(j) - b.charAt(l) + 48);
					a.charAt(j - 1)--;
				}
			}
			for (j = 0;j < k - m;j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(j));
			}
			for (j = 0;j < k;j++)
			{
				System.out.printf("%c",c.charAt(j));
			}
			System.out.print("\n");
		}
			return 0;
	}


}

