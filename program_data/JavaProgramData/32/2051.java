package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int p;
		int q;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String a1 = new String(new char[100]);
		String b1 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
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
			a1 = a;
			b1 = b;
			p = a.length();
			q = b.length();
		for (i = 100 - p;i <= 99;i++)
		{
			a1 = tangible.StringFunctions.changeCharacter(a1, i, a.charAt(i - 100 + p));
		}
		for (i = 0;i <= 99 - p;i++)
		{
			a1 = a1.substring(0, i);
		}
		for (i = 100 - q;i <= 99;i++)
		{
			b1 = tangible.StringFunctions.changeCharacter(b1, i, b.charAt(i - 100 + q));
		}
		for (i = 100 - p;i <= 99 - q;i++)
		{
			b1 = tangible.StringFunctions.changeCharacter(b1, i, '0');
		}
		for (i = 0;i <= 99 - p;i++)
		{
			b1 = b1.substring(0, i);
		}
		for (i = 99;i >= 100 - p;i--)
		{
			if (a1.charAt(i) >= b1.charAt(i))
			{
				c[i] = a1.charAt(i) - b1.charAt(i) + 48;
			}
			else
			{
				c[i] = 10 + a1.charAt(i) - b1.charAt(i) + 48;
				a1.charAt(i - 1)--;
			}
		}
		for (i = 100 - p;i <= 99;i++)
		{
			System.out.printf("%c",c[i]);
		}
		System.out.print("\n");
		}
	}

}

