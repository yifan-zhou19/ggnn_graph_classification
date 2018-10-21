package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		String b = new String(new char[1001]);
		int[] c = new int[1001];
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
			b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0));
		for (int l = 0;l <= 1000;l++)
		{
				c[l] = 1;
			b = b.substring(0, l);
		}
		for (int i = 0;i <= a.length();i++)
		{
				if (a.charAt(i) == a.charAt(i + 1) || a.charAt(i) == a.charAt(i + 1) + 32 || a.charAt(i) == a.charAt(i + 1) - 32)
				{
					c[m]++;
				}
				else
				{
						b = tangible.StringFunctions.changeCharacter(b, m, a.charAt(i));
					m++;
				}
		}
		for (int k = 0;k < b.length();k++)
		{
			if (b.charAt(k) > 95)
			{
			b = tangible.StringFunctions.changeCharacter(b, k, b.charAt(k) - 32);
			}
			System.out.printf("(%c,%d)",b.charAt(k),c[k]);
		}
	}
}

