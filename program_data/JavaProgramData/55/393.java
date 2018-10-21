package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int m;
		int j;
		String n = new String(new char[33]);
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
		c = n.length();
		for (i = 0,m = 0;i < c;i++)
		{
			if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
			{
				m = m * a + (n.charAt(i) - '0');
			}
			else if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
			{
				m = m * a + (n.charAt(i) + 10 - 'a');
			}
			else if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
			{
				m = m * a + (n.charAt(i) + 10 - 'A');
			}
		}
		for (i = 0,n[0] = 0;m >= 0;i++)
		{
			for (j = i;j >= 0;j--)
			{
				n = tangible.StringFunctions.changeCharacter(n, j + 1, n.charAt(j));
			}
			if (m % b <= 9)
			{
				n = tangible.StringFunctions.changeCharacter(n, 0, m % b + '0');
			}
			else
			{
				n = tangible.StringFunctions.changeCharacter(n, 0, m % b + 'A' - 10);
			}
			m = m / b;
			if (m == 0)
			{
				break;
			}
		}
		System.out.printf("%s",n);
	}
}

