package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int j;
		int k;
		String n = new String(new char[50]);
		String m = new String(new char[50]);
		String s = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		k = 0;
		for (i = 0;i < n.length();i = i + 1)
		{
			if (n.charAt(i) >= 48 && n.charAt(i) <= 57)
			{
				k = k * a + n.charAt(i) - 48;
			}
			if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
			{
				k = k * a + n.charAt(i) - 55;
			}
			if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
			{
				k = k * a + n.charAt(i) - 87;
			}
		}
		if (k == 0)
		{
			System.out.print("0");
		}
		for (i = 0;k > 0;i = i + 1)
		{
			if (k % b < 10)
			{
				m = tangible.StringFunctions.changeCharacter(m, i, k % b + 48);
			}
			else
			{
				m = tangible.StringFunctions.changeCharacter(m, i, k % b + 55);
			}
			k = k / b;
		}
		i = i - 1;
		for (j = 0;i >= 0;j = j + 1)
		{
			s = tangible.StringFunctions.changeCharacter(s, j, m.charAt(i));
			i = i - 1;
		}
		for (i = 0;i < j;i = i + 1)
		{
			System.out.printf("%c",s.charAt(i));
		}

	}

}

