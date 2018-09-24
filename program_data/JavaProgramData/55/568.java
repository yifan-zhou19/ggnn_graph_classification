package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String n = new String(new char[100]);
		String t = new String(new char[100]);
		int a;
		int b;
		int[] s = new int[100];
		int i;
		int j;
		int m;
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		m = n.length();
		for (i = 0;i < m;i++)
		{
			if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
			{
				num = num * a + n.charAt(i) - '0';
			}
			else if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
			{
				num = num * a + n.charAt(i) - 'a' + 10;
			}
			else if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
			{
				num = num * a + n.charAt(i) - 'A' + 10;
			}
		}
		for (i = 0;num >= b;i++)
		{
			s[i] = num % b;
			num = num / b;
		}
		s[i] = num % b;
		j = i;
		for (i = 0;i <= j;i++)
		{
			if (s[i] >= 10)
			{
				t = tangible.StringFunctions.changeCharacter(t, i, s[i] - 10 + 'A');
			}
			else
			{
				t = tangible.StringFunctions.changeCharacter(t, i, s[i] + '0');
			}
		}
		for (i = j;i >= 0;i--)
		{
		System.out.printf("%c",t.charAt(i));
		}
		System.out.print("\n");


		return 0;
	}
}

