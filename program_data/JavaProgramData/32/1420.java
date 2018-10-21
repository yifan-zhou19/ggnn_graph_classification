package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		String m1 = new String(new char[100]);
		String m2 = new String(new char[100]);
		String n1 = new String(new char[100]);
		String n2 = new String(new char[100]);
		String sum = new String(new char[100]);
		int i;
		int mlen;
		int nlen;
		int t;
		int u;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (u = 0;u < t;u++)
		{
			for (i = 0;i < 100;i++)
			{
				sum = tangible.StringFunctions.changeCharacter(sum, i, '\0');
			}
			for (i = 0;i < 100;i++)
			{
				m1 = tangible.StringFunctions.changeCharacter(m1, i, '0');
			}
			for (i = 0;i < 100;i++)
			{
				n1 = tangible.StringFunctions.changeCharacter(n1, i, '0');
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n1 = tempVar3.charAt(0);
			}
			mlen = m1.length();
			nlen = n1.length();
			for (i = 0;i < 100;i++)
			{
				m2 = tangible.StringFunctions.changeCharacter(m2, i, '0');
			}
			for (i = 0;i < 100;i++)
			{
				n2 = tangible.StringFunctions.changeCharacter(n2, i, '0');
			}
			for (i = 0;i < mlen;i++)
			{
				m2 = tangible.StringFunctions.changeCharacter(m2, 100 - mlen + i, m1.charAt(i));
			}
			for (i = 0;i <= nlen;i++)
			{
				n2 = tangible.StringFunctions.changeCharacter(n2, 100 - nlen + i, n1.charAt(i));
			}
			for (i = 99;i >= 0;i--)
			{
				sum = tangible.StringFunctions.changeCharacter(sum, i, sum.charAt(i) + m2.charAt(i) - n2.charAt(i) + 48);
				if (sum.charAt(i) < '0')
				{
					sum = tangible.StringFunctions.changeCharacter(sum, i, sum.charAt(i) + 10);
					sum = tangible.StringFunctions.changeCharacter(sum, i - 1, sum.charAt(i - 1) - 1);
				}
			}
			for (i = 0;i < 100;i++)
			{
				if ((sum.charAt(i) != '0') && (sum.charAt(i) != '\0'))
				{
					break;
				}
			}
			for (i = i;i < 100;i++)
			{
				System.out.printf("%c",sum.charAt(i));
			}
			System.out.print("\n");
		}
	}
}

