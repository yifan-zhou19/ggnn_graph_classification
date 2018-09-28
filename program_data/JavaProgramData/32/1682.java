package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int flag = 0;
		String m1 = new String(new char[100]);
		String m2 = new String(new char[100]);
		String m3 = new String(new char[100]);
		String m4 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m2 = tempVar3.charAt(0);
			}
			scanf("\n");
			for (j = 0;j <= (m1.length() - m2.length() - 1);j++)
			{
				m3 = tangible.StringFunctions.changeCharacter(m3, j, '0');
			}
			m3 = tangible.StringFunctions.changeCharacter(m3, j, '\0');
			m3 += m2;
			for (j = m1.length() - 1;j >= 0;j--)
			{
				if (m1.charAt(j) < '0')
				{
					m1 = tangible.StringFunctions.changeCharacter(m1, j, m1.charAt(j) + 10);
					m1 = tangible.StringFunctions.changeCharacter(m1, j - 1, m1.charAt(j - 1) - 1);
				}
				if (m1.charAt(j) >= m3.charAt(j))
				{
					m4 = tangible.StringFunctions.changeCharacter(m4, j, m1.charAt(j) - m3.charAt(j) + '0');
				}
				else
				{
					m4 = tangible.StringFunctions.changeCharacter(m4, j, m1.charAt(j) - m3.charAt(j) + 10 + '0');
					m1 = tangible.StringFunctions.changeCharacter(m1, j - 1, m1.charAt(j - 1) - 1);
				}
			}
			for (j = 0;j <= m1.length() - 1;j++)
			{
				if (m4.charAt(j) != '0')
				{
					flag = 1;
				}
				if (flag == 1)
				{
					System.out.printf("%c",m4.charAt(j));
				}
			}
			System.out.print("\n");
		}
	}

}

