package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String n = new String(new char[101]);
		String m = new String(new char[101]);
		int i;
		int c = 0;
		int l;
		int t = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = tempVar.charAt(0);
		}
		l = n.length();
		for (i = 0;i < l;i++)
		{
			m = tangible.StringFunctions.changeCharacter(m, i, (c * 10 + n.charAt(i) - '0') / 13 + '0');
			c = (c * 10 + n.charAt(i) - '0') % 13;
		}
		for (i = 0;i < l - 1;i++)
		{
			if (m.charAt(i) != '0')
			{
				t = i;
				break;
			}
			else
			{
				t = l - 1;
			}
		}
		for (i = t;i < l;i++)
		{
			System.out.printf("%c",m.charAt(i));
		}
		System.out.printf("\n%d\n",c);
	}
}

